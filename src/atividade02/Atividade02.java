package atividade02;

import java.util.Random;

public class Atividade02 {

    public static void main(String[] args) {
        var hashSizes = new int[]{100, 191, 256, 257};
        var itemsSize = 1000;

        var rand = new Random();
        var items = new int[itemsSize];
        for (var i = 0; i < itemsSize; i++) {
            items[i] = rand.nextInt(itemsSize);
        }

        var multiplicationHash = new MultiplicationHash();
        var divisionHash = new DivisionHash();
        var myHash = new MyHash();

        for (var j = 0; j < hashSizes.length; j++) {
            multiplicationHash.create(hashSizes[j]);
            for (var i = 0; i < itemsSize; i++) {
                multiplicationHash.insert(items[i], items[i]);
            }
            System.out.println("MultiplicationHash m: " + hashSizes[j] + " numItens: " + itemsSize + " colisions: " + multiplicationHash.destroy());

            divisionHash.create(hashSizes[j]);
            for (var i = 0; i < itemsSize; i++) {
                divisionHash.insert(items[i], items[i]);
            }
            System.out.println("DivisionHash m: " + hashSizes[j] + " numItens: " + itemsSize + " colisions: " + divisionHash.destroy());

            myHash.create(hashSizes[j]);
            for (var i = 0; i < itemsSize; i++) {
                myHash.insert(items[i], items[i]);
            }
            System.out.println("MyHash m: " + hashSizes[j] + " numItens: " + itemsSize + " colisions: " + myHash.destroy());
            System.out.println();
        }
    }
}

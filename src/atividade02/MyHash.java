/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

public class MyHash extends HashBase {

    @Override
    protected int hash(int value, int m) {
        var sumDigits = sumDigits(value);

        return sumDigits % m;
    }

    private int sumDigits(int value) {
        var total = 0;
        var remainingNumber = value;

        while (remainingNumber > 0) {
            total = total + (remainingNumber % 10);
            remainingNumber = remainingNumber / 10;
        }

        return total;
    }
}

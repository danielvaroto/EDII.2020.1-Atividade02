/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

public class MultiplicationHash extends HashBase {

    @Override
    protected int hash(int value, int m) {
        var a = (Math.sqrt(5) - 1) / 2;
        var modResult = (a * value) % 1;

        return (int) Math.floor(modResult * m);
    }
}

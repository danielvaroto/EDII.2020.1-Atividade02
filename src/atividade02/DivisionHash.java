 package atividade02;

public class DivisionHash extends HashBase {

    @Override
    protected int hash(int value, int m) {
        return value % m;
    }
}

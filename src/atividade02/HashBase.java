package atividade02;

public abstract class HashBase {

    private int m;

    protected HashItem[] hashItems;
    protected int colisions;

    protected abstract int hash(int value, int m);

    public void create(int m) {
        this.hashItems = new HashItem[m];
        this.m = m;
        this.colisions = 0;
    }

    public void insert(int key, int data) {
        var hashedKey = this.hash(key, this.m);

        if (this.hashItems[hashedKey] == null) {
            this.hashItems[hashedKey] = new HashItem(key, data);
        } else {
            this.colisions++;

            var currentHashItem = this.hashItems[hashedKey];

            while (currentHashItem.next != null)
                currentHashItem = currentHashItem.next;

            currentHashItem.next = new HashItem(key, data);
        }
    }

    public Integer lookup(int key, int data) {
        var hashedKey = this.hash(key, this.m);
        var currentHashItem = this.hashItems[hashedKey];

        while (currentHashItem != null) {
            if (currentHashItem.data == data)
                return currentHashItem.data;

            currentHashItem = currentHashItem.next;
        }

        return null;
    }

    public int destroy() {
        this.hashItems = null;
        
        return this.colisions;
    }
}

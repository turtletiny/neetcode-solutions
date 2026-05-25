class MyHashSet {

    boolean[] myHashSet;

    public MyHashSet() {
        myHashSet = new boolean[1000001];
    }

    public void add(int key) {
        if (!this.myHashSet[key]) {
            this.myHashSet[key] = true;
        }
    }

    public void remove(int key) {
        if (this.myHashSet[key]){
            this.myHashSet[key] = false;
        }

    }

    public boolean contains(int key) {
        return this.myHashSet[key];
    }
}
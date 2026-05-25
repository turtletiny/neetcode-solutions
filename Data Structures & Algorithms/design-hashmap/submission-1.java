class MyHashMap {

    int[][] myMap;

    public MyHashMap() {
        this.myMap = new int[1000001][2];
    }

    public void put(int key, int value) {
        this.myMap[key][0] = 1;
        this.myMap[key][1] = value;
    }

    public int get(int key) {
        if (this.myMap[key][0] == 1) {
            return this.myMap[key][1];
        }
        return -1;
    }

    public void remove(int key) {
        this.myMap[key][0] = 0;
        this.myMap[key][1] = 0;
    }
}
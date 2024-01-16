package Hashmap;

import java.util.Arrays;

class Map {

    private int[] mySet;

    public Map() {
        this.mySet = new int[10000001];
        Arrays.fill(mySet, -1);
    }

    public void put(int key, int value) {
        mySet[key] = value;
    }

    public int get(int key) {
        return mySet[key];
    }

    public void remove(int key) {
        mySet[key] = -1;
    }

    public int[] mySet() {
        return this.mySet;
    }
}

public class MyHashMap {
    public static void main(String[] args) {
        Map map = new Map();

        for (int i = 0, j = 0; i < 10; i++, j++)
            map.put(i, j);

    }
}

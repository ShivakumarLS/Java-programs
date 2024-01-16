package Hashmap;

import java.util.Arrays;

class HashSet {
    private int[] mySet;

    public HashSet() {
        this.mySet = new int[10000001];
        Arrays.fill(mySet, 0);
    }

    public void add(int key) {
        mySet[key] = 1;
    }

    public boolean contains(int key) {
        return mySet[key] == 1;
    }

    public void remove(int key) {
        mySet[key] = 0;
    }

    public int[] mySet() {
        return this.mySet;
    }
}

public class MyHashSet {
public static void main(String[] args) {


        HashSet set=new HashSet();
        
        for (int i = 1; i <=9 ; i++) 
            set.add(i);
            
        System.out.println("\nElements in the Set: ");
        for (int j : set.mySet()) 
            if(j!=0)System.out.print(j+" ");

        System.out.println("\nChecking whether element is present or not: \n" +"5 - "+set.contains(5)+"\n6 - "+set.contains(6));
        System.out.println("\nRemoving an element from the Set: \n");
        set.remove(6);
        System.out.println("Elements after removing:\n");
        for (int k : set.mySet())
        System.out.print(k+" ");
        }
}




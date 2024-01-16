package Hashmap;

import java.util.HashMap;


public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(2, 2);
        hm.put(3, 3);
        hm.computeIfAbsent(4, v -> v + 2);
        System.out.println(hm.get(2));
        System.out.println(hm.getOrDefault(5, 0));
        System.out.println(hm.compute(3, (k, v) -> k + v));
        System.out.println(hm.computeIfPresent(4, (k,v) -> v>=3 ? v+10 :4));
        System.out.println(hm.containsKey(5));
        System.out.println(hm.replace(2, 7));
        System.out.println(hm.containsValue(5));
        System.out.println(hm.entrySet());
        System.out.println(hm.values());
        hm.put(1, hm.getOrDefault(1,0)+1);
        System.out.println(hm.get(4));
        hm.forEach((k,v) -> hm.merge(k, v, (v1,v2) -> v1+v2 ));
        hm.putIfAbsent(4, 45);
        System.out.println(hm);
        

    }
}

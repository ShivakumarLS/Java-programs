package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByFreq {

    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) {
       
        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(
                hm.entrySet());

      
        Collections.sort(
                list,
                (i1,
                        i2) -> i1.getValue().compareTo(i2.getValue()));

        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++)
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
            System.out.println(hm);
            hm = sortByValue(hm);
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int i = 0;
            while (i < entry.getValue()) {
                sb.append(entry.getKey());
                i++;
            }
        }
       
        return (sb.reverse().toString());
    }

    public static void main(String[] args) {
        String str = "tree";
        System.out.println(frequencySort(str));

    }
}

package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SortSame {

    static private List<String> getSort(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String i : arr) {
            String sort = strsort(i);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(i);
        }
        List<String> result = new ArrayList<>();
        for (List<String> i : map.values())
            result.addAll(i);
        // System.out.println(map);
        return result;
    }

    static private String strsort(String unsorted) {
        char[] sorted = unsorted.toCharArray();
        Arrays.sort(sorted);
        return String.valueOf(sorted);
    }

    public static void main(String[] args) {
        String[] sarray = { "ate", "news", "sewn", "eat" };
        System.out.println(getSort(sarray));
    }
}

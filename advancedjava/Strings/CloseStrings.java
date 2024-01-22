package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloseStrings {

    static String loasn(String aslkjm)
    {
        int num = 1,numw = 4;
        List<String> list = new ArrayList<>();
        list.add(String.format("%s->%s",num,numw));
        return String.format("%s->%s",num,numw);
    }

    public static boolean closeStrings(String word1, String word2) {
        char arr1[] = word1.toCharArray(),arr2[] = word2.toCharArray();
        Map<Character,Integer> m1 = new HashMap<>(),m2 = new HashMap<>();
        for(char i : arr1)
            m1.put(i,m1.getOrDefault(i,0)+1);
        for(char i : arr2)
            m2.put(i,m2.getOrDefault(i,0)+1);
        
        List<Integer> value1 = new ArrayList<>(), value2 = new ArrayList<>();
        for (int i : m1.values())
            value1.add(i);

        for (int i : m2.values())
            value2.add(i);
        Collections.sort(value1);
        Collections.sort(value2);
        int [] arr = {1,2,3,4};
       
        int sum =Arrays.stream(arr,1,3).sum();
        return value1.equals(value2);

    }
public static void main(String[] args) {
    System.out.println(closeStrings("cabbba","abbccc"));
}
}

package Strings;

import java.util.HashSet;
import java.util.Set;

public class Longestthree {

    static String largestGoodInteger(String num) {
        int n = num.length();
        int max = -1;
        String res = "";
        Set<String> set = new HashSet<>();
        for (int i = n; i >= 3; i--) {
            res = num.substring(i - 3, i);
            if (res.equals("" + num.charAt(i - 1) + num.charAt(i - 1) + num.charAt(i - 1)))
                set.add(res);
            else 
            res = "";
        }
        for (String i : set)
            if (Integer.parseInt(i) > max)
                res = i;
        if (res.equals("-1"))
            return "";
        return res;
    }

    public static void main(String[] args) {

        System.out.println(largestGoodInteger("42352338"));
       
     
      
        
    }
}

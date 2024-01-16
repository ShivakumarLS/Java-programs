package Strings;

import java.util.Arrays;


public class LongestCommonPrefix {

    static public String longestCommonPrefix(String [] strs)
    {
       
        Arrays.sort(strs);
        if(strs[0].length()==1)
            return strs[0];
        if(strs[0].length()==0)
            return "";
        int i=0 ,end = Math.min(strs[0].length(),strs[strs.length-1].length());
        while(i<end && strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            i++;
            
        return strs[0].substring(0,i);

    }
    public static void main(String[] args) {
        String [] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(strs));
    }
}

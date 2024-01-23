package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestNonRepeatingSubString {
    static int lengthOfLongestSubstring(String str)
    {
        int max = 0,left=0;
        String longSubString = "";

        Set<Character> set = new HashSet<>();
        for(int right =0;right<str.length();right++)
        {
            if(!set.contains(str.charAt(right)))
                {
                    set.add(str.charAt(right));
                    max = Math.max(max,right-left+1);
                    longSubString= (str.substring(left, right+1).length()>longSubString.length())? str.substring(left, right+1) : longSubString;
                }
            else{
                while (str.charAt(left)!=str.charAt(right)) {
                    set.remove(str.charAt(left++));
                }
                set.remove(str.charAt(left++));
                set.add(str.charAt(right));
            }
        }
        System.out.println(longSubString);
        return max;
    }
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lengthOfLongestSubstring(scanner.next()));
        scanner.close();
    }
}

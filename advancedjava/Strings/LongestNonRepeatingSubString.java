package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestNonRepeatingSubString {
 public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max =0,left=0;
        for(int right =0;right<s.length();right++)
        {
            if(!set.contains(s.charAt(right)))
                {
                    set.add(s.charAt(right));
                    max = Math.max(max,right-left+1);
                }
            else
            {
                while(s.charAt(left)!=s.charAt(right))
                {
                    set.remove(s.charAt(left++));
                }
                set.remove(s.charAt(left++));
                set.add(s.charAt(right));
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lengthOfLongestSubstring(scanner.next()));
        scanner.close();
    }
}

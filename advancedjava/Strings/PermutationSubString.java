package Strings;

import java.util.Arrays;


/**
 * PermutationSubString
 */
public class PermutationSubString {

    static public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = s1.length();
        int arr1[] = new int[26];

        for (char i : s1.toCharArray())
            arr1[i - 'a']++;


        while (right < s2.length()) {
            int arr2[] = new int[26];

            for (char i : s2.substring(left, right).toCharArray())
                arr2[i - 'a']++;
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            
            if (Arrays.equals(arr1, arr2))
                return true;

            else {
                left++;
                right++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "xy", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));

    }
}
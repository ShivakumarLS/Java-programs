package Strings;

import java.util.Arrays;

public class Anagram {

    static public Boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.compare(c, d)==0;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("asd", "dsa"));
    }
}

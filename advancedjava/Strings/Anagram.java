package Strings;

import java.util.Arrays;

public class Anagram {

      Boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c, d);
    }

    public static void main(String[] args) {
        System.out.println(new Anagram().isAnagram("asSDGHJKFd", "dsSHJGKFa"));
    }
}

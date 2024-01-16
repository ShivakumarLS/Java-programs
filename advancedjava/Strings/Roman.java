package Strings;

import java.util.HashMap;

public class Roman {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('D', 500);
        hm.put('C', 100);
        hm.put('M', 1000);
        char c = '0';
        int sum = 0, s1, s2;
        for (int i = 0; i < s.length(); i++) {
            s1 = hm.get(s.charAt(i));
            if (i + 1 < s.length()) {
                s2 = hm.get(s.charAt(i + 1));
                if (s1 >= s2)
                    sum += s1;
                else {
                    sum = sum + s2 - s1;
                    i++;
                }
            } else
                sum += hm.get(c);

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMXIV"));
        System.out.println(Character.isSpaceChar(' '));
    }
}

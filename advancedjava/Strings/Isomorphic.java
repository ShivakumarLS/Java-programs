package Strings;

import java.util.HashMap;


public class Isomorphic {

    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (map.containsKey(sc) )
            {
                char c = map.get(sc) ;
                if (c!=tc)
                    return false;
            }
                else if (!map.containsValue(tc))
                map.put(sc, tc);
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
}

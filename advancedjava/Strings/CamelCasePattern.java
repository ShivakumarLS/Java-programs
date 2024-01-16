package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CamelCasePattern {

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        Set<Character> patternSet = new HashSet<>();
        for (String string : queries) {
            if (string == null || pattern == null) {
                result.add(false);
                continue;
            }
            int i = 0, j = 0;
            while (i < string.length() && j < pattern.length()) {
                if (!isUpper(pattern.charAt(j))) {
                    if (!string.startsWith(pattern.substring(j), i)) {
                        result.add(false);
                        break;
                    } else {
                        i += pattern.length() - j;
                        j = 0;
                    }
                } else if (isLower(pattern.charAt(j))) {
                    if (!string.startsWith(String.valueOf(pattern.charAt(j)), i++)) {
                        result.add(false);
                        break;
                    }
                } else {
                    if (!string.startsWith(pattern.substring(j), i)) {
                        result.add(false);
                        break;
                    }
                    patternSet.add(pattern.charAt(j));
                    j++;
                    i++;
                }
            }
            if (j == pattern.length()) {
                result.add(true);
            }
        }
        return result;
    }

    private static boolean isUpper(char c) {
        return Character.isUpperCase(c);
    }

    private static boolean isLower(char c) {
        return Character.isLowerCase(c);
    }

    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        System.out.println(camelMatch(queries, "FoBaT"));
    }
}

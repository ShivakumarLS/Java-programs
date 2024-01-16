package Strings;

public class NumberOfSubstrings {

    static public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
    }

    static String subStringCount(String str) {
        int  n = str.length();
        String substr = "", palstr = "";
        int max = -1;
        for (int i = 0; i <= n; i++)
            for (int j = i; j <= n; j++) {
                substr= str.substring(i, j);
                if (str.substring(i, j).isEmpty())
                    continue;
                
                // System.out.println(str.substring(i, j));
                if (isPalindrome(substr) && substr.length() > max) {
                    max = substr.length();
                    palstr = substr;
                    System.out.println(palstr);
                }
            }

        return palstr;
    }

    public static void main(String[] args) {
        System.out.println(subStringCount("babad"));
    }
}

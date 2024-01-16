package Strings;



public class LongestPalindromic {

    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return (sb.toString()).equals(sb.reverse().toString());

    }

    static String printSubStrings(String str) {
        int max = -1;
        String longestStr = "";
         
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";

            for (int j = i; j < str.length(); j++) {
                subStr = str.substring(i, j);
                System.out.println(subStr);
                if (subStr.isBlank())
                    continue;

                else if (isPalindrome(subStr))
                    {
                    if (subStr.length() > max) {
                        max = subStr.length();
                        longestStr = subStr;
                        System.out.println(max + " " + longestStr);
                    }
                }
            }
        }

       return (str.length()==1|| isPalindrome(str)) ? str : longestStr;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(printSubStrings(s));

    }

}

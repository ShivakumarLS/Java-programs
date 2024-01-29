package Strings;

public class CheckOneSegment {
    public static boolean checkOneSegment(String s) {
        int n = s.length();
        if (n == 0 || s.contains("01"))
            return false;
        if (s.equals("1'") || (n == 1 && s.equals("1")) || (s.indexOf('1') == s.lastIndexOf('1')))
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkOneSegment("11110000")); // false
    }
}

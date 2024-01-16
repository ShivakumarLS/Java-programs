package Strings;


public class CheckOneSegment {
    public static boolean checkOneSegment(String s) {
        int n = s.length();
        if (n == 0 )
            return false;
        if(s.equals("1'"))
            return true;
        if (n == 1 && s.equals("1"))
            return true;
        if (s.indexOf('1') == s.lastIndexOf('1'))
            return true;
        if(s.contains("01"))    
            return false;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkOneSegment("01000")); // false
    }
}

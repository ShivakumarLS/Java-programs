package Strings;

public class StringbufferEg {
    
    static boolean  isPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("ASd");
        sb.append(1.2);
        sb.insert(1, "str");
        sb.append(1234);
        sb.replace(0, 3, "rep");
        
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        System.out.println(isPalindrome(sb.toString()));
    }

}

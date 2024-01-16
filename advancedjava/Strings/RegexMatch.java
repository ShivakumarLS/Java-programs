package Strings;

public class RegexMatch {

    static public boolean isMatch(String s, String p) {

        return s.matches(p);

    }

    public static void main(String[] args) {
        String a = "abasdv";
        for (char c : a.toCharArray())
        // if(a.indexOf(c)==a.lastIndexOf(c))
        {
            System.out.println(a.indexOf(c) + " " + a.lastIndexOf(c));
           
        }
    }
}

package Strings;

public class Stringbuildereg {

    static String longestpalString(String str)
    {
        String pal="";
        int n =str.length();
        for (int i=0;i<n-1;i++)
        for (int j=i+2;j<=n;j+=2){
            if ((str.charAt(i))==(str.charAt(j)))
            pal += str.substring(i,j);
            }
        return pal;
    }
    public static void main(String[] args) {
        String str="palap";
        System.out.println(str.startsWith("apl", 1));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println((sb.toString()).endsWith("ap"));
        System.out.println((sb.toString()).startsWith("pa"));
    }

}
 
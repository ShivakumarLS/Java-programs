public class ReverseString {
    
    public static void main(String [] args)
    {
        String str = "akfghja";
        String reverse ="";
        for (int i = str.length()-1;i>=0;i--)
            reverse += str.charAt(i);
        System.out.println(reverse);

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.toString().equals(sb.reverse().toString()));
    }
}

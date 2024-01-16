package Strings;

public class RemoveChar {

    public static void main(String[] args) {
        String str = "cattlesdzfgdsfg";
        String str2 = "catxfnggfcd hjnfghj";
        StringBuffer sb = new StringBuffer(str);
        sb.delete(str.indexOf(str2.charAt(0)),str.indexOf(str2.charAt(str2.length()-1)));
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (!str2.contains("" + ch))\
        //         sb.append(ch);
        // }
        
System.out.println(sb.toString());
    }
}

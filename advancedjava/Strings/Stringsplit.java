package Strings;


public class Stringsplit {

public static void main(String[] args) {
    
    String s = " hello world ";
   StringBuilder sb = new StringBuilder(s.length());
    String [] a = s.split(" ");
     for (int i=0 ;i<s.length();i++){
        if(!a[i].isEmpty())
            sb.insert(0,a[i]);
        if(i<a.length)
            sb.insert(0," ");

    // String str1 = "asd";
    // String str2 = "asd";
    // System.out.println(str1==str2);
    // System.out.println(str1.equals(str2));
    }

}

}

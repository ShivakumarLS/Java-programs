package Strings;

import java.util.HashMap;

public class KAnagrams {
static public  boolean isKanagram(String str1 ,String str2,int k)
{
    int count = 0;
    if(str1.length()<k || str2.length()<k)
        return false;
    int [] chars = new int [26];
    for(char ch : str1.toCharArray())
        chars[ch - 'a']++;

    for(char ch : str2.toCharArray())
        if(chars[ch - 'a']>0)
            chars[ch-'a']--;
            
    for ( int i :chars)
        count+=i;
    return (count<=k);
}
public static void main(String[] args) {
    System.out.println(isKanagram("geeks", "xhhfe", 9 ));

}
}

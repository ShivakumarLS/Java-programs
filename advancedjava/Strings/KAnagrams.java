package Strings;

import java.util.HashMap;

public class KAnagrams {
static public  boolean isKanagram(String str1 ,String str2,int k)
{
    int count = 0;
    HashMap<Character,Integer> map = new HashMap<>();
    for(char ch : str1.toCharArray())
        {
            map.putIfAbsent(ch,0);
            map.compute(ch,(p,v) -> v+1);
        }
    for(char ch : str2.toCharArray())
        if (map.getOrDefault(ch, 0) > 0) 
            map.put(ch, map.get(ch) - 1);
  
    for ( int i : map.values())
        count+=i;
    return !(count>k);
}
public static void main(String[] args) {
    System.out.println(isKanagram("geeks", "xkjuii", 5));

}
}

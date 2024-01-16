package Strings;

import java.util.HashMap;


/**
 * MakeEqual
 */
public class MakeEqual {

    static public boolean makeEqual(String [] words)
    {
        if(words.length ==1)
            return true;
        
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(String i : words)
            for(char c : i.toCharArray())
                    charCount.put(c,charCount.getOrDefault(c,0)+1);
        for(int i : charCount.values())
            if(i!=0)
                return false;
        return true;
    }
    public static void main(String[] args) {

    }
}
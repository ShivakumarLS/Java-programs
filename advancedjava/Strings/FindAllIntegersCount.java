package Strings;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numDifferentIntegers(String str) {
        String tillNow = "";
        Set<String> set = new HashSet<>();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) 
            {
                flag = true;

                if (tillNow.length()==0 && str.charAt(i) == '0')
                    continue;
                tillNow += str.charAt(i);
                if(i==str.length()-1 && flag && !set.contains(tillNow))
                    set.add(tillNow);
                
                
            
            }

            else {
                if (!set.contains(tillNow) && flag) {
                        set.add(tillNow);
                    tillNow = "";
                    flag = false;
                }
            }
        }
        return set.size();
    }
}

public class FindAllIntegersCount {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numDifferentIntegers("Plus One"));
        System.out.println(s.numDifferentIntegers("-123asd456sdafgsdfg321sadf312asd3216354168432165413206541321"));
        System.out.println(s.numDifferentIntegers("a0a"));
    }
}

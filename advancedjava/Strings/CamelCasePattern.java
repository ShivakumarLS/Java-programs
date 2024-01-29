package Strings;

import java.util.ArrayList;
import java.util.List;

public class CamelCasePattern {

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        
        for (String string : queries) {
            if (string == null || pattern == null) {
                result.add(false);
                continue;
            }
        }
       
        List<String> patterns = getPatterns(pattern);
        outer : for(String str : queries)
        {
            List<String> strs = getPatterns(str);
            if(strs.size()!=patterns.size())
                {
                    System.out.println(strs);
                    result.add(false);
                    continue;
                }
            for(int i =0;i<strs.size();i++)
                {
                    System.out.println(strs.get(i)+" "+patterns.get(i));
                    if(!strs.get(i).startsWith(patterns.get(i)))
                        {
                            result.add(false);
                            continue outer;
                        }   

                }
            result.add(true);
        }
        return result;
    }

    private static List<String> getPatterns(String pattern)
    {
        List<String> patterns = new ArrayList<>();
        int start = 0;
        for(int i =1;i<pattern.length();i++)
            {
                if(isUpper(pattern.charAt(i))){
                    patterns.add(pattern.substring(start, i));
                    start = i;
            }
                    }
                patterns.add(pattern.substring(start, pattern.length()));
        return patterns;
    }
    private static boolean isUpper(char c) {
        return Character.isUpperCase(c);
    }

    public static void main(String[] args) {
        String[] queries = {"Foo","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        System.out.println(camelMatch(queries, "F"));
    }
}

package Stack;

import java.util.HashMap;
import java.util.Stack;

public class validParanthesis {

    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < str.length(); i++) 
        {
            char cur = str.charAt(i);
            if (map.values().contains(cur)) 
                {
                    stack.push(cur);
                    continue;
                }

            if (stack.isEmpty())
                return false;

            if (map.get(cur) !=  stack.pop())
                return false;
        }
    return stack.isEmpty();
    }

    public static void main(String[] args) {

        String yes = "(())", no = "(()[]()";
        System.out.println(isValid(yes) + " " + isValid(no));

    }
}

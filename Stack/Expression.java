package Stack;

import java.util.Stack;

public class Expression {

    static int postfix(String str) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                stk.push(Character.getNumericValue(ch));
            } else {
                int val2 = stk.pop();
                int val1 = stk.pop();
                int res = 0;
                switch (ch) {
                    case '+' -> {
                        res = val1 + val2;
                        break;
                    }
                    case '-' -> {
                        res = val1 - val2;
                        break;
                    }
                    case '*' -> {
                        res = val1 * val2;
                        break;
                    }
                    case '/' -> {
                        res = val1 / val2;
                        break;
                    }
                }
                stk.push(res);
            }
        }
        return stk.peek();
    }

    static int prefix(String str) {
        Stack<Integer> stack = new Stack<>();
        for (int i = str.length()-1; i >-1; i--) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                stack.push(Character.getNumericValue(ch));
            else {
                // System.out.println(stack.toString())
                int val1 = stack.peek();
                stack.pop();
                int val2 = stack.peek();
                stack.pop();
              
                int result = 0;
                switch ((char)ch) {
                    case '+' -> result = val2 + val1;
                    case '-' -> result = val2 - val1;
                    case '*' -> result = val2 * val1;
                    case '/' -> result = val2 / val1;
                }
               
                stack.push((int) result);
              
            }

        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "85+3-";
        System.out.println(postfix(str));
        System.out.println(prefix("-1+9*26"));
    }

}

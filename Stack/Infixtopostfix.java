package Stack;

import java.util.Stack;

public class Infixtopostfix {

    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<Character>();
        String str = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch))
                str += ch;
            else if (ch == '(')
                stack.push(ch);
 
            // If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (ch == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    str += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
           
            else {
                while (!stack.isEmpty() && (precedence(ch) <= precedence((stack).peek()))) {
                    str += stack.pop().toString();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            str += stack.pop().toString();
        }
        return str;
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(infixToPostfix("2+(3+6)*2"));
    }
}

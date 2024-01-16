package Stack;

import java.util.Stack;

public class Ispalindrome {

    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
            stack.push(str.charAt(i));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            System.out.println(stack.peek());
            if (str.charAt(i) == stack.peek())
                stack.pop();
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {

        Ispalindrome is = new Ispalindrome();
        System.out.println(is.isPalindrome("abac"));

    }

}

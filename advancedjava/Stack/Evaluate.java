package Stack;

import java.util.Stack;

public class Evaluate {

    static int evaluate(char[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i : nums) {
            if (Character.isDigit(i))
                stack.push(Character.getNumericValue(i));
            else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch (i) {
                    case '+':
                        stack.push(op2 + op1);
                        break;
                    case '-':
                        stack.push(op2 - op1);
                        break;
                    case '*':
                        stack.push(op2 * op1);
                        break;
                    default:
                        stack.push(op2 / op1);
                        break;
                }
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        char[] nums = { '2', '3', '+', '5', '-' };
        System.out.println(evaluate(nums));
    }
}

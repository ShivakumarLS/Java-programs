package Stack;

import java.util.Stack;

public class reverse {

    static Stack<Integer> stack = new Stack<>();

    static void insertbottom(int x) {
        if (stack.isEmpty())
            stack.push(x);
        else {
            int p = stack.peek();
            stack.pop();
            insertbottom(x);
            stack.push(p);
        }
    }
    static void reverseStack()
    {
        if(stack.size()>0)
            {
            int p = stack.peek();
            stack.pop();
            reverseStack();
            insertbottom(p);
            }
    }
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
            stack.push(i);
            System.out.println(stack.toString());
        reverseStack();
        System.out.println(stack.toString());
    }

}

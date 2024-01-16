package Strings;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node() {

    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class ReverseLinkedList {

    // reverse a linked list using stack
    public static Node reverse(Node head) {
        Stack<Integer> s = new Stack<>();
        while (head != null) {
            s.push(head.data);
            s.get(0);
            head = head.next;
        }
        Node result = new Node();
        int i = 0;
        while (!s.isEmpty()) {
            if (i == 0) {
                result.data = s.pop();
                result.next = null;
            } else {
                Node temp = new Node();
                temp.data = s.pop();
                temp.next = result;
                result = temp;
            }

        }
        return head;
    }

}


public class PairSwap {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next, third = second.next;
        second.next = head;
        head.next = swapPairs(third);
        return second;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 1; i < 6;) {
            temp.next = new ListNode(++i);
            temp = temp.next;
        }
        
        printList(head);
        swapPairs(head);
        printList(head);
    }

    static private void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

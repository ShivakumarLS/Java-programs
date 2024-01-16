package LinkedList;

class Node 
    {
        int data;
         Node next;
        Node prev;

        Node(int data,Node next,Node prev)
        {
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
        
        
    }

public class DoubleList {
    public static Node insertEnd(Node head ,int data)
        {
            Node node=new Node(data,null,null);
            if (head == null)
                head = node;
            else
            {
                Node temp = head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=node;
                node.prev=temp;
            }
            return head;
        }
    
        public static void print(Node head)
        {
            if(head == null)
                System.out.println("List Empty");

            for(Node temp = head;temp!=null;temp=temp.next)
                System.out.print(temp.data+" ");
            System.out.println();
            
        }
public static void main(String[] args) {
    Node head =null;
    head=insertEnd(head,20);
    head=insertEnd(head,30);
    print(head);
   
}
    
}

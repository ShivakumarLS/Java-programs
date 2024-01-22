import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MyDeque {

    int[] deQueue;
    int currentSize, maxSize, front, rear;

    public MyDeque(int size) {
        this.deQueue = new int[size];
        this.maxSize = size;
        this.currentSize = 0;
        this.front = 0;
        this.rear = -1;
    }

    // Add an element at the end of Dequeue
    void addLast(int x) {
        if (isFull()) {
            System.out.println("Overflow! Cannot add " + x);
            return;
        } else {
            rear++;
            if (rear == maxSize)
                rear = 0;
            deQueue[rear] = x;
            currentSize++;
        }
    }

    void addFirst(int x) {
        if (isFull()) {
            System.out.println("Overflow! Cannot add " + x);
            return;
        }
        front--;
        if (front == -1)
            front = maxSize - 1;
        deQueue[front] = x;
        currentSize++;
    }

    int removeLast() {
        if (isEmpty()) {
            System.out.println("UnderFlow! Cannot remove ");
            return -1;
        }
        int x = deQueue[rear--];
        if (rear == -1)
            rear = maxSize - 1;
        currentSize--;
        return x;
    }

    int getFirst() {
        return (isEmpty()) ? -1 : deQueue[front];
    }

    int getLast() {
        return (isEmpty()) ? -1 : deQueue[rear];
    }

    boolean isFull() {
        return (currentSize == maxSize);
    }

    // Remove an element from the beginning of Dequeue
    int removeFirst() {
        if (isEmpty()) {
            System.out.println("Underflow! Cannot remove");
            return -1;
        } else {
            int x = deQueue[front];
            front++;
            if (front == maxSize)
                front = 0;
            currentSize--;
            return x;
        }
    }

    void display()
    {
        for(int i = front ;i<=rear;i++)
            System.out.println(deQueue[i]);
    }
    boolean isEmpty() {
        return currentSize == 0;
    }
    
    public static void main(String[] args) {
        MyDeque dq = new MyDeque(10);
        dq.addLast(1);
        dq.addLast(2);
        // System.out.printf("%d ", dq.getFirst());
        
        // System.out.printf("%d ", dq.getLast());
        
        dq.addFirst(23);
        dq.addFirst(34);
        
        dq.display();
       Deque<Integer>  dQ = new ArrayDeque<>();
       dQ.addLast(1);
       dQ.addLast(2);
       dQ.addFirst(32);
       dQ.addFirst(89);
    //    for (Integer integer : dQ) {
    //     System.out.println(integer);
    //    }
       System.out.println(Arrays.toString(dQ.toArray()));
    }
}

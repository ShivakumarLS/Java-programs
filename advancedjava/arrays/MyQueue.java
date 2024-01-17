/**
 * Queue
 */
public class MyQueue {

    private int[] queue;
    private int front; // front of the queue
    private int rear;
    private int currentSize;
    private int maxSize;

    public MyQueue(int size) {
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.maxSize = size;
        this.currentSize = 0;
    }

    void insert(int item) {
        if (isFull()) {
            System.out.println("queue full");
            return;
        }
        if (rear == maxSize - 1)
            rear = -1;

        queue[++rear] = item;
        currentSize++;
    }

    int delete() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        int temp = queue[front++];
        if (front == maxSize)
            front = 0;
        currentSize--;
        return temp;

    }

    int peek()
    {
        return queue[front];
    }

    private boolean isFull() {
        return currentSize == maxSize;
    }

    private boolean isEmpty() {
        return currentSize == 0;
    }
    
    public void printQueue()
    {
        if (isEmpty()) {
            System.out.println("empty queue");
           
        }
        for(int i = front;i<=rear;i++)
            System.out.printf("%s  ",queue[i]);
    } 
public static void main(String[] args) {
    MyQueue queue = new MyQueue(10);  
    queue.insert(2);  
    queue.insert(3);  
    System.out.println("Item deleted from queue: " + queue.delete());  
    System.out.println("Item deleted from queue: " + queue.delete());  
    queue.insert(5);      
    queue.insert(1);
    queue.insert(2);
    queue.insert(3);      
    for(int i =0;i<4;i++)
        queue.delete();
    queue.printQueue();
}
}
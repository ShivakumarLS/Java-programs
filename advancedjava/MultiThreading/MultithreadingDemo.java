package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    // Shared counter
    private volatile int counter = 0;

    // Synchronization using the synchronized keyword
    public synchronized void synchronizedIncrement() {
        counter++;
    }

    // Synchronization using explicit locks
    private final Lock lock = new ReentrantLock();

    public void lockIncrement() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    // Using volatile to ensure visibility
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public void printFlag() {
        System.out.println("Flag: " + flag);
    }

    public int getCounter() {
        return this.counter;
    }
}

class IncrementerThread implements Runnable {
    private final SharedResource sharedResource;

    public IncrementerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Uncomment the desired method to see the effect
            // sharedResource.synchronizedIncrement();
            // sharedResource.lockIncrement();

            // Simulate some work
            try {
                Thread.sleep(100);
                sharedResource.lockIncrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FlagSetterThread implements Runnable {
    private final SharedResource sharedResource;

    public FlagSetterThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        // Simulate some work
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Uncomment the line below to see the effect of the volatile keyword
        sharedResource.setFlag();
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();

        Thread incrementerThread1 = new Thread(new IncrementerThread(sharedResource));
        // IncrementerThread incrementerThread2 = new IncrementerThread(sharedResource);
        Thread flagSetterThread =  new Thread(new FlagSetterThread(sharedResource));

        incrementerThread1.start();
        // incrementerThread2.start();
        flagSetterThread.start();

        incrementerThread1.join();
        // incrementerThread2.join();
        flagSetterThread.join();

        // Uncomment the line below to see the effect of the volatile keyword
        sharedResource.printFlag();

        System.out.println("Final Counter Value: " + sharedResource.getCounter());
    }
}

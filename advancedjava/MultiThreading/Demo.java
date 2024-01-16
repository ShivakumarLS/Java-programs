package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class SharedResource {
    private volatile int counter = 0;

    public synchronized void incrementCounter() {
        counter++;
    }

    private final Lock lock = new ReentrantLock();

    public void lockIncrementCounter() {
        lock.lock();
        try {
            System.out.println("Synchronised method called");
            counter++;
        } finally {
            lock.unlock();
        }

    }

    public void lockDecrementCounter() {
        try {
            lock.lock();
            counter--;
        } finally {
            lock.unlock();
        }
    }

    public int  getCounter() {
        return this.counter;
    }
}

class ThreadDemo1 extends Thread {
    private SharedResource sharedResource;

    public ThreadDemo1(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++)
            sharedResource.incrementCounter();   
    }
}

class ThreadDemo2 extends Thread {
    private SharedResource sharedResource;

    public ThreadDemo2(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        int i = 3;
        while (i > 0) {
            sharedResource.lockDecrementCounter();
            i--;
        }
    }

}

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        final SharedResource sharedResource = new SharedResource();
        Thread thread1 = new ThreadDemo1(sharedResource);
        Thread thread2 = new ThreadDemo2(sharedResource);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final Counter Value: " + sharedResource.getCounter());
    }
}

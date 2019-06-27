package com.testing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implement custom blocking queue
 * @author Niloy
 */
public class MyBlockingQueue<E> {
    private int max;
    private Queue<E> queue;
    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public MyBlockingQueue(int size) {
        this.max = size;
        this.queue = new LinkedList<>();
    }

    public void put(E item) throws InterruptedException {
        lock.lock();
        try {
            while (max == queue.size()) {
                notFull.await();
            }
            queue.add(item);
            notEmpty.signalAll();
            ;
        } finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == 0) {
                notEmpty.await();
            }
            E item = queue.remove();
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }
    }
}

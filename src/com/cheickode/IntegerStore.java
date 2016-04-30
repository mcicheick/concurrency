package com.cheickode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sissoko on 30/04/2016.
 */
public class IntegerStore implements Store<Integer> {
    private int length;
    private Integer[] buffer;
    private int size;
    private Lock lock = new ReentrantLock();
    private Condition producerCondition = lock.newCondition();
    private Condition consumerCondition = lock.newCondition();

    public IntegerStore(int length) {
        this.length = length;
        this.buffer = new Integer[length];
        this.size = 0;
    }

    @Override
    public void push(Integer value) {
        lock.lock();
        try {
            while (isFull()) {
                producerCondition.await();
            }
            buffer[size++] = value;
            consumerCondition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Integer pop() {
        lock.lock();
        try {
            while (isEmpty()) {
                consumerCondition.await();
            }
            Integer value = buffer[--size];
            buffer[size] = null;
            producerCondition.signal();
            return value;
        } catch (InterruptedException e) {
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return size() == length;
    }
}

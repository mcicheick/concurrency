package com.cheickode.store;

/**
 * Created by sissoko on 30/04/2016.
 */
public abstract class Consumer<T> extends Thread {
    protected Store<T> store;
    protected int maxConsummation;

    public Consumer(Store<T> store, int maxConsummation) {
        this.store = store;
        this.maxConsummation = maxConsummation;
    }

    protected abstract void consume(T t);

    public final void work() {
        T t = store.pop();
        consume(t);
    }

    @Override
    public void run() {
        for (int i = 0; i < maxConsummation; i++) {
            work();
        }
        System.out.printf("Consumer %s has finished\n", getDisplay());
    }

    public String getDisplay() {
        return String.format("%s", getName());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Consumer %s has finished\n", getDisplay());
    }
}

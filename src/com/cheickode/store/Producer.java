package com.cheickode.store;

/**
 * Created by sissoko on 30/04/2016.
 */
public abstract class Producer<T> extends Thread {
    protected Store<T> store;
    protected int maxProduction;

    public Producer(Store<T> store, int maxProduction) {
        this.store = store;
        this.maxProduction = maxProduction;
    }

    protected abstract T produce();

    public final void work() {
        T t = produce();
        store.push(t);
    }

    @Override
    public final void run() {
        for (int i = 0; i < maxProduction; i++) {
            work();
        }
        System.out.printf("Producer %s has finished\n", getDisplay());
    }

    public String getDisplay() {
        return String.format("%s", getName());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Producer %s has finished\n", getDisplay());
    }
}

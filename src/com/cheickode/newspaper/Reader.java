package com.cheickode.newspaper;

/**
 * Created by sissoko on 30/04/2016.
 */
public abstract class Reader<T extends Book> extends Thread {
    protected Library<T> library;
    protected int maxRead;

    public Reader(Library<T> library, int maxRead) {
        this.library = library;
        this.maxRead = maxRead;
    }

    protected abstract void read(T t);

    protected final void work() {
        int index = (int) (library.size() * Math.random());
        T t = library.get(index);
        try {
            synchronized (t) {
                while (!t.isAvailable()) {
                    t.wait();
                }
                t.setReading();
                read(t);
                t.setAvailable();
                t.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < maxRead; i++) {
            work();
        }
    }
}

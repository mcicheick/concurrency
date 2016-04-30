package com.cheickode.newspaper;

/**
 * Created by sissoko on 30/04/2016.
 */
public abstract class Writer<T extends Book> extends Thread {
    protected Library<T> library;
    protected int maxWrite;

    /**
     * @param library
     * @param maxWrite
     */
    public Writer(Library<T> library, int maxWrite) {
        this.library = library;
        this.maxWrite = maxWrite;
    }

    protected abstract void write(T t);

    protected final void work() {
        int index = (int)(library.size() * Math.random());
        T t = library.get(index);
        try {
            synchronized (t) {
                while (!t.isAvailable()) {
                    t.wait();
                }
                t.setWriting();
                write(t);
                t.setAvailable();
                t.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public final void run() {
        for (int i = 0; i < maxWrite; i++) {
            work();
        }
    }

    @Override
    public String toString() {
        return String.format("%s", getName());
    }
}

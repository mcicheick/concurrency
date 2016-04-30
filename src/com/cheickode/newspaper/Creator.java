package com.cheickode.newspaper;

/**
 * Created by sissoko on 30/04/2016.
 */
public abstract class Creator<T extends Book> extends Thread {

    protected Library<T> library;
    protected int maxWrite;

    /**
     * @param library
     * @param maxWrite
     */
    public Creator(Library<T> library, int maxWrite) {
        this.library = library;
        this.maxWrite = maxWrite;
    }

    protected abstract T create();

    protected final void work() {
        T t = create();
        library.add(t);
    }

    @Override
    public void run() {
        for (int i = 0; i < maxWrite; i++) {
            work();
        }
    }
}

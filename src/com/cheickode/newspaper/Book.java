package com.cheickode.newspaper;

import com.cheickode.newspaper.impl.StringBook;

/**
 * Created by sissoko on 30/04/2016.
 */
public abstract class Book {

    public static StringBook Null() {
        return new StringBook("");
    }

    enum State {
        WRITING, READING, AVAILABLE
    }

    protected String title;

    protected int updated = 0;

    protected int read = 0;

    protected State state;

    public Book(String title) {
        this.title = title;
        this.state = State.AVAILABLE;
    }

    protected void setReading() {
        state = State.READING;
    }

    protected void setWriting() {
        state = State.WRITING;
    }

    protected void setAvailable() {
        state = State.AVAILABLE;
    }

    public boolean isAvailable() {
        return state == State.AVAILABLE;
    }

    public void update() {
        updated++;
    }

    public void read() {
        read++;
    }

    @Override
    public String toString() {
        return String.format("%s update = %d, read = %d", title, updated, read);
    }
}

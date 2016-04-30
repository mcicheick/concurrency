package com.cheickode;

/**
 * Created by sissoko on 30/04/2016.
 */
public interface Store<T> {
    void push(T t);

    T pop();

    int size();

    boolean isEmpty();

    boolean isFull();
}

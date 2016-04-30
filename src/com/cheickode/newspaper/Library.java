package com.cheickode.newspaper;

/**
 * Created by sissoko on 30/04/2016.
 */
public interface Library<T extends Book> {
    T get(int i);

    void add(T t);

    int size();

    boolean isEmpty();
}

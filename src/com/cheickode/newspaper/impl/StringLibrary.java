package com.cheickode.newspaper.impl;

import com.cheickode.newspaper.Book;
import com.cheickode.newspaper.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sissoko on 30/04/2016.
 */
public class StringLibrary implements Library<StringBook> {

    private List<StringBook> buffer;

    public StringLibrary() {
        buffer = new ArrayList<>();
    }

    @Override
    public StringBook get(int i) {
        if(isEmpty()) {
            return Book.Null();
        }
        StringBook value = buffer.get(i);
        return value;
    }


    @Override
    public void add(StringBook book) {
        buffer.add(book);
    }

    @Override
    public int size() {
        return buffer.size();
    }

    @Override
    public boolean isEmpty() {
        return buffer.isEmpty();
    }
}

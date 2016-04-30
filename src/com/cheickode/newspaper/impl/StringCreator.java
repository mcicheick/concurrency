package com.cheickode.newspaper.impl;

import com.cheickode.newspaper.Creator;
import com.cheickode.newspaper.Library;

/**
 * Created by sissoko on 30/04/2016.
 */
public class StringCreator extends Creator<StringBook> {
    private static int counter = 0;

    /**
     * @param library
     * @param maxWrite
     */
    public StringCreator(Library<StringBook> library, int maxWrite) {
        super(library, maxWrite);
    }

    @Override
    protected StringBook create() {
        StringBook book = new StringBook("Book-" + (++counter));
        System.out.printf("%s created\n", book);
        return book;
    }
}

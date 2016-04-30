package com.cheickode.newspaper.impl;

import com.cheickode.newspaper.Library;
import com.cheickode.newspaper.Reader;

/**
 * Created by sissoko on 30/04/2016.
 */
public class StringReader extends Reader<StringBook> {

    public StringReader(Library<StringBook> library, int maxRead) {
        super(library, maxRead);
    }

    @Override
    protected void read(StringBook book) {
        System.out.printf("%s Reading...\n", toString());
        try {
            sleep(1 * 1000);
        } catch (InterruptedException e) {
        }
        book.read();
        System.out.printf("%s\n", book);
    }
}

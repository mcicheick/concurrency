package com.cheickode.newspaper.impl;

import com.cheickode.newspaper.Library;
import com.cheickode.newspaper.Writer;


/**
 * Created by sissoko on 30/04/2016.
 */
public class StringWriter extends Writer<StringBook> {
    /**
     * @param library
     * @param maxWrite
     */
    public StringWriter(Library<StringBook> library, int maxWrite) {
        super(library, maxWrite);
    }

    @Override
    protected void write(StringBook book) {
        System.out.printf("%s Updating...\n", toString());
        try {
            sleep(1 * 1000);
        } catch (InterruptedException e) {
        }
        book.update();
    }
}

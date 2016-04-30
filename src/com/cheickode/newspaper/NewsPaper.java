package com.cheickode.newspaper;

import com.cheickode.newspaper.impl.StringCreator;
import com.cheickode.newspaper.impl.StringLibrary;
import com.cheickode.newspaper.impl.StringReader;
import com.cheickode.newspaper.impl.StringWriter;

/**
 * Created by sissoko on 30/04/2016.
 */
public class NewsPaper {

    public static void main(String[] args) {
        Library library = new StringLibrary();
        new StringCreator(library, 5).start();
        new StringCreator(library, 5).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringWriter(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
        new StringReader(library, 10).start();
    }
}

package com.cheickode;

import com.cheickode.store.impl.IntegerConsumer;
import com.cheickode.store.impl.IntegerProducer;
import com.cheickode.store.impl.IntegerStore;
import com.cheickode.store.Store;

public class Main {

    public static void main(String[] args) {
        Store store = new IntegerStore(100);
        new IntegerConsumer(store, 100).start();
        new IntegerConsumer(store, 100).start();
        new IntegerConsumer(store, 100).start();
        new IntegerProducer(store, 300).start();
        new IntegerConsumer(store, 100).start();
        new IntegerConsumer(store, 100).start();
        new IntegerConsumer(store, 100).start();
        new IntegerProducer(store, 300).start();
    }
}

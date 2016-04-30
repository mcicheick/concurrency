package com.cheickode;

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

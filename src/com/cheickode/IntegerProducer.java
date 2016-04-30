package com.cheickode;

import java.util.Random;

/**
 * Created by sissoko on 30/04/2016.
 */
public class IntegerProducer extends Producer<Integer> {

    public IntegerProducer(Store<Integer> store, int maxProduction) {
        super(store, maxProduction);
    }

    @Override
    protected Integer produce() {
        Integer value = new Random().nextInt(100);
        System.out.printf("%s Produce %d\n", getDisplay(), value);
        return value;
    }
}

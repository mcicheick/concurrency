package com.cheickode;

/**
 * Created by sissoko on 30/04/2016.
 */
public class IntegerConsumer extends Consumer<Integer> {

    public IntegerConsumer(Store<Integer> store, int maxConsummation) {
        super(store, maxConsummation);
    }

    @Override
    protected void consume(Integer value) {
        System.out.printf("%s Consume %d\n", getDisplay(), value);
    }
}

package Cuncurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ValueStorage {
    public static AtomicInteger value = new AtomicInteger();

    public static void incrementValue() {
        value.incrementAndGet();
    }

    public static int getValue() {
        return value.intValue();
    }
}

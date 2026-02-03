package com.mjc813.machine;

public class Calu {
    public long add(int... items) {
        long re = 0L;

        for (int i = 0; i < items.length; i++) {
            re += i;
        }return re;
    }
}

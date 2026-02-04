package com.mjc813;

public class Calculator {
    public long add(int...arrs){
        long re = 0L;
        for(int a : arrs) {
            re += a;
        }
        return re;
    }
    public double di(int...arrs){
        double re = arrs[0];
        for (int i = 1; i< arrs.length; i++){
            re /= arrs[i];
        }
        return re;
    }
}

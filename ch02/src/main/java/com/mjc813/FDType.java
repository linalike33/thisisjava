package com.mjc813;

public class FDType {
    public void usrFDType() {
        float f1 = 0.1234567890123456f;
        double f2 = 0.1234567890123456;
        System.out.println("f1:" + f1);
        System.out.println("f2:" + f2);

        double f3 = 3e6;
        float f4 = 3e6F;
        double f5 = 2e-3;
        System.out.println("f3:" + f3);
        System.out.println("f4:" + f4);
        System.out.println("f5:" + f5);
    }
}
package com.mjc813.ch07;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Calculator객체의 areaCircle()실행");
        return Math.PI * r * r;
    }
}

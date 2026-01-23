package com.mjc813;

public class Calculator {
    void power0n(){
        System.out.println("전원을 켭니다");
    }
    void poweroff(){
        System.out.println("전원을 끕니다");
    }
    int plus (int x, int y){
        int result = x + y;
        return result;
    }
    double divide(int x, int y){
        double result = (double) x/(double) y;
        return result;
    }
}

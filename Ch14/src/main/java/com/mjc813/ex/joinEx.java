package com.mjc813.ex;

public class joinEx {
    public static void main(String[]args){
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        }catch (InterruptedException e){
        }
        System.out.print("1~100합:"+sumThread.getSum());
    }
}

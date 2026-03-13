package com.mjc813.Repor3;

public class WorkerrTh implements Runnable {
    @Override
    public void run(){
        for (int i = 4; i <= 6; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("[작업스레드]" + i + "x" + j + "=" + i * j);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {

                }
            }
        }
    }
}


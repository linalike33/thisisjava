package com.mjc813.Repor3;

public class WorkkerrThh extends Thread{
    @Override
    public void run(){ //작거나 같다라고 해야 9번까지 끝
        for (int i = 7; i <= 9; i++) {
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

package com.mjc813.Repor2;

public class WorkerThread implements Runnable {
    @Override
    public void run(){ //start()가 새로운 일꾼을 현장으로 보내는 '출동 명령'이라면, run()은 그 일꾼이 현장에서 실제로 해야 할 '작업 내용' 그 자체이다
        for (int i = 5; i < 9; i++) {
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

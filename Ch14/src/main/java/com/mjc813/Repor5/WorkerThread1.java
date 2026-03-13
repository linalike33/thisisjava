package com.mjc813.Repor5;

public class WorkerThread1 extends Thread{
    //합계스레드
    public void run(){
        int sum = 0;
        for(int n : nums) sum += n;
        System.out.print("[합계] 결과:"+sum);
    }

}

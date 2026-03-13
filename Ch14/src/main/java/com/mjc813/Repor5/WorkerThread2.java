package com.mjc813.Repor5;

public class WorkerThread2 extends Thread{
    public void run(){
        //평균
        int sum = 0;
        for(int n : nums) sum += n;
        double aver =(double) sum/nums.length;
        System.out.print("[평균] 결과:"+aver);
    }
}

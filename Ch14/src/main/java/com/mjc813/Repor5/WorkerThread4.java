package com.mjc813.Repor5;

public class WorkerThread4 extends Thread {
    public void run(){
        for(int n: nums){
            if(n%2!=0){
                System.out.print(n);
            }
        }
    }
}

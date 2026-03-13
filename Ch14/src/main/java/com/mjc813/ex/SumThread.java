package com.mjc813.ex;

public class SumThread extends Thread{
    private long sum;

    public long getSum(){
        return sum;
    }
    private void setSum(long sum){
        this.sum =sum;
    }
    @Override
    public void run(){
        for(int i=1; i<=100; i++){
            sum+=i;
        }
    }
}

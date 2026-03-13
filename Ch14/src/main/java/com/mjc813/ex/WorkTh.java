package com.mjc813.ex;

public class WorkTh extends Thread{
    public boolean work = true;

    public WorkTh(String name){
        setName(name);
    }

    @Override
    public void run(){
        while (true){
            if(work) {
                System.out.print(getName() + ":작업처리");
            }else {
            Thread.yield();
            }
        }
    }
}

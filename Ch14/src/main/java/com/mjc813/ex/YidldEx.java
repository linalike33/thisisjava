package com.mjc813.ex;

public class YidldEx {
    public static void main(String[] args){
        WorkTh workTh = new WorkTh("A");
        WorkTh workTh1 = new WorkTh("B");
        workTh.start();
        workTh1.start();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
    }
        workTh.work =false;

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        workTh1.work =true;        }
}

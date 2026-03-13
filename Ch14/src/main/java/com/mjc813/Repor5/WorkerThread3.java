package com.mjc813.Repor5;

import java.util.Arrays;
//오름차순정렬
public class WorkerThread3 extends Thread{
    public void run(){
       Arrays.sort(nums);
       System.out.print(Arrays.toString(nums));
    }
}

package com.mjc813;

public class CCarr {
    String model;
    int speed;

    CCarr(String model){
        this.model =model;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    void run(){
        this.setSpeed(100);
        System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h");
    }
}

package com.mjc813;

public class Car1 {
    int ges;

    void setGes(int gea){
        this.ges = gea;
    }
    boolean is(){
        if(ges == 0){
            System.out.println("ges가 없습니다");
            return false;
        }
        System.out.println("ges가 있습니다");
        return true;
    }
    void run(){
        while (true){
            if(ges>0){
                System.out.println("달립니다.(ges)잔량:"+ges+")");
                ges -= 1;
            }else{
                System.out.println("멈춥니다.(ges)잔량:"+ges+")");
                return;
            }
        }
    }
}

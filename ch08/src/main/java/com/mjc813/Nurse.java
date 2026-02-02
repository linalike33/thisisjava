package com.mjc813;

public class Nurse {
    static final double DAILY_DOSAGE = 3;


    public void rest(Animal animal){
        System.out.println("약을 먹여야합니다.");
        for(int i = 1; i <= DAILY_DOSAGE; i++){
            System.out.println("["+i+"회차] 약을 먹어야합니다");

        }
    }
}

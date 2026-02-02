package com.mjc813;

public class Nurse implements CareNU {

    static final double DAILY_DOSAGE = 3;


    @Override
    public void rest(Animal animal){
            System.out.println("환자 정보를 확인합니다.");
            for (int i = 1; i <= DAILY_DOSAGE; i++) {
                System.out.println("[" + i + "회차] 약을 먹어야합니다");

            }
        }
    }


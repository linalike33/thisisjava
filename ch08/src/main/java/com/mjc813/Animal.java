package com.mjc813;

import java.time.LocalDate;

public class Animal {
    String name; //이름
    String id; //식별번호
    LocalDate day; //입원날짜
    String doctorName; //의사이름
    LocalDate day1;//퇴원날짜
    String joj; //주인이름
    int dayyne; //면회횟수

    public Animal(String name, String id, String doctorName, String joj, int dayyne) {
        this.name = name;
        this.id = id;
        this.doctorName = doctorName;
        this.joj = joj;

    }

    public boolean Canout(int dayyne, String joj) {
        if (!joj.equals(this.joj)) {
            System.out.println("주인만 면회가 가능합니다");
            return false;
        }
        if(dayyne >= 15 && dayyne < 20){
           return true;
        }System.out.println("면회 가능시간이 아닙니다.");
        return false;

    }

}




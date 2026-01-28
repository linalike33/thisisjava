package com.mjc813.ch07;

public abstract class Phoneee {
    String owner;
    Phoneee(String owner){
        this.owner = owner;
    }
    void tur(){
        System.out.println("폰 전원을 켭니다.");
    }
    void off(){
        System.out.println("폰 전원을 끕니다");
    }
}

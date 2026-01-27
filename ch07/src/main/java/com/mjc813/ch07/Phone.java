package com.mjc813.ch07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {
    public String model;
    public String color;

//    public Phone(){
//        System.out.println("Phone() 생성자 실행");
//    } //부모클래스가 기본 생성자를 가지고 있는 경우
public Phone(String model,String color) {
    this.model = model;
    this.color = color; //부모클래스가 매개변수를 갖는 생성자가 있는 경우
    System.out.println("Smarphone(String model,String color)생성자 실행");
}

    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    public void sendvoidce(String messange){
        System.out.println("본인:"+messange);
    }
    public void receiveVoice(String messange){
        System.out.println("상대방:"+messange);
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다");
    }
}

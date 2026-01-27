package com.mjc813.ch07;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmartPhone extends Phone{
    public boolean wifi;
    public SmartPhone(String model,String color){
        //super();
        //this.model = model;
        //this.color = color; //부모클래스가 기본생성자를 가지고 있는 경우
        super(model,color);
        System.out.println("Smarphone(String model,String color)생성자 실행됨");
        //부모 클래스가 매개변수를 갖는 생성자가 있는 경우
    }

//    public void isWifi() {
//      System.out.println("인터넷을 연결합니다.");
//    }
//
//    public void setWifi(boolean wifi) {
//        this.wifi = wifi;
//        System.out.println("와이파이 상태를 변경했습니다.");
//    }
}

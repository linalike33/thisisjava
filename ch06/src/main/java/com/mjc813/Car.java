package com.mjc813;

public class Car {
    String company ="현대자동차";
    String model="그랜저"; //데이터를 저장해 기억장치의 역할을 할 수 있도록 필드 선언을 한다 또한 반드시 클래스 블록에 선언되야한다
    String color="검정";
    int  maxSpeed=790;
    int speed;
//    Car( String company,String model,String color,int  maxSpeed,int speed){
     Car(){}
     Car(String model){
        // this.model = model;
         this(model,"은색",250);
     }
    Car(String model, String color){
//        this.model = model;
//        this.color = color;
        this(model,color,250);
    }
    Car(String model, String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }
    }


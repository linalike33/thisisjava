package com.mjc813.ch07;

public class Rabbit extends Aanimal{

    @Override
    void breathe(){
        System.out.println("토끼가 숨을 쉽니다");
    }
    @Override
    public Object eat(Aanimal obj){
    if (obj instanceof Swam){
        System.out.println("토끼가 백조를 먹습니다");
        return obj;
    }
    return null;
    }

}

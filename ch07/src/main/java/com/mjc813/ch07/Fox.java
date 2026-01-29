package com.mjc813.ch07;

public class Fox extends Aanimal{
    @Override
    void breathe(){
        System.out.println("여우가 숨을 쉽니다");
    }
    @Override
    public Object eat(Aanimal obj){
        if (obj instanceof Rabbit Swam){
            System.out.println("여우가 백조 토끼 두 마리를 먹습니다");
            return obj;
        }
        return null;
    }

}


package com.mjc813.ch07;

public class Tiger extends Aanimal{
    @Override
    void breathe(){
        System.out.println("호랑이가 숨을 쉽니다");
    }
    @Override
    public Object eat(Aanimal obj){
        if (obj instanceof Rabbit){
            System.out.println("호랑이가 토끼를 먹습니다");
            return obj;
        }
        return null;
    }

}


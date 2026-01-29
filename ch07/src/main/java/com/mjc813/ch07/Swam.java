package com.mjc813.ch07;

public class Swam extends Aanimal {
    @Override
    void breathe() {
        System.out.println("백조가 숨을 쉽니다");
    }

    @Override
    public Object eat(Aanimal obj) {
        System.out.println("백조는 아무것도 먹지 않습니다. (채식주의자)");
        return null;
    }
}

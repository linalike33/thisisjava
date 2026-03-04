package org.example;

@FunctionalInterface //추상 메서드를 딱 하나만 가지도록 강제해서, 람다식(Lambda)으로 편리하게 쓸 수 있게 해주는 자바의 안전 장치입니다.
public interface Calculable {
    void calculate(int x, int y);
}

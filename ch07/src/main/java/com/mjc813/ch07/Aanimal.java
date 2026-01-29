package com.mjc813.ch07;

abstract class Aanimal {
    //Animal 클래스에는 Object eat(Animal obj) 추상메소드를 선언한다.
    //	그리고 void breathe() 추상메소드를 선언한다.
    //	아래의 클래스는 Animal 추상클래스를 상속하여 만든다.
    //	Rabbit 클래스, Tiger 클래스, Fox 클래스, Swam 클래스
    //	각 4개의 클래스를 여러분의 상상에 맡겨서 추상메소드를 재정의 하세요.
    //	Rabbit 은 Swam 만 먹는다.
    //	Tiger 는 Rabiit 만 먹는다.
    //	Fox 는 Swam, Rabbit 만 먹는다.
    //	Swam 클래스는 Animal 을 먹지 못한다.
    //	그외에는 상상에 따라 소스 코딩을 하세요.
    abstract Object eat(Aanimal obj);

    abstract void  breathe();


}

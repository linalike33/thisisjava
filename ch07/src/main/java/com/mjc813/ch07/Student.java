package com.mjc813.ch07;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Person{
    public  int studenNO;

    public Student(String name, int studenNO) {
        super(name);
        this.studenNO = studenNO;

    }
    public void study(){
        System.out.println("공부를 합니다");
    }
}

package com.mjc813.ch07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentClass extends UsClass{
    public String name; //학생이름
    public int ma; //성적

    public StudentClass(){}
    public StudentClass(String name,String cal,int ma){
        this.name = name;
        this.cal = cal;
        this.ma = ma;
    }
    public void printInfo(){
        System.out.println("-----------학생정보----------");
        System.out.println("학생이름: "+name);
        System.out.println("과목: "+cal);
        System.out.println("성적: "+ ma +"("+getGrade()+")");
    }
    public String getGrade() {
        if (ma >= 90) return "A";
        if (ma >= 80) return "B";
        if (ma >= 70) return "C";
        if (ma >= 60) return "D";
        return "F";
    }
}

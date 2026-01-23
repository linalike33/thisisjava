package com.mjc813;

public class Phone {
    //스마트폰에 대해서 Java클래스로 선언하고 객체 2개를 만들어 보세요
    //객체2개는 갤럭시 S25+, 아이폰 14 Pro 입니다. 속성들과 기능들은 여러분들의 상상에 맡깁니다.
    String uu = "SKT";   //유통사
    String ph;          //핸드폰 기종
    double dis ;        //디스플레이
    int dat;            //배터리
    String us;          //연결포트

    public Phone(String p, double d  , int a,String u){
        ph = p;
        dis = d;
        dat = a;
        us = u;
    }
}


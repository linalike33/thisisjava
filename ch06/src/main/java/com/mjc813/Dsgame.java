package com.mjc813;

public class Dsgame {
    //git 의 Html폴더의 0108-1.html 파일을 실행하면 닌텐도 게임 CRUD html/css/javascript 화면이 있습니다.
    //그 화면의 데이터들을 Java 클래스로 선언하고 객체들로 만들어 보세요.
    String title;             // 게임제목
    String genre;            // 장르 (액션, 스포츠, RPG 등)
    String rating;   // 등급 (전체이용가 등)
    int price;       // 가격
    String imageU;

    Dsgame(){}
    Dsgame(String title,String genre,String rating,int price,String imageU){
        this.title =  title;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
        this.imageU = imageU;
    }

}

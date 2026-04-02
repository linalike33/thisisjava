package com.mjc813.petap.pet.dto;

import lombok.*;

import java.time.LocalDate;

@Getter //데이터를 꺼내는
@Setter //데이터를 넣는 입구
@NoArgsConstructor //빈 상자를 하나 만드는 기본 생성자
@AllArgsConstructor //모든 변수를 다 넣는 생성자 그런 빈 상자에 내용물을 넣어 상자를 만드는 생성자
@ToString //변수 내용을 출력하는
public class petDto implements IPet { //화면과 서버 사이에서 데이터를 실어나르는 데이터 무겁지 않게 딱 화면에 보여줄 것만 담은것(정보)
    private  Integer id;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private LocalDate birth;
    private String imgFile;
}

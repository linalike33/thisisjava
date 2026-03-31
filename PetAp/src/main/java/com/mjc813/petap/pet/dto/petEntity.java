package com.mjc813.petap.pet.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "pet_tbl") //jpa 에게 이건 자바 클래스 모양 그대로 MYSQL(DB)에 pet_tbl 이런 이름에 데이블을 만들어달라고 하는 것이다
//데이터베이스의 설계도 즉 데이터 저장용(화면에 올라가지 않는)
public class petEntity { //데이터 베이스 테이블과 똑같이 생긴 실제 데이터 모델 JPA 가 DB 에 넣어달라고 하면 이걸 보고 데이블을 만든다
                        // DB 는 데이터가 저장되는 공간이기 때문에 함부로 고치면안되고 서비스 안에서 조심스럽게 다뤄야한다
    @Id //기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 번호를 매길수 잇도록하는
    private Integer id;

    @Column(length = 50, nullable = false) //Column DB 컬럼 마다 규칙을 정해준것이다
    private String name;

    @Column(length = 30, nullable = false)
    private String species;

    @Column(length = 100, nullable = false)
    private String breedy;

    @Column(length = 1, nullable = false)
    private String gender;

    @Column
    private LocalDate birth;

    @Column(length = 500, nullable = true)
    private String imgFile;




}

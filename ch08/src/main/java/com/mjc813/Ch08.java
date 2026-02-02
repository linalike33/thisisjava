package com.mjc813;

public class Ch08 {
    public void HosEx(){

//아래 동물병원의 입원실에 근무하는 간호사의 생활을 클래스로 구현해보세요
//동물병원의 환자는 고양이, 앵무새, 대형견, 소형견, 토끼 만을 받아 들입니니다.
//간호사는 입원한 동물환자의 입원날짜, 담당의사, 퇴원날짜, 주인이름을 기록해야 합니다.
//간호사는 동물환자들에게 매일 3번 이름과 식별번호로 구분하여 약을 먹여야 합니다.
//동물환자들은 주인에 대해서만 하루 중에 15시~20시까지 1번만 면회가 가능합니다.
//위의 내용을 상속,추상클래스,인터페이스 없이 최대 1시간만 사용해서 설계해 보세요
//다 작성하면 commit, push 하세요

    Nurse nurse = new Nurse();

    Cat mycat = new Cat("고양이","A1","의사","주인",7);
    System.out.println("----동물병원 관리 시스템----");


    nurse.rest(mycat);

    System.out.println("\n---면회 신청 현황---");
    int rest = 17;
    String joj = "주인";

    if(mycat.Canout(rest, joj)){
        System.out.println("면회 허용");
    }else {
        System.out.println("면회할 수 없습니다");
    }
    }
}

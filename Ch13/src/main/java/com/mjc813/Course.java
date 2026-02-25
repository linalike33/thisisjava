package com.mjc813;

public class Course {
    public static void registerC(Applicant<?>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"" +
                "이(가) Course1을 등록함");
    }
    public static void regusterC1(Applicant<? extends  Student>
                                  applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+
                "이(가) Course2를 등록함" );
    }
    public static void regusterC2(Applicant<? super Woerker>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+
                "이(가) Course3를 등록함");
    }
}

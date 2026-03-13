package com.mjc813.Repor4;

public class In extends Thread {
    public static String str = "";
    //변수로 객체 생성 없이 접근이 가능하며 하나의 문자열을 공유하는 빈 문자열로 초기화된 클래스 변수
    // 공유

    @Override
    public void run() {
        while (!str.equals("")) { //조건문으로 처음에 빈칸이라 종료되어 바로버리고 무한루프를 돌면서 글자를 써주기까지 기다림
           System.out.print(str);
        }
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
    }
}
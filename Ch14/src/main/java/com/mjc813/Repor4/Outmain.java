package com.mjc813.Repor4;

import java.util.Scanner;

public class Outmain {
    public static void main(String[] args) {
        In in = new In();
        in.setDaemon(true); //데몬스레드 주스레드(메인스레드) 가 종료되면 따라서 종료된다
        in.start();

        Scanner scanner = new Scanner(System.in);
        System.out.print("글자를 입력하세요");
        while (true){
            System.out.print("입력>>>");
            //[입력 대기] 사장님은 여기서 형님이 엔터 칠 때까지 기다립니다.
            // 하지만! 알바생은 옆에서 자기 할 일(In.str 확인)을 계속 하고 있습니다.
            String tr = scanner.nextLine();
            if(tr.equalsIgnoreCase("끝"))break;

             //[핵심 포인트] 입력받은 글자(tr)를 알바생네 게시판(In.str)에 '배달'합니다.
            // 이 줄이 없으면 알바생은 사장님이 뭘 입력했는지 평생 모릅니다!
            In.str = tr;

        }
    }
}

package com.mjc813;

import java.util.Scanner;

public class chapter04 {
    public static void  Third01() {
        String grade = "B";
        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        System.out.println("score1:" + score1);
    }
    public static void Third02(){
        //for문을 이용해 1부터 100까지ㅣ 정수중 3의 배수
        int sum = 0;
        for (int i = 1; i <= 100; i+=3){
            sum = sum + i ;
        }
        System.out.println("3의 배수의 합:"+sum);
    }public static void Third03() {
        //두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고 눈의 합이 5가 아니면 계속 주사위를 던지고
        //눈의 합이 5이면 실행하는 코드를 작성 ( 1,4 ), ( 4, 1 ), ( 2, 3 ), ( 3, 2 )
        int num = (int)(Math.random()*5)+1;
        int num2 = (int)(Math.random()*5)+1;

        System.out.println("("+num+")"+"("+num2+")");

        while (num + num2 == 5){
            System.out.println("합이 5");
            return;
        }

    }
    public static void Third04(){
        //중첩for문을 이용하여 방정식 4x + 5y = 60 모든 해를 구해서 (x,y) 형태로 출력하는 코드를 작성 xy는 10이하의 자연수이다
    }
    public static void Third05(){
        //for문으로
        String star = ""; //값을 저장둘 빈 바구니
        for(int i = 1; i <= 5; i++){
            star = star + "*";
            System.out.println(star);
        }
    }
    public static void Third06(){
        //while Scanner nextLine
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.println("선택> ");

            // [메뉴 입력] 사용자가 키보드로 친 번호를 '글자' 형태로 일단 가져옵니다.
            String strNum = scanner.nextLine();

           //선택지 판단
            if (strNum.equals("1")) { // 만약 "1"번(예금)을 골랐다면?
                System.out.print("예금액> ");

                // [번역 및 입금] 키보드로 친 글자(예: "5000")를 진짜 숫자(5000)로 바꿔서 돈을 저장합니다.
                int money = Integer.parseInt(scanner.nextLine());
                balance = balance + money; // 원래 있던 금고(balance)에 새 돈을 합칩니다.
                System.out.println("정상적으로 입금되었습니다.");

            } else if (strNum.equals("2")) { // 만약 "2"번(출금)을 골랐다면?
                System.out.print("출금액> ");

                // [번역 및 출금] 글자를 숫자로 바꾼 뒤, 금고에서 그만큼을 뺍니다.
                int money = Integer.parseInt(scanner.nextLine());
                balance = balance - money; // 금고에서 돈을 꺼내갑니다.
                System.out.println("정상적으로 출금되었습니다.");

            } else if (strNum.equals("3")) { // 만약 "3"번(잔고 확인)을 골랐다면?
                // [현황 보고] 현재 금고(balance)에 남아있는 숫자를 보여줍니다.
                System.out.println("현재 잔고= " + balance + "원");

            } else if (strNum.equals("4")) { // 만약 "4"번(종료)을 골랐다면?
                // [전원 끄기] 스위치를 false로 바꿉니다. 그러면 다음번에 while문이 멈추게 됩니다.
                run = false;
            } else {
                // [예외 처리] 1, 2, 3, 4가 아닌 다른 걸 눌렀을 때 안내해 줍니다.
                System.out.println("잘못된 번호입니다. 다시 눌러주세요.");
            }
        }
        System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
    }
}



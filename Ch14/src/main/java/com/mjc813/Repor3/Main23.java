package com.mjc813.Repor3;


public class Main23 {
//    개인과제2번 처럼 main 에서 2~3단까지 구구단을 출력하고
//    첫번째 스레드는 Runnable 인터페이스를 구현하는 클래스이며 4~6단을 출력하고
//    두번째 스레드는 Thread 클래스를 상속하는 클래스이며 7~9단을 출력해야 한다.
//	3개의 스레드는 동시에 실행되도록 해야 한다.
//    이 출력의 모든 행들은 50ms 쉬었다가 출력하도록 해야 한다.
public static void main(String[] args){
 Thread thread = new Thread(new WorkerrTh());
 Thread thread1 = new WorkkerrThh();

 thread.start();
 thread1.start();

    for (int i = 2; i <= 3; i++) {
        for (int j = 1; j <= 9; j++) {
            System.out.println("[메인스레드]" + i + "x" + j + "=" + i * j);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }
}

}


package com.mjc813.ex;

import java.awt.*;

public class ch14 {
    //작업스레드를 고용하지않고 메인스레드 혼자 일을하는 싱글 스레드 상황
    //따라서 이전코드가 끝나고 띵띵띵이 출력된다
    public void BeepPrintEx() {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkite 도구 상자 어떤 작업을 할 때 필요한 기능을 모아놓은
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    //멀티 스레드로 동시에 일어난다
    public void BeeprinEx() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

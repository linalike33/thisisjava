package com.mjc813;

import java.awt.*;

public class ch14 {
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
}

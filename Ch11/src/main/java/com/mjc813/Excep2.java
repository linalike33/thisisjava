package com.mjc813;

public class Excep2 {
    public static void printL(String data) {
        try {
            int re = data.length();
            System.out.println("문자 수:" + re);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("마무리실행");
        }
    }
}


package com.mjc813;

public class StringType {
    public void usrStringType() {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는\"자바\"를 배웁니다";

        str = "번호\t이름\t";
        System.out.println("나는\n");
        System.out.println("자바를\n");
        System.out.println("배웁니다");

        String str1 = "" +
                "{\n" +
                "\t\"id\":\"겨울\",\n" +
                "\t\"name\":\"눈송이\",\n" +
                "}";
        String str2 = """
                {
                  "id":"겨울",
                  "name":눈송이라네요"
                 }
                """;
        System.out.println(str1);
        System.out.println("------------------------------------");
        System.out.println(str2);
        System.out.println("------------------------------------");

    }
}
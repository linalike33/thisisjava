package com.mjc813;

public class Chapter03 {
    public static void Third01() {
        int x = -100;
        x = -x;
        System.out.println("x:" + x);

        byte b = 100;
        int y = -b;
        System.out.println("y:" + y);

        int i = 10;
        int n = 10;
        int z;
        i++;
        ++i;
        System.out.println("i=" + i);

        System.out.println("---------------------------------");
        n--;
        --n;
        System.out.println("n=" + n);

        System.out.println("---------------------------------");
        z = x++;
        ;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("---------------------------------");
        z = ++x;

        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("---------------------------------");
        z = ++x + n++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("n=" + n);

    }

    public static void Third02() {
        byte v1 = 10;
        byte v2 =4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1:"+result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2:"+result2);

       double result3 = (double) v1/v3;
        System.out.println("result3:"+result3);

        int result4 = v1 % v2;
        System.out.println("result4:"+result4);
    }
    public static void Third03(){
        byte var1 = 125;
        for(int i=0; i<5; i++){
            var1++;
            System.out.println("var1:"+var1);
        }
        System.out.println("-----------------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++){
            var2--;
            System.out.println("var2:"+var2);
        }
    }
    public static void Third04(){
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개의 남은 양:"+ result);
    }
    public int equationFirst(int a, int b) {
        // ax + b = 0  =>  ax = -b  =>  x = -b / a
       // int x = -b / a;
        //return x;
        return -b / a;
    }
    public static void Third05(){
        int x = 5;
        double y = 0.0;
        double z = x/y;
        // double z = x%y;
        System.out.println(z + 2);

        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else {
            System.out.println(z+2);
        }
    }
    public static void Third06(){
       int num1 = 10;
       int num2 = 10;
       boolean res1 = (num1 == num2);
       boolean res2 = (num1 != num2);
       boolean res3 = (num1 <= num2);
       System.out.println("res1:" + res1);
       System.out.println("res2:" + res2);
       System.out.println("res3:" + res3);

       char char1 = 'A';
       char char2 = 'B';
       boolean res4 = (char1 < char2);
       System.out.println("res4:" + res4);

       int num3 = 1;
       double num4 =1.0;
       boolean res5 = (num3 == num4);
       System.out.println("res5:"+ res5);

       float num5 = 0.1f;
       double num6 = 0.1;
       boolean res6 = (num5 == num6);
       boolean res7 = (num5 ==(float) num6);
       System.out.println("res6:"+ res6);
       System.out.println("res7:"+ res7);

        String str1 = "자바";
        String str2 = "java";
        boolean res8 = (str1.equals(str2));
        boolean res9 = (! str1.equals(str2));
        System.out.println("res8:"+ res8);
        System.out.println("res9:"+ res9);

    }
    public static void Third07(){
        int ch = 'A';

        if((65<=ch)& (ch <= 90)){
            System.out.println("대문자이군요.");
        }
        if((97<=ch)&& (ch <= 122)){
            System.out.println("소문자이군요.");
        }
        if((48<=ch)&& (ch <= 57)){
            System.out.println("0~9 숫자이군요");
        }
        int value = 6;
        if((value%2 ==0)| (value % 3== 0)){
            System.out.println("2 또는 3의 배수이군요");
        }
        boolean re = (value%2 == 0)||(value%3==0);
        if(!re){
            System.out.println("2또는 3의 배수가 아니군요");
        }

    }
    public static void Third08(){
        System.out.println("45 & 25 =" +(45 & 25));
        System.out.println("45 | 25 =" +(45 | 25));
        System.out.println("45 ^ 25 =" +(45 ^ 25));
        System.out.println("~45 = " +(~45));
        System.out.println("----------------------------------------------");

        Byte re = -120;

        int un1 = re & 255;
        System.out.println(un1);

        int un2 = Byte.toUnsignedInt(re);
        System.out.println(un2);

        int test = 136;
        byte bt = (byte) test;
        System.out.println(bt);

    }
    public static void Third09(){
        int va = 772;

        byte byte1 = (byte) (va>>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값"+int1);


        byte byte2 = (byte) (va>>> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번째 바이트 부호 없는 값"+int2);

        byte byte3 = (byte) (va>>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값"+int3);

        byte byte4 = (byte) va;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값"+int4);


    }
    public static void Third010(){
        int re = 0;
        re +=10;
        System.out.println("re="+re);
        re -=5;
        System.out.println("re="+re);
        re *=3;
        System.out.println("re="+re);
        re /=5;
        System.out.println("re="+re);
        re %=3;
        System.out.println("re="+re);

    }
    public static void Third011(){
        int so = 85;
        char gr = (so > 90)? 'A':((so > 80)?'B':'c');
        System.out.println(so+"점은"+gr+"등급입니다");
    }
}

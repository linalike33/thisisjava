package com.mjc813;

public class Matter {
    public static void matter01(){
        int x = 10;
        int y = 20;
        int z = (++x)+(y--);
        System.out.println(z);

    }
    public  static void matter02(){
        int score =85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);
    }
    public  static void matter03(){
        int pencils = 534;
        int students = 30;

        int pecilsPerStudent = (pencils/students);
        System.out.println(pecilsPerStudent);

        int pen = (pencils % students);
        System.out.println(pen);
    }
    public static void matter04(){
        int value = 356;
        System.out.println(value/100*100);
    }
    public static void matter05(){
        int lengthTop = 5;
        int lenfgthBo = 10;
        int heigjt = 7;
        double area =(double) ((lengthTop+lenfgthBo)) * heigjt/2;
        System.out.println(area);
    }
    public static void matter06() {
        int x = 10;
        int y = 5;

        System.out.println( (x>7) && (y<=5) );
        System.out.println( (x%3 == 2) || (y%2 != 1) );
    }
    public static void matter07(){
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if(Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        }else{
            double result = z + 10;
            System.out.println("결과:"+result);
        }
    }
     public static void  matter08(){
        int i = 0, j = 100;
        for (; i <= 50 && j >= 50;){

        }
     }

}

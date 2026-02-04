package com.mjc813;

import java.lang.reflect.Array;

public class Ch11 {
    public static void Excp(){
        String[] array = {"100","1oo"};
        for(int i = 0; i<=array.length;i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("arry["+i+"]"+value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨"+e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음"+e.getMessage());
            }
        }
    }
    public static void Excp2(){
        String[] array = {"100","1oo"};
        for(int i = 0; i<=array.length;i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("arry["+i+"]"+value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨"+e.getMessage());
            }catch (Exception e){
                System.out.println("실행에 문제가 있습니다");
            }
        }
    }
    public static void Excp3(){
        String[] array = {"100","1oo",null};
        for(int i = 0; i<=array.length;i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("arry["+i+"]"+value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨"+e.getMessage());
            }catch (NullPointerException|NumberFormatException e){
                System.out.println("데이터에 문제가 있음"+e.getMessage());
            }
        }
    }

}

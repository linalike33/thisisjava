package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class packaging {
    private Object[] list = new Object[10];
    private int index = -1;

    public void add(Object obj) {
        if ( index >= this.list.length - 1 ) {
            return;
        }
        this.list[++index] = obj;
    }

    public Object remove() {
        if ( index < 0 ) {
            return null;
        }
        return this.list[index--];
    }

}

//Object 로 다형성을 이용하여 멤버변수 처리할경우
//public class 바구니 {
//    private Object 묶음;
//    public Object get묶음() {
//        return this.묶음;
//    }
//    public set묶음(Object m) {
//        this.묶음 = m;
//    }
//}

//Packaging 데이터형 객체에 String 2~3 개를 add 와 remove 를 해보세요.
//Packaging 데이터형 객체에 Human 2~3 개를 add 와 remove 를 해보세요.
//add 하라: box.add("데이터")를 호출해서 배열의 빈칸을 채우라는 뜻입니다.

//remove 하라: box.remove()를 호출해서 마지막에 넣은 데이터를 다시 밖으로 빼내라는 뜻입니다.

//GenericPackaging 클래스를 Generic 만들어 보세요
//GenericPackaging 데이터형 객체에 String 2~3 개를 add 와 remove 를 해보세요.
//GenericPackaging 데이터형 객체에 Human 2~3 개를 add 와 remove 를 해보세요.


package com.mjc813;

import com.mjc813.CRUD.Grade;
import com.mjc813.CRUD.NintendoGame;
import com.mjc813.CRUD.gameitem;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        MainPackaging m = new MainPackaging();
//       // m.doSome();
//        //m.Generic();
//
//        ch13 c = new ch13();
//        c.ArrayList();
//        //c.GenericEx();
//        //c.HashMapEx();
//        //c.LinkedListEx();
//        //c.HashSet();
//        //c.HashSetEx();

        gameitem<NintendoGame> gemes = new gameitem<>();

        System.out.println("=======게임 데이터 추가=======");
        gemes.add(new NintendoGame("별의 커비", Grade.AGE12_OVER, 7800));
        gemes.add(new NintendoGame("동물의 숲",Grade.ALL,37000));
        gemes.add(new NintendoGame("마리오 카트",Grade.AGE15_OVER,28000));

        System.out.println("현재 등록된 게임의 전체 갯수: "+gemes.size());


    }
}
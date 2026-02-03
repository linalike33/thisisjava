package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        MyClass stu = new MyClass("이순신", "mjc9283819", major.Computer);
        TransJson tj = new TransJson();
        //Trans2

        String strJson = tj.toJsonStringFromObject(stu);
        System.out.println(strJson);

        Object res = tj.toObjectFromJsonString(strJson, MyClass.class);
        if ( res instanceof MyClass stu2 ) {
            System.out.println(stu2);
        }
        System.out.println(tj.hashCode());
        System.out.println(res.hashCode());
    }
}
package com.mjc813;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ch12 {
    public void Hash(){
        Set<String>set =new HashSet<>();

        set.add("Jave");
        set.add("Ja");
        set.add("Jav");
        set.add("Jave");
        set.add("String");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("Ja")){
                iterator.remove();
            }
        }
       System.out.println();

        set.remove("Jav");
        for(String element : set){
            System.out.println(element);
        }
    }
    public void MenberEx(){
        Set<Menber> set = new HashSet<Menber>();

        set.add(new Menber("홍길동",30));
        set.add(new Menber("홍길동",30));

        System.out.println("총 객체 수:"+set.size());
    }
    public void Equale(){
        Meeeber obj1 = new Meeeber("blue");
        Meeeber obj2 = new Meeeber("blue");
        Meeeber obj3 = new Meeeber("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1 과obj2는 동등합니다 ");
        }else {
            System.out.println("obj1과 obj2는 동등하지 않습니다");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj1 과obj3는 동등합니다 ");
        }else {
            System.out.println("obj1과 obj3는 동등하지 않습니다");
        }

    }
    public void StuEx(){
      Student s1 = new Student(1,"홍길동");
      Student s2 = new Student(1,"홍길동");

      if(s1.hashCode()==s2.hashCode()){
          if(s1.equals(s2)){
              System.out.println("동등객체입니다");
          }else {
              System.out.println("데이터가 다르므로 동등 객체가 아닙니다");
          }
      }else {
          System.out.println("해시코드가 다르므로 동등 객체가 아닙니다");
      }


    }
    public void ToSr(){
        SmartPhone a = new SmartPhone("삼성전자","안드로이드");

        String str = a.toString();
        System.out.println(str);

        System.out.println(a);
    }
    public void RecordEx(){
        Record m = new Record("Winter","눈송이",25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());

        System.out.println();

        Record m1 = new Record("Winter","눈송이",25);
        Record m2 = new Record("Winter","눈송이",25);
        System.out.println("m1.hashCode():"+m1.hashCode());

        System.out.println("m2.hashCode():"+m2.hashCode());
        System.out.println("m1.equale(m2):"+m1.equals(m2));
    }
    public void Exit(){
        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i == 9){
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }

    }
    public void Striggg(){
        String date = new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(3,4)//3번 위치부터 4번 위치 직전까지 글자를 지운다 D
                .toString();

    }
//    public void To(){
//        String dat ="홍길동&이수홍,박연수";
//        String[]arr =dat.split("&|,");
//        for(String token:arr){
//
//        }
//        System.out.println();
//        String date ="홍길동/이수홍/박연수";
//        while (st.hasMoreToKens()){
//            String token = st.next.Token();
//            System.out.println(token);
//        }
    }
}

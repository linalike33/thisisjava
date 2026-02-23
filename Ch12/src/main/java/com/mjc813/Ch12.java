package com.mjc813;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

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
    public void BoxingUp(){
        Integer obj = 100;
        System.out.println("value:" + obj.intValue());

        int value = obj;
        System.out.println("value:"+value);

        int result = obj + 100;
        System.out.println("re:"+result);
    }
    public void ValueCo(){
        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println("=="+(obj1 == obj2));
        System.out.println("equals():"+obj1.equals(obj2));
        System.out.println();

        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==:" +(obj3 == obj4));
        System.out.println("equals:"+obj3.equals(obj4));
    }
    public void MathE(){
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("v1="+v1);
        System.out.println("v2="+v2);

        long v3 = Math.max(3,7);
        long v4 = Math.min(3,7);
        System.out.println("v3="+v3);
        System.out.println("v4="+v4);

        double va = 12.3456;
        double te = va * 100;
        long te2 = Math.round(te);
        double v5 = te2 / 100.0;
        System.out.println("v5="+v5);
    }
    public void Date() {
        Date now = new Date();
        String st = now.toString();
        System.out.println(st);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String str = sdf.format(now);
        System.out.println(str);
    }
    public void Simp(){
        Date now = new Date();

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(s.format(now));

        s = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(s.format(now));

        s = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(s.format(now));

        s = new SimpleDateFormat("오늘은 E요일");
        System.out.println(s.format(now));

        s = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(s.format(now));

        s = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(s.format(now));


    }
    public void Patten(){
        String reg = "(02|010)-\\d{3,4}-\\d{4}";
        String date = "010-123-456";
        boolean re = Pattern.matches(reg,date);
        if(re){
            System.out.println("정규식과 일치합니다");
        }else {
            System.out.println("정규삭과 일치하지않습니다");
        }
        reg = "\\w+@\\w+\\.\\w+(\\.\\w)?";
        date = "aojdlkf@kzsglkjmlz";
        re = Pattern.matches(reg,date);
        if(re){
            System.out.println("정규삭과 일치합니다");
        }else{
            System.out.println("정규식과 일치하지 않습니다");
        }
    }
    public void GenricE(){
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer>box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }

    }
//개인과제1 : p526 ~ p562 까지의 예제를 직접 소스 타이핑하고 디버깅하세요.
//p563 부터 확인문제 5, 6, 8, 9, 10, 11, 12, 15, 16, 17번 직접 소스 만드세요.



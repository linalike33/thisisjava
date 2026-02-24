package com.mjc813;

public class MainPackaging {
    public void doSome() {
        packaging Box = new packaging();
        Box.add("사과");
        Box.add("복숭아");
        Box.add("수박");

        System.out.println(Box.remove()); //remove(바구니에잇는걸 하나하나 꺼내는함수
        System.out.println(Box.remove());


        packaging hune = new packaging();

        Human h1 = new Human();
        h1.setName("홍길동");
        hune.add(h1);

        Human h2 = new Human();
        h2.setName("김길동");
        hune.add(h2);

        //형변환하여 출력
        Human out1 = (Human) hune.remove();
        System.out.println(out1.getName());

        Human out2 = (Human) hune.remove();
        System.out.println(out2.getName());
    }
    public void Generic(){
        //제네릭을 사용한 클래스 실행
        GenericPackaging<String> Box = new GenericPackaging<>();
        Box.add("사과");
        Box.add("복숭아");
        Box.add("수박");

        String s = Box.remove();
        System.out.println(s);

        GenericPackaging<Human> hum = new GenericPackaging<>();
        Human h1 = new Human();
        h1.setName("홍길동");
        hum.add(h1);

        Human h2 = new Human();
        h2.setName("김길동");
        hum.add(h2);

        Human out1 = hum.remove();
        System.out.println(out1.getName());

        Human out2 = hum.remove();
        System.out.println(out2.getName());
    }
}

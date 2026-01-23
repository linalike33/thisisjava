package com.mjc813;
public class Chapter06 {
    public void StudentExample() {
        Student s1 = new Student(); //Chapter06 설계도로 객체를 만들어 s1에 담고 s1을 통해 클래스의 기능을 위임 , 호출할 수 있게 한다.
        System.out.println("s1 변수가 첫 번째 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 두 번째 객체를 참조합니다.");

    }

    public void CarExample() {
        Car myCar = new Car(); //Car("현대자동차","그랜저","검정",790,0)

        System.out.println("제작회사:" + myCar.company);
        System.out.println("모델명:" + myCar.model);
        System.out.println("색깔:" + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도:" + myCar.speed);
    }

    public void KoreanExample() {

        Korean k1 = new Korean("박자바", "01126-2674436");

        System.out.println("k1.nation: " + k1.nation);
        System.out.println("k1.name: " + k1.name);
        System.out.println("k1.ssn: " + k1.ssn);
        System.out.println();

        Korean k2 = new Korean("김자바", "4567-1485861");
        System.out.println("k2.nation: " + k2.nation);
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn: " + k2.ssn);

    }

    public void CarExample2() {
        Car car1 = new Car();
        System.out.println("ca1.company: " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("ca1.company: " + car2.company);
        System.out.println("ca1.model: " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("ca1.company: " + car3.company);
        System.out.println("ca1.model: " + car3.model);
        System.out.println("ca1.color: " + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정", 800);
        System.out.println("ca1.company: " + car4.company);
        System.out.println("ca1.model: " + car4.model);
        System.out.println("ca1.color: " + car4.color);
        System.out.println("ca1.maxSpeed: " + car4.maxSpeed);
        System.out.println();
    }

    public void CalculatorExample() {
        Calculator myCalc = new Calculator();

        myCalc.power0n();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        int x = 10;
        int y = 4;

        double result2 = myCalc.divide(x, y);
        System.out.println("result2:" + result2);

        myCalc.poweroff();
    }

    public void ComputerExample() {
        Computer myCom = new Computer();

        int re1 = myCom.sum(1, 2, 3);
        System.out.println("re1:" + re1);

        int re2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("re2:" + re2);

        int[] values = {1, 2, 3, 4, 5};
        int re3 = myCom.sum(values);
        System.out.println("re3:" + re3);

        int re4 = myCom.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("re4:" + re4);
    }

    public void Car1Example() {
        Car1 myCar = new Car1();
        myCar.setGes(5);
        if (myCar.is()) {
            System.out.println("출발합니다");

            myCar.run();
        }
        System.out.println("ges를 주입하세요");
    }
    public void  ClrE(){
        Clr myCalcu = new Clr();

        double re = myCalcu.ar(10);

        double re1= myCalcu.ar(10,20);

        System.out.println("정사각형 넓이="+re);
        System.out.println("직사각형 넓이="+re1);

    }
    public void phoneExample(){
        Phone phone1 = new Phone("아이폰 14 Pro",6.1,3200,"8핀");
        System.out.println("유통사: "+phone1.uu);
        System.out.println("핸드폰 기종: "+ phone1.ph);
        System.out.println("디스플레이 크기: "+ phone1.dis+"인치");
        System.out.println("배터리 용량: "+ phone1.dat+"mAh");
        System.out.println("연결 포트: "+ phone1.us);
        System.out.println();

        Phone phone2 = new Phone("갤럭시 S25+",6.7,4900,"USB-C");
        System.out.println("유통사: "+phone2.uu);
        System.out.println("핸드폰 기종: "+ phone2.ph);
        System.out.println("디스플레이 크기: "+ phone2.dis+"인치");
        System.out.println("배터리 용량: "+ phone2.dat+"mAh");
        System.out.println("연결 포트: "+ phone2.us);
    }
   public void DsgameExample(){
       Dsgame[] list = new Dsgame[5];
       Dsgame game1 = new Dsgame("마리오 골프", "스포츠", "전체이용가", 59800, "http://...");
       Dsgame game2 = new Dsgame("젤다의 전설", "RPG", "전체이용가", 74800, "http://...");

       list[0] =game1;
       list[1] =game2;
//       Dsgame.(game1);
//       Dsgame.DsgameExample(game2);
//
//       // 2. 출력 테스트
//       System.out.println("--- 게임 목록 ---");
//       manager.showAllGames();
   }
}

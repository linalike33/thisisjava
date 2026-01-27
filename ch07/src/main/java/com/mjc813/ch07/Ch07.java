package com.mjc813.ch07;

public class Ch07 {
    public void SmartPhoneEx() {
        SmartPhone myPhone = new SmartPhone("아이폰", "은색");
        System.out.println("모델:" + myPhone.model);
        System.out.println("색상:" + myPhone.color);

        System.out.println("와이파이 상태:" + myPhone.wifi);

        myPhone.bell();
        myPhone.sendvoidce("안녕하세요! 저는 홍길동인데요.");
        myPhone.receiveVoice("아~~ ㅊ네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);

        if (myPhone.isWifi()) {
            System.out.println("현재 와이파이가 켜져 있습니다.");

        }
    }
    public void ComputerEx(){
        int r = 10;
         Calculator calculator = new Calculator();
         System.out.println("원 면적:"+calculator.areaCircle(r));
         System.out.println();

         Calculator Computer = new Calculator();
        System.out.println("원 면적:"+Computer.areaCircle(r));
        System.out.println();

    }
    public void SupersonicAirplaneEx(){
        SupersonicAirplane se = new SupersonicAirplane();
        se.takeoff();
        se.fly();
        se.flyMode = SupersonicAirplane.SUPERSONIC;
        se.fly();
        se.flyMode = SupersonicAirplane.NORMAL;
        se.fly();
        se.land();
    }
    public void ChildEx(){
        Chid chid = new Chid();

        Parent parent = chid;

        parent.method1();
        parent.method2();
//        parent.method3(); 호출불가능
    }
}

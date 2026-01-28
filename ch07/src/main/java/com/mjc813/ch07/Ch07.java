package com.mjc813.ch07;

public class Ch07 {
    public Ch07() {
    }

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
       //parent.method3(); 호출불가능
    }
    public void StudentClassEx(){
        StudentClass s = new StudentClass("홍길동","전자회로",90);
        //s.getGrade();
        s.printInfo();
        System.out.println();

        StudentClass s1 = new StudentClass("생성자","영화학개론",39);
        //s1.getGrade();
        s1.printInfo();
        System.out.println();
    }
    public void CarEx(){
        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new HankooTire();
        mycar.run();
    }
    public void Driver(){
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
    public void personInfo(Person person){
        System.out.println("name: "+person.name);
        person.walk();

        if(person instanceof Student student){
            System.out.println("studenNO: "+ student.studenNO);
            student.study();

        }
        
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동",10);
        personInfo(p2);

    }
    public void Phondee(){
        Smart smart = new Smart("홍길동");
        smart.tur();
        smart.intt();
        smart.off();
    }
    public void AbsEx() {
        Dog dog = new Dog();
        dog.so();

        Cat cat = new Cat();
        cat.so();

        animalso(new Dog());
        animalso(new Cat());
    }
    public void animalso(Animal animal){
        animal.so();

    }


}

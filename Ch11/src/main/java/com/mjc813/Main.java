package com.mjc813;


//import static com.mjc813.Excep2.printL;


import javax.naming.InsufficientResourcesException;

public class Main {
    public static <e> void main(String[] args) {
//        Car car = new Car();
//        car.acslr();
//        System.out.println("끝");
//        Excep2 excep2 = new Excep2();
//       System.out.println("프로그램 시작\n");
//        printL("This");
//        printL(null);
//        System.out.println("프로그램종료");
//    try(MyResource res = new MyResource("A")){
//        String data = res.read1();
//        int va = Integer.parseInt(data);
//        }catch(Exception e){
//        System.out.println("예외처리"+e.getMessage());
//    }
//         System.out.println();
//
//    try (MyResource res = new MyResource("A")){
//        String date = res.read2();
//        int va = Integer.parseInt(date);
//    }catch(Exception e){
//        System.out.println("예외처리"+e.getMessage());
//    }
//    System.out.println();
//
//    MyResource res1 = new MyResource("A");
//    MyResource res2 = new MyResource("B");
//    try (res1;res2){
//        String data1 = res1.read1();
//        String data2 = res2.read1();
//    }catch (Exception e){
//        System.out.println("예외처리"+e.getMessage());
//    }
        Account account = new Account();
        account.de(1000);
        System.out.println("예금액"+account.getBalance());

        try{
            account.with(30000);
        }catch (InsufficientResourcesException e){
            String me = e.getMessage();
            System.out.println(me);
        }
        }


}
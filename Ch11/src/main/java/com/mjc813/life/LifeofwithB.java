package com.mjc813.life;

import com.mjc813.Bak.BankAccount;
import com.mjc813.Bak.SendMachine;
import com.mjc813.Srud.Student;

public class LifeofwithB {
    public void doToday() {
        Student lsh = new Student("이승협", "lsh2928");
        Student cwc = new Student("최원철", "csc9292");

        BankAccount ba1 = new BankAccount("1111-1111-11", "이승협");
        BankAccount ba2 = new BankAccount("222-222-2222", "최원철");

        StudentHasBankAccount lshBank = new StudentHasBankAccount(lsh, ba1);
        StudentHasBankAccount cwcBank = new StudentHasBankAccount(cwc, ba2);

        this.sendMoney(lshBank, cwcBank, 100000);
        this.sendMoney(cwcBank, lshBank, 5000);
    }

    public void sendMoney(StudentHasBankAccount from, StudentHasBankAccount to, int money) {
        // 원하는 곳에 예외처리 하세요
        SendMachine sm = new SendMachine();
        // from 뱅크에서 money 를 빼낸다.
        int exit = from.outcome(money);
        // 과제
        if ( sm.isActive() ) {
            // to 뱅크로 money 를 추가한다.
            // 과제
            to.income(exit);
            System.out.println("송금완료");
        }else{
            from.income(exit);
            System.out.println("송금 실패");
        }
    }
}
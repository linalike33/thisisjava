package com.mjc813.life;

import com.mjc813.Bak.BankAccount;
import com.mjc813.Srud.Student;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudentHasBankAccount {
    private final Student student;
    private final BankAccount bankAccount;

    /**
     * 계좌에 돈을 입금한다.
     */
    public void income(int money) {
        int current = bankAccount.getMoney();
        bankAccount.setMoney(current+money);
        System.out.println(student.getName()+"님의 계좌에 " + money + "원 입금 완료.");
    }

    /**
     * 계좌에서 돈을 출금한다.
     */
    public int outcome(int money) {
        int current = bankAccount.getMoney();

        if (current < money) {
            System.out.println(student.getName() + "님, 잔액이 부족합니다. (현재: " + current + "원)");
            return 0;
        }

        bankAccount.setMoney(current - money);
        System.out.println(student.getName() + "님의 계좌에서 " + money + "원 출금 완료.");
        return money;
    }

    /**
     * 계좌의 현재 금액을 리턴한다.
     */
    public int getCurrentMoney() {
        return bankAccount.getMoney();
    }

}
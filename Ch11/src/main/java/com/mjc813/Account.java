package com.mjc813;

import javax.naming.InsufficientResourcesException;

public class Account {
    private  long balance;
    public Account(){
    }
    public long getBalance(){
        return balance;

    }
    public void de(int mon){
        balance += mon;
    }
    public void with(int mon)throws InsufficientResourcesException{
        if(balance<mon){
            throw new InsufficientResourcesException("잔고부족:"+(mon-balance)+"모자람");
        }
        balance -=mon;
    }
}

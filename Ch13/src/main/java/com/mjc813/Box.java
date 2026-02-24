package com.mjc813;

public class Box <T>{
    public T cont;
    public boolean compare(Box<T>other){
        boolean res = cont.equals(other.cont);
        return res;
    }
}

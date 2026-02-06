package com.mjc813;

public class SmartPhone {
    private String com;
    private String os;

    public SmartPhone(String com, String os){
        this.com = com;
        this.os = os;
    }
    @Override
    public String toString(){
        return com+","+os;
    }
}

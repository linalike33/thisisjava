package com.mjc813;

public class Car {
    private String maodel;
    private String owner;

    public Car(){
    }
    public Car(String maodel){
        this.maodel = maodel;
    }
    public  String getMaodel()
    {
        return maodel;
    }
    public void setMaodel(String maodel){
        this.maodel = maodel;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
}

package com.mjc813;

public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

    public Product(int pno, String name, String company,int price){
        this.pno = pno;
        this.name= name;
        this.company = company;
        this.price = price;
    }

    public int getPno(){return pno;}
    public String getName(){return name;}
    public String getCompany(){return  company;}
    public int getPrice(){return  price;}

    @Override
    public String toString(){
        return new StringBuilder() //StringBuilder 글자를 넣을 수 잇는 빈 곳 하나하나 넣을 수있도록
        .append("{") //append하나하나 붙이기
        .append("pno:"+pno+",")
        .append("name:"+name+",")
        .append("compamy:"+company+",")
        .append("pric:"+price+",")
        .append("}")
        .toString();
    }
}

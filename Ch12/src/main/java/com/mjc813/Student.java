package com.mjc813;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }
    public int getNo(){
        return no;
    }
    public String getName(){
        return name;
    }
    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode(); //하나의 숫자로 압축하는 과정
          //이게 없다면 내용이 똑같은 객체들이 들어와도 번호표가 달라서 "서로 다른 놈"으로 오해받고, 이걸 함으로써 hashCode 각각 다른 객체의 슛자를 완전히 똑같이 만든다
        return hashCode;
    }
    @Override
    public boolean equals(Object ob){
        if(ob instanceof Student te){
            if(no == te.getNo()&&name.equals(te.getName())){
                return  true;
            }
        }
        return false;
    }
}

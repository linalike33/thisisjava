package com.mjc813;

public class Menber {
    public String name;
    public int age;

    public Menber(String name, int age){
        this.name = name;
        this.age = age;

    }
    @Override
    public int hashCode(){
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj){
        //(obj)이 Member 타입인지 확인하고, 맞다면 바로 'target'이라 부르겠다!
        if(obj instanceof Menber target){ //instanceof 이건 즉 같은 클래스가 맞는지 확인하는 안전장치
            //이제 'target'은 Member 타입이므로, Member의 필드(name, age)에 접근할 수 있음
            // 내 이름(name)과 손님 이름(target.name)이 같고(equals), 문자열이기때문에 equals 사용
            // 내 나이(age)와 손님 나이(target.age)가 같은지(==) 비교합니다. 숫자열이기때문에 == 사영
            return target.name.equals(name) && (target.age==age);
        }else{
            return false;
        }
    }
}

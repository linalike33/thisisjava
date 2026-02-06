package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UseObject {
    private String name;
    private String id;

    @Override
    public Object clone() { //객체의 복사본을 만듭니다.
        return this;
    }

    @Override
    public boolean equals(Object ob){ //두 객체의 내용이 같은지 비교하기 위해 사용
        if(this.hashCode() != ob.hashCode()){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){ //두 객체의 내용이 같은지 비교하기 위해 사용
        int num = super.hashCode();
        return num;

    }
}



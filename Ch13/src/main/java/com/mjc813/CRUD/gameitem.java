package com.mjc813.CRUD;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class gameitem <A> implements CRUD<A> {
    private List<A> itemList = new ArrayList<>();

    @Override
    public void add(A item) {
        itemList.add(item);
    }

    @Override
    public int size() {
        return itemList.size();
    }

    @Override
    public A set(int index, A item) { //index 번째에 item 객체로 셋팅한다. 리턴은 item 값이다.
        return itemList.set(index, item);
    }

    @Override
    public A remove(int index) { // index 번째의 item 을 삭제한다. 리턴은 item 값이다.
        return itemList.remove(index);
    }

    @Override
    public A get(int index) {
        return itemList.get(index);
    }

    @Override
    public String getJson(int index) {
        return "";
    }

    @Override
    public String getJsonAllItems() {
        return "";
    }
}

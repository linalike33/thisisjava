package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericPackaging<T> {
    private T[] list =(T[]) new Object[10];
    //private Ara
    private int index = -1;

    public void add(T obj) {
        if ( index >= this.list.length - 1 ) {
            return;
        }
        this.list[++index] = obj;
    }

    public T remove() {
        if ( index < 0 ) {
            return null;
        }
        return this.list[index--];
    }
}

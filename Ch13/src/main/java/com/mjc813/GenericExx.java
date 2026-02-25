package com.mjc813;

public class GenericExx {
    public static <T> Boxx<T> boxing(T t){
        Boxx<T> box = new Boxx<T>();
        box.set(t);
        return box;
    }
}

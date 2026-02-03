package com.mjc8132;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class Trans2 {
    private final Gson gson ;

    public Trans2() {
        this.gson = new Gson();
    }

    public String toJsonStringFromObject(Object obj) {
        return this.gson.toJson(obj);
    }

    public Object toObjectFromJsonString(String str, Type type) {
        return this.gson.fromJson(str, type);
    }
}

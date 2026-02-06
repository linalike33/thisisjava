package com.mjc813;

public class Meeeber {
    public String id;

    public Meeeber(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object Ob) {
        if (Ob instanceof Meeeber ta) {
            if (id.equals(ta.id)) {
                return false;
            }
        }
        return true;
    }

}

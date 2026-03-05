package com.mjc813;

public class Stuudent implements Comparable<Stuudent>{
    private String name;
    private int score;

    public Stuudent(String name , int score){
        this.name = name;
        this.score = score;
    }
    public String getName(){return name;}
    public int getScore(){return  score;}

    @Override
    public int compareTo(Stuudent o) {
        return Integer.compare(score,o.score);
    }
}

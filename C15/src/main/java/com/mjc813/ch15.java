package com.mjc813;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class ch15 {
    public void ProperthisE() throws Exception{ //throws Exception 책임을 넘기는 에러가 나던말던다 던저서 빨간줄을 없애는
        Properties properties = new Properties();

        properties.load(ch15.class.getResourceAsStream("database.properties"));
        //properties.load 외부파일을 읽어오는 작업 따라서 오류가 생기는 이유 파일이 사라지거나 이름이틀렸을때 대책이없어 생기는 경고를
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver :"+driver);
        System.out.println("url :"+url);
        System.out.println("username :"+username);
        System.out.println("password :"+password);
        System.out.println("admin :"+admin);
    }
    public void TreeSetEx(){
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for(Integer s: scores){
            System.out.println(s+"");
        }
        System.out.println("\n");

        System.out.println("가장 낮은 점수:"+scores.first());
        System.out.println("가장 높은 점수:"+scores.last());
        System.out.println("95점 아래 점수:"+scores.lower(95));
        System.out.println("95점 위의 점수:"+scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수:"+scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수:"+scores.ceiling(85)+"\n");

        NavigableSet<Integer>descendingScores = scores.descendingSet();
        for(Integer s: descendingScores){
            System.out.println(s+"");
        }
        System.out.println("\n");

        NavigableSet<Integer>ranSet =scores.tailSet(80,true);
        for(Integer s: ranSet){
            System.out.println(s+"");
        }
        System.out.println("\n");

        ranSet = scores.subSet(80,true,90,false);
        for(Integer s: ranSet){
            System.out.println(s+"");
        }

    }
    public void TreeMapEx(){
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("apple",10);
        treeMap.put("forever",60);
        treeMap.put("descrip",40);
        treeMap.put("ever",50);
        treeMap.put("zoo",80);
        treeMap.put("base",20);
        treeMap.put("guess",70);
        treeMap.put("cherry",30);

        Set<Map.Entry<String,Integer>>entrySet = treeMap.entrySet();
        for(Map.Entry<String,Integer> entity:entrySet){
          //  System.out.println(entry.getkey()+"-"+entity.getValue());
        }
        System.out.println();

    }
}

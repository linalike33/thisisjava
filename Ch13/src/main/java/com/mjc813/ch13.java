package com.mjc813;

import java.awt.*;
import java.awt.Container;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static com.mjc813.GenericExx.boxing;

public class ch13 {
    public void ArrayList() {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() +
                "\t" + board.getWriter());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
    }

    public void LinkedListEx() {
        List<String> list1 = new ArrayList<String>();

        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간:", (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간:", (endTime - startTime));

    }

    public void HashSet() {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        int size = set.size();
        System.out.printf("총 객체 수: " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.printf(element);
            if (element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for (String element : set) {
            System.out.println(element);
        }
    }

    public void HashSetEx() {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        //인스턴스는 다르지만 동등 객체이므로 객체는 1개만 저장

        System.out.printf("총 객체 수:" + set.size());
    }

    public void HashMapEx() {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수:" + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ":" + v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ":" + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수:" + map.size());
        System.out.println();
    }

    public void GenericEx() {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnL();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        Car.run();
    }

    //    public void GenericExam(){
//        Box<String>box1 = new Box<>0;
//        box1.cont = "100";
//
//        Box<String>box2 =new Box<>0;
//        box2.cont ="100";
//
//        boolean resu = box1.cont(box2);
//        System.out.println("ret:"+resu);
//    }
    public void GEge() {
        Boxx<Integer> box1 = boxing(100);
        int intV = box1.get();
        System.out.println(intV);

        Boxx<String> box2 = boxing("홍길동");
        String strva = box2.get();
        System.out.println(strva);
    }

    public void GenerE() {
        Course.registerC(new Applicant<Person>(new Person()));
        Course.registerC(new Applicant<Woerker>(new Woerker()));
        Course.registerC(new Applicant<Student>(new Student()));
        Course.registerC(new Applicant<HighStudent>(new HighStudent()));
        Course.registerC(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.regusterC1(new Applicant<Student>(new Student()));
        Course.regusterC1(new Applicant<HighStudent>(new HighStudent()));
        Course.regusterC1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.regusterC2(new Applicant<Person>(new Person()));
        Course.regusterC2(new Applicant<Woerker>(new Woerker()));
    }
}





package com.mjc813;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.mjc813.Strean.sum;

public class Ch17 {
    //스트림
    public void ster(){
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("집갈래");
        set.add("졸려라");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
    //내부반복자
    public void Paralle(){
        List<String>list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("람다식");
        list.add("집가자");

        Stream<String>parllelStream = list.parallelStream(); //parallelStream 하나의 덩어리의 리스트를 여러개의 작은 조작으로 나누는것
        parllelStream.forEach(name->{
            System.out.println(name +":"+Thread.currentThread().getName());
            //Thread 하나의 일꾼, 주체를 말한다 지금일을 하는 사람
            //urrentThread() 지금 현재 이 코드에서 실행을 하고 있는 일꾼을 지목한다
            //getName 그 일꾼의 이름이 뭐냐고 물어보는 코드이다

            //따라서 하나의 리스트를 나눠서 하나하나 처리를 한다음 젤먼저 일을 끝내는 사람위주로 실행된다
        });
    }
    //중간 처리와 최종처리
    public void Stert(){
        List<Student>list = Arrays.asList( //리스트로집어넣고싶을때
                new Student("홍길동",10),
                new Student("신유권",10),
                new Student("미권죵",30)

        );

        double avg = list.stream()
                .mapToInt(Student -> Student.getScore()) //학생이라는 덩어리에서 점수라는 정수로 바꿔서ㅗ들어가서
                .average() //숫자를 다더하고 개수로 나누ㅗ라
                .getAsDouble(); //숫자로 꺼냄

        System.out.println("평균점수:"+avg);
    }
    //리소스로부터 스트림얻기(컬렉션으로부터 스트림 얻기
    public void Stertt(){
        List<Product> list = new ArrayList<>();
        for(int i =1; i<=5; i++){
            Product product = new Product(i,"상품"+i,"회사",(int)
                    (1000*Math.random()));
            list.add(product);
        }
        Stream<Product> stream = list.stream();
        stream.forEach(p->System.out.println(p));

    }
    //배열로부터 스트림얻기
    public void Stgfdg(){
        String[] strArray = {"홍길동","신용권","김미나"};
        Stream<String> stream = Arrays.stream(strArray); //멈춰 있는 배열을 흐르게(Stream) 만들어라! Stream<String 글자가 지나가는 일반 벨트.
        stream.forEach(item->System.out.println(item+","));
        System.out.println();

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item-> System.out.println(item+","));
        System.out.println();
    }
    //숫자범위로부터 스트림얻기
    public void exs(){
       IntStream stream = IntStream.rangeClosed(1,100);
       stream.forEach(a->sum+=a);
       System.out.println("총합: "+sum);
    }
    //파일로부터 스트림 얻기
    public void Sterfd() throws Exception{ //Exception 예외걍던지기
        Path path = Paths.get(Ch17.class.getResource("data.txt").toURI()); //s가 붙은 건 내가 뭘 담는 '그릇'이 아니라, 그릇을 닦거나 음식을 담을 때 쓰는 '도구(집게, 가위)'다!"
        Stream<String>stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line-> System.out.println(line)); //forEach 하나하나씩 꺼내서 원하는 작업을 시키는ㄴ
        stream.close();
    }
    //요소걸러내기(필터링)
    public void Filter(){
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("김자바");

        list.stream()
                .distinct() //중복제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n-> n.startsWith("신")) //신으로 시작하는 요소만을 필터
                .forEach(n->System.out.println(n));
        System.out.println();

        list.stream()
                .distinct() //먼저중복을 제ㅓㄱ하고
                .filter(n->n.startsWith("신"))
                .forEach(n->System.out.println(n));
    }
    //요소 변환(매핑)
    public void MapE(){
        List<Studentt> studentt = new ArrayList<>();
        studentt.add(new Studentt("홍길동",99));
        studentt.add(new Studentt("홍길동",23));
        studentt.add(new Studentt("홍길동",23));

        studentt.stream()
                .mapToInt(s->s.getScore()) //데이터를 숫자로 mapToInt 숫자전용
                .forEach(score -> System.out.println(score));
    }
    //요소를 복수 개의 요소로 변환
    public void FlatMapint(){
        List<String>list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am best developer");
        list1.stream()
                .flatMap(date -> Arrays.stream(date.split(" ")))//펼쳐서 하나로 만드는
                .forEach(word->System.out.println(word));

        System.out.println();

        List<String>list2 = Arrays.asList("10,20,30,40,50");
        list2.stream()
                .flatMapToInt(data->{
                    String[]strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for(int i = 0; i<strArr.length; i++){
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number->System.out.println(number));

    }
    //요소정렬
    public void Sorthing(){
        List<Stuudent> stuudentList = new ArrayList<>();
        stuudentList.add(new Stuudent("홍길동",30));
        stuudentList.add(new Stuudent("신용권",10));
        stuudentList.add(new Stuudent("유미선",20));
        stuudentList.stream()
                .sorted() //순서대로 정렬   오름차순
                .forEach(s-> System.out.println(s.getName()+":"+s.getScore()));
        System.out.println();
        //Comparator를 이용한 정렬
//        stuudentList.stream()
//                        .sorted((s1,s2)->Integer.compare(s1.getScore(),s2.getScore()))
//                        .forEach(s-> System.out.println(s.getName()+":"+s.getScore()));
//        System.out.println();

        stuudentList.stream()
                .sorted(Comparator.reverseOrder()) //내림차순
                .forEach(s->System.out.println(s.getName()+":"+s.getScore()));
        //Comparator를 이용한 정렬
//        stuudentList.stream()
//                        .sorted((s1,s2)->Integer.compare(s2.getScore(),s1.getScore()))
//                        .forEach(s-> System.out.println(s.getName()+":"+s.getScore()));
//        System.out.println();
    }
    //요소를 하나씩 처리 (루핑)
    public void Loopint(){
        int[]intArr ={1,2,3,4,5};
    }

}

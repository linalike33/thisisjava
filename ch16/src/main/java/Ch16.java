import org.example.*;

import static java.lang.Double.sum;

public class Ch16 {
    //람다식
    public void Lambda(){
        action((x,y )->{
            int result = x + y;
            System.out.println("result:"+result);
        });

        action((x,y)->{
            int result = x - y;
            System.out.println("result:"+result);
        });

    }
    public static void action(Calculable calculable){
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
    //매개변수가 없는 람다식
    public void Laan(){
        Person person = new Person();

        person.action(()->{
            System.out.println("출근을 합니다");
            System.out.println("프로그래밍을 합니다");
        });

        person.action(()->System.out.println("퇴근을합니다"));
    }
    public void Button(){
        Button button = new Button();
        button.setClickListener(()->{
            System.out.println("OK 버튼을 클릭했습니다");
        });

        button.click();

        Button btn = new Button();

        btn.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했습니다");
        });

        btn.click();
    }
    //매개변수가 있는 람다식
    public void Lalala(){
        Pperson person = new Pperson();

        person.action1((name,job)->{
            System.out.println(name+"이");
            System.out.println(job+"을 합니다");
        });
        person.action1(((name, job) -> System.out.println(name +"이"+job+"을 하지 않습니다")));

        person.act2(word ->{
            System.out.println("\""+word+"\"");
            System.out.println("라고 말합니다");
        });
        person.act2(word ->System.out.println("\""+word+"\"라고 외칩니다"));

    }
    //리턴값이 있는 람다식
    public void LLad(){
        Personn personn = new Personn();

        personn.ac((x,y)->{
            double re = x + y;
            return re;
        });

        personn.ac((x,y)->(x+y));

        personn.ac((x,y)->sum(x,y));

    }
    public static double sum(double x , double y){
        return (x+y);
    }
    //메소드 참조
    public void MethodRefer(){
        Personnn personnn = new Personnn();

        //정적메소드일경우
        //람다식
        //personnn.ac((x,y)-> Computerr.st(x,y);
        //메소드참조
        personnn.ac(Computerr::sta);

        Computerr com = new Computerr();

        personnn.ac(com::intt);
    }
    //생성자참조
    public void Cm(){
        Personnnn personnnn = new Personnnn();

        Member m1 = personnnn.getMem1(Member::new);
        System.out.println(m1);
        System.out.println();

        Member m2 = personnnn.getMem2(Member::new);
        System.out.println();

    }

}

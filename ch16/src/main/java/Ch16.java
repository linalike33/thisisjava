import org.example.*;

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

    }

}

package meiju;

import java.time.MonthDay;

import static meiju.Week.Monday;

public class Test {
    public static void main(String[] args) {
        Enum u;
        for (Week e:Week.values()){
            System.out.println(e);
        }

        Week test = Week.Tuesday;
        switch (test){
            case Monday:
                System.out.println("today is Monday");
                break;
            case Tuesday:
                System.out.println("today is tuesday");
                break;
            case Wednesday:
                System.out.println("today is wednesday");
                default:
                    System.out.println("InvocationHandler");
                    break;
        }
    }
}

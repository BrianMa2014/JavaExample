package base.reflection.enumeration;

/**
 * Created by MaMingJiang on 2016/4/8.
 */
public class WeekTest {

    public void choose(Week week){
        switch (week){
            case MON : System.out.println("忙day");
                break;
            case TUE : System.out.println("求死day");
                break;
            case WED : System.out.println("未死day");
                break;
            case THR : System.out.println("受死day");
                break;
            case FRI : System.out.println("福来day");
                break;
            case SAT : System.out.println("Satday");
                break;
            case SUN : System.out.println("Sunday");
                break;
            default:
                System.out.println();
        }
    }
}

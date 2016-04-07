package base.reflection.InnerClass;

/**
 * Created by MaMingJiang on 2016/4/7.
 */
public class OuterClass {
    public void useInner(){
        System.out.println("TestInnerClass.useInner");
        InnerClass in = new InnerClass();
        in.print();
    }
    class InnerClass{
        public void print(){
            System.out.println("InnerClass.print");
        }
    }

    public static void main(String[] args) {
        OuterClass test = new OuterClass();
        test.useInner();
    }
}

package advanced.lambda;

/**
 * Created by MaMingJiang on 2016/5/3.
 */
public class LambdaTestMain {
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a+b;
        MathOperation subtraction = (a,b) -> a-b;
        MathOperation multiplication  = (a,b) -> {return a*b;};
        MathOperation division = (int a,int b) -> a/b;


        OperationUtils util = new OperationUtils();
        int a = 6 , b= 3;
        System.out.println("operation: a="+a+",b="+b);

        int result = util.executeOperation(a,b,addition);
        System.out.println("addition:" + result);

        result = util.executeOperation(a,b,subtraction);
        System.out.println("subtraction:" + result);

        result = util.executeOperation(a,b,multiplication);
        System.out.println("multiplication:" + result);

        result = util.executeOperation(a,b,division);
        System.out.println("division:" + result);

        UserService us = (String str) -> System.out.println("Hello," + str);
        us.sayHello("Brian");
    }

}

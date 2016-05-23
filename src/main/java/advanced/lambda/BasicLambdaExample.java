package advanced.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MaMingJiang on 2016/5/23.
 */
public class BasicLambdaExample {

    public static void main(String[] args) {
        String[] nameString = {"Brian","Django","Coco"};
        List<String> nameList = Arrays.asList(nameString);
        nameList.forEach(name -> System.out.println(name));
        System.out.println("*****************");
        //method references
        nameList.forEach(System.out::println);
    }
}

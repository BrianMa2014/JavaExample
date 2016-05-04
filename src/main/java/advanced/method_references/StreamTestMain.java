package advanced.method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MaMingJiang on 2016/5/4.
 */
public class StreamTestMain {
    public static void main(String[] args) {


    List<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(7);
    nums.add(3);
    //filter 根据规则过滤
    nums.stream().filter(num -> num > 5).forEach(System.out::println);
    //map 根据规则转换
    nums.stream().map(num -> num+=2).forEach(System.out::println);
    }
}

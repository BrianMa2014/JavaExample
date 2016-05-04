package advanced.method_references;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesMain {
    public static void main(String[] args) {
        //1 引用静态方法
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(7);
        nums.add(3);
        nums.forEach(System.out::println);
        nums.sort(Integer::compare);
        nums.forEach(System.out::println);

        //2 引用 某个特定对象的实例方法
        List<String> names = new ArrayList<>();
        names.add("Brian");
        names.add("Django");
        names.add("Coco");
        names.forEach(System.out::println);

        //3 引用类的实例方法
        names.stream().map(String::length).forEach(System.out::println);

        //4 引用类的 构造函数
        names.stream().map(StringBuilder::new).forEach(System.out::println);
    }
}
package advanced.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MaMingJiang on 2016/5/3.
 */
public class SortTestMain {

    public static void main(String[] args) {
        List<String> name1 = new ArrayList<>();
        name1.add("Brian");
        name1.add("Django");
        name1.add("Coco");
        List<String> name2 = new ArrayList<>();
        name2.add("Brian");
        name2.add("Django");
        name2.add("Coco");

        SortUtils util = new SortUtils();
        System.out.println("排序前:" + name1);
        System.out.println("使用java 7 排序");
        util.sortUsingJava7(name1);
        System.out.println(name1);

        System.out.println("排序前:" + name2);
        System.out.println("使用java 8 排序");
        util.sortUsingJava8(name2);
        System.out.println(name2);
    }

}

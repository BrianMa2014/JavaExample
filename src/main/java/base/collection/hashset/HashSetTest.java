package base.collection.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class HashSetTest {
    public static void main(String[] args) {
        //HashSet线程不安全可以存储null
        /*如果重写了对象的hashCode方法而没有重写equals方法,因为两个对象的hashCode相等,需要存储在同一个位置
           * 所以会在这个位置用链式结构来保存多个对象 但是查找时通过hashCode查找，会降低效率 */
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("1");
        System.out.println(set);
    }
}

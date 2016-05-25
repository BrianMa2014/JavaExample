package base.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //当程序把可变对象添加到HashSet之后,尽量不要修改该集合元素中参与计算hashCode()和equals()的变量
        hashSet.add(new R(5));
        hashSet.add(new R(-3));
        hashSet.add(new R(9));
        hashSet.add(new R(-2));
        //结果：[R[count:-2], R[count:-3], R[count:5], R[count:9]]
        System.out.println(hashSet);
        Iterator it = hashSet.iterator();
        R first = (R)it.next();
        first.count = -3;
        //结果：[R[count:-3], R[count:-3], R[count:5], R[count:9]]
        System.out.println(hashSet);
        //值为-3的有两个，第一个对象虽然count是-3 ,但是他真正存储的时候是按-2计算hashCode存储的，
        // 他的实际地址和-3算出来的hashCode不一样 ,所以只有第二个-3的对象被删除
        hashSet.remove(new R(-3));
        //结果：[R[count:-3], R[count:5], R[count:9]] 剩下这个-3 其实存储是的hashCode是按-2计算的
        System.out.println(hashSet);
        //结果都是false
        //第一个为何是false? 删除-3 , 表面上是-3的对象其实hashCode是按-2计算的
        System.out.println(hashSet.contains(new R(-3)));
        //原本是-2 的那个对象,存储地址一样，但是equals用的是count，结果不一样
        System.out.println(hashSet.contains(new R(-2)));
    }
}

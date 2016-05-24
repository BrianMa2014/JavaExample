package base.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("疯狂Android讲义");
        list.add("疯狂Java讲义");
        //调用父类AbstractCollection的toString方法
        System.out.println(list);
        //java8新增的lambda表达式循环集合.
        list.forEach(val ->System.out.print(val));
        list.forEach(System.out::print);
        System.out.println("*****实现类");
        list.forEach(new ConsumerClass());

        System.out.println("*****匿名类");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("*****Iterator forEachRemaing");
        Iterator it = list.iterator();
//        it.forEachRemaining(val -> System.out.println(val));
        it.forEachRemaining(System.out::println);
        System.out.println("*****while");
        Iterator it2 = list.iterator();
        while(it2.hasNext()){
            String num = (String)it2.next();
            System.out.println(num);
        //fail-fast 快速失败。。。迭代过程中不可以修改集合ConcurrentModificationException
            if(num.equals("疯狂Android讲义")){
                list.remove(num);
            }
            num = "testnum";
        }
        //只是把变量传给了iterator,修改并不会影响集合本身.
        System.out.println(list);


    }
}

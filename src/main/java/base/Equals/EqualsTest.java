package base.Equals;

import advanced.lambda.Person;

import java.util.Date;

/**
 * Created by MaMingJiang on 2016/5/25.
 */
public class EqualsTest {
    public static void main(String[] args) {
        //http://www.cnblogs.com/zhxhdean/archive/2011/03/25/1995431.html
//        1.对于基本数据类型  == 比较数值
//        2.对于复合数据类型
//                ==比较在内存中的存放地址
//        equals方法来自Object类 如果没有重写equals方法,将使用==来比较二者的存放地址
//        Date String Integer等类重写了equals方法，不再比较类在堆内存中的存放地址。
        Person p = new Person();
        p.setJob("Engineer");
        Person p2 = p;
        Person p3 = new Person();
        //new出来的一个对象，不同的变量指向同一个对象,返回true
        System.out.println(p ==p2);
        System.out.println(p ==p3);
        //Integer  比较value数值
        Integer num1 = 1;
        Integer num2 = 1;
        System.out.println(num1.equals(num2));
        //Date 比较
        Date date1 = new Date();
        Date date2 = new Date();
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        //比较：the number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(date1.equals(date2));
        //String
        String s1 = "123";
        String s2 = "123";
        //返回true
//      程序首先会在这个String缓冲池中寻找相同值的对象，在第一个程序中，s1先被放到了池中，所以在s2被创建的时候，程序找到了具有相同值的 s1
//      将s2引用s1所引用的对象"Monday"
        System.out.println("1*****");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("*****");
        String s3 = "123";
        String s4 = new String("123");
        //返回false
        System.out.println(s3 == s4);
        //返回true
        System.out.println(s3.equals(s4));

        System.out.println("*****");
        String s5 = "123";
        String s6 = new String("123");
        System.out.println(s5==s6);
        //返回false
        s6 = s6.intern();     //重新给s6赋值 检查字符串池里
        System.out.println(s5 == s6);
        //返回true
        System.out.println(s5.equals(s6));
    }
}

package base.reflection.InnerClass;

/**
 * Created by MaMingJiang on 2016/4/7.
      tutorial site : http://www.cnblogs.com/nerxious/archive/2013/01/25/2876489.html
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {

        //1.不使用匿名内部类
        /*
          可以看到，我们用Child继承了Person类，然后实现了Child的一个实例，将其向上转型为Person类的引用
             但是，如果此处的Child类只使用一次，那么将其编写为独立的一个类岂不是很麻烦？
                 这个时候就引入了匿名内部类
         */
        Person student = new Student();
        student.say();

        //2.在抽象类上使用匿名内部类
        Person p = new Person() {
            @Override
            public void say() {
                System.out.println("AnonymousInnerClass.say");
            }
        };
        p.say();

        //3.在接口上使用匿名内部类
        Animal animal = new Animal(){
            @Override
            public void run(){
                System.out.println("AnonymousInnerClass.run");
            }
        };
        animal.run();

        //4.线程中使用匿名内部类 继承Thread的线程
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread对象run()");
            }
        };
        thread1.start();

        //5 实现Runnable接口的线程
        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable的run()");
            }
        };
        Thread thread = new Thread(thread2);
        thread.start();
    }
}

abstract class Person{
    public abstract void say();
}

interface Animal{
     abstract void run();
}

class Student extends Person{

    @Override
    public void say() {
        System.out.println("Student.say");
    }
}


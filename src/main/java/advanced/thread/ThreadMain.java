package advanced.thread;

import org.testng.annotations.Test;

/**
 * Created by MaMingJiang on 2016/4/5.
 */
public class ThreadMain {

    @Test
    public static void main(String[] args){

        //获取当前正在运行的线程的名字
        System.out.println("main线程name:"+Thread.currentThread().getName());


        //1 继承Thread ,重写run方法 ， start()方法启动线程
        MyThread thread = new MyThread();    //或者MyThread thread = new MyThread
        thread.start();

        //2 实现Runnable接口 ,实现run方法,runnable对象作为target传给Thread ;  start()方法启动线程
        MyRunnableThread td = new MyRunnableThread();
        Thread thread1 = new Thread(td);
        thread1.start();
//      多次启动线程会报错：  java.lang.IllegalThreadStateException
//        thread1.start();
        //3 这句话会比线程先输出，说明使用多线程技术时,代码的运行结果与代码的执行或调用顺序没有关系
        //此外,有多个线程的时候,线程的执行顺序和 调用start()方法的顺序无关

        //4 Thread类也实现Runnable接口,所以可以把Thread对象传给另一个thread的构造器,把这个线程的run方法交由另一个线程运行。
        Thread th = new MyThread2();
        Thread th2 = new Thread(th);
        th2.start();

        System.out.println("运行结束**********");

    }

    @Test
    public static void main1(String[] args){
        Thread countThread = new CountThread();
        Thread[] threads = new Thread[100];
        for(int i=0;i<100;i++){
            threads[i] = new Thread(countThread,"thread name_"+i);
        }
        /**
         * 如果run方法不加synchronized 输出结果中会开到多个线程输出同样的count值  ->非线程安全
         * 加synchronized关键字,按排队的方式进行处理,执行临界区(互斥区)代码时先要去拿锁
         */
        for(Thread thread : threads){
            thread.start();
        }

    }

}


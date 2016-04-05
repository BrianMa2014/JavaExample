package advanced.proxy.thread;


import org.testng.annotations.Test;

/**
 * Created by MaMingJiang on 2016/4/5.
 */
public class ThreadMain {

    @Test
    public static void main(String[] args){
        //1 继承Thread ,重写run方法 ， start()方法启动线程
        Thread thread = new MyThread();
        thread.start();

        //1 实现Runnable接口 ,实现run方法,runnable对象作为target传给Thread ;  start()方法启动线程
        MyRunnableThread td = new MyRunnableThread();
        Thread thread1 = new Thread(td);
        thread1.start();
    }
}

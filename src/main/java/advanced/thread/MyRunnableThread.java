package advanced.thread;

/**
 * Created by MaMingJiang on 2016/4/5.
 */
public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnableThread run !!!");
        System.out.println("MyRunnableThread线程name:"+Thread.currentThread().getName());
    }
}

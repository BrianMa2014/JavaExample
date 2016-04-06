package advanced.proxy.thread;

/**
 * Created by MaMingJiang on 2016/4/6.
 */
public class CountThread extends Thread {
    private int count = 100;

    @Override
    synchronized public void run(){
        count--;
        System.out.println("线程"+Thread.currentThread().getName()+"计算,count="+count);
    }
}

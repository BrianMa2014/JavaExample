package advanced.thread;

/**
 * Created by MaMingJiang on 2016/4/5.
 */
public class MyThread extends Thread{
    public void run(){
        try {
            //线程休眠
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread线程name:"+Thread.currentThread().getName());
        System.out.println("MyThread run !");
    }
}

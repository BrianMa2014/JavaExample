package advanced.lambda;

/**
 * Created by MaMingJiang on 2016/5/23.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
         Player player = new Player(){
            @Override
            public void play(String item){
                System.out.println("player is playing :"+item);
            }
        };
        player.play("soccer");

        //using lambda expression to replace anonymous class
        Player player2 = (item) -> System.out.println("player is playing :"+item);

        player2.play("soccer");


        // Thread !!!
//        public Thread(Runnable target) {
//            init(null, target, "Thread-" + nextThreadNum(), 0);
//        }
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello World!!!");
            }
        }).start();

        new Thread(() -> System.out.println("Hello World!!!")).start();


        //runnable
        Runnable run1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello World!!!");
            }
        };

        Runnable run2 = () -> System.out.println("Hello World!!!");
        run1.run();
        run2.run();

    }
}



package advanced.proxy.proxy;

/**
 * Created by mamingjiang on 2016/4/4.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Animal dog = new Dog();
        Animal animal = (Animal)ProxyFactory.getProxy(dog);
        animal.run();
        animal.eat();
    }
}

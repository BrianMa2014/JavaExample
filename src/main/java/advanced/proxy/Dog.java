package advanced.proxy.proxy;

import base.reflection.reflection.ReflectionUtils;

/**
 * Created by mamingjiang on 2016/4/4.
 */
public class Dog implements Animal {
    @Override
    public void run() {
        ReflectionUtils.print("Dog run !!!!");
    }

    @Override
    public void eat() {
        ReflectionUtils.print("Dog eat !!!!");
    }
}

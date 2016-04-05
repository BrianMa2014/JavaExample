package advanced.proxy.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by mamingjiang on 2016/4/4.
 */
public class ProxyFactory {

    public static Object getProxy(Object object){
       /*
       public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
        */
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setTarget(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), handler);
    }
}



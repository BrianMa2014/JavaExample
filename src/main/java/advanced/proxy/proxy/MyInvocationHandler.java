package advanced.proxy.proxy;

import base.reflection.reflection.ReflectionUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mamingjiang on 2016/4/4.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        ReflectionUtils.print("MyInvocationHandler invoke方法！！！");
        method.invoke(target);
        return null;
    }
}

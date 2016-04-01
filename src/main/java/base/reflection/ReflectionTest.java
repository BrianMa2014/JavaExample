package base.reflection;

import java.lang.reflect.Method;

/**
 * Created by MaMingJiang on 2016/4/1.
 */
public class ReflectionTest {

    public static void main(String args[]){
        Class clazz = Student.class;

        System.out.println("Method.getMethods()**********");
        //getMethods()方法获取该类自己以及从父类继承的公共方法
        Method[] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }

        System.out.println("Method.getMethods()**********");
        //getDeclaredMethods方法获取该类自己定义的所有方法,包括public private protected和包访问权限，但是不包括继承
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method.getName());
        }
    }
}

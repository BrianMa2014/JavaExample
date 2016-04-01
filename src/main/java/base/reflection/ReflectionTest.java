package base.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by MaMingJiang on 2016/4/1.
 */
public class ReflectionTest {
    @Test
    // 比较getMethods 和 getDeclaredMethods方法
    public void test1(){
        Class clazz = Student.class;
        //1.通过反射获取方法
        System.out.println("Method.getMethods()获取从父类继承以及自己声明的共有方法**********");
        //getMethods()方法获取该类自己以及从父类继承的公共方法
        Method[] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println("name:" + method.getName());
        }

        System.out.println("Method.getMethods()获取自己声明的所有方法，不继承**********");
        //getDeclaredMethods方法获取该类自己定义的所有方法,包括public private protected和包访问权限，但是不包括继承
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method.getName());
        }

    }
    @Test
    @SuppressWarnings("unchecked")
    public void test2(){
        try {
            Class stu = Student.class;
            //指明方法名和方法参数类型
            Method method = stu.getDeclaredMethod("testPrivate",String.class);
            //调用私有方法需要setAccessible
            method.setAccessible(true);

            Student s1 = (Student)stu.newInstance();
            //调用有参数的私有方法
            method.invoke(s1,"hello world");

        } catch (NoSuchMethodException |InstantiationException |InvocationTargetException |IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    @Test
    @SuppressWarnings("unchecked")
    public void test3(){
        try {
            Class stu = Student.class;
            Method method2 = stu.getDeclaredMethod("info");
            method2.setAccessible(true);
            //调用Student的默认构造函数实例化对象
            Student s2 = (Student)stu.newInstance();
            s2.setName("Brian");
            //调用无参的私有方法
            method2.invoke(s2);
        } catch (NoSuchMethodException |InstantiationException |InvocationTargetException |IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

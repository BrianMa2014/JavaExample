package base.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by MaMingJiang on 2016/4/1.
 * tutorial site :https://www.douban.com/note/306848299/
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

    @Test
    public void testGetPackageName(){
        //获取指定类的包名
        Class clazz = Student.class;
        String packageName = clazz.getPackage().getName();
        ReflectionUtils.print(packageName);
    }
    @Test
    public void testGetClassName(){
        //获取指定类的完全限定名
        Class clazz = Student.class;
        String className = clazz.getName();
        ReflectionUtils.print(className);
    }

    @Test
    public void testGetSupperClass(){
        //获取指定类父类的完全限定名
        Class clazz = Student.class;
        String className = clazz.getSuperclass().getName();
        ReflectionUtils.print(className);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testGetModifiers(){
        Class clazz = Student.class;
        int modifiers = clazz.getModifiers();
        //getModifiers方法返回修饰符对应的Value之和
        //___________________________________________________________________________________________
        // Flag Name	 |   Value	|  Interpretation                                               |
        // -----------------------------------------------------------------------------------------|                                                 |
        // ACC_PRIVATE   |	0x0002	|  Declared private; accessible only within the defining class. |
        // ACC_PROTECTED |	0x0004	|  Declared protected; may be accessed within subclasses.       |
        // ACC_STATIC    |	0x0008	|  Declared static.                                             |
        // ACC_NATIVE    |	0x0100	|  Declared native; implemented in a language other than Java.  |                                          |
        //__________________________________________________________________________________________|
        ReflectionUtils.print("获取的类的modifiers..."+String.valueOf(modifiers));
        try {
//            Method method = clazz.getDeclaredMethod("info2");
            //***public native int hashCode();***** getModifiers方法的结果是257
            Method method = clazz.getMethod("hashCode");
            int mod = method.getModifiers();
            ReflectionUtils.print("获取方法的modifiers..."+String.valueOf(mod));
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }
    }


}

package base.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by MaMingJiang on 2016/4/5.
 */
public class ProductionMain {

    @Test
    //[习题16-1至16-3]编写一个Product类,然后利用反射进行实例化，并且描述此类声明了多少属性和方法.打印属性和方法的信息
    public void test01() throws IllegalAccessException, InstantiationException {
        Class prod = Product.class;
        Product stu = (Product)prod.newInstance();
        //获取属性
        Field[] fields = prod.getDeclaredFields();
        int num = 0;
        for(Field field : fields){
            System.out.println("属性" + num + ":" + field.getName()+",type name:"+field.getType().getName());
            num++;
        }
        System.out.println("Product类共有属性："+num);
        System.out.println("***************");
        Method[] methods = prod.getDeclaredMethods();
        int count = 0;
        for(Method method : methods){
            /**对比 method.getReturnType() 和 method.getReturnType().getName()
             * 结果 class java.lang.String    java.lang.String
             * Converts the object to a string. The string representation is the
             * string "class" or "interface", followed by a space, and then by the
             * fully qualified name of the class in the format returned by
             * {@code getName}.  If this {@code Class} object represents a
             * primitive type, this method returns the name of the primitive type.  If
             * this {@code Class} object represents void this method returns
             * "void".
             *
             * @return a string representation of this class object.

            public String toString() {
                return (isInterface() ? "interface " : (isPrimitive() ? "" : "class "))
                        + getName();
            }
             */
            System.out.println("方法"+ count + ":" + method.getName()+",返回值类型："+method.getReturnType().getName());
            Class[] paraTypes = method.getParameterTypes();
            for(Class paraType : paraTypes){
                System.out.println("方法形参类型："+paraType.getName());
            }
            count++;
        }
        System.out.println("Product类共有方法："+count);
    }
}

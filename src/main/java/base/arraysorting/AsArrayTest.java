package base.arraysorting;

import base.reflection.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MaMingJiang on 2016/4/11.
 */
public class AsArrayTest {
    public static void main(String[] args) {
        Student stu = new Student();
        List<Student> students = Arrays.asList(stu);
        System.out.println(students.size());

        AsArrayTest.asList(stu);
        Student[] stus = new Student[]{new Student(),new Student()};
        AsArrayTest.asList(stus);

    }

    @SafeVarargs
//    @SuppressWarnings("varargs")
    @SuppressWarnings("unchecked")
    public static <T> void asList(T... t){
        System.out.println("getClassName方法...");
        System.out.println(t.getClass().getName());
    }

}

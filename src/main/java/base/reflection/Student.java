package base.reflection.reflection;

import java.io.Serializable;

/**
 * Created by MaMingJiang on 2016/4/1.
 */
public class Student implements Serializable {
    private int age;
    private String name;
    private int[] scores;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, int[] scores) {
        this.age = age;
        this.name = name;
        this.scores = scores;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    private void testPrivate(String str){
        System.out.println("调用了testPrivate方法..." + str);
    }
    private void info(){
        System.out.println(this.getName());
    }

    private static void info2(){
    }
}

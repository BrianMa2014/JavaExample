package base.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by MaMingJiang on 2016/5/3.
 */
public class SortUtils {
    public void sortUsingJava7(List names){
        System.out.println("Tester.sortUsingJava7");
        Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }
    public void sortUsingJava8(List<String> names){
        System.out.println("Tester.sortUsingJava8");
        Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
    }

}

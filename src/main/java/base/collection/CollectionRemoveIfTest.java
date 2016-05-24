package base.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class CollectionRemoveIfTest {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        set.add("mamingjiang");
        set.add("mamingjiang2");
        set.add("mamingjiang3");
        System.out.println(set);
        set.removeIf(val ->val.equals("mamingjiang2"));

        System.out.println(set);
    }
}

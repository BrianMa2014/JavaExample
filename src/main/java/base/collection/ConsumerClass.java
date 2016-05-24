package base.collection;

import java.util.function.Consumer;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class ConsumerClass implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o.toString());
    }

    @Override
    public Consumer andThen(Consumer after) {
        return null;
    }
}

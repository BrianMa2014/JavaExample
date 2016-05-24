package advanced.method_references;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by MaMingJiang on 2016/5/24.
 */
public class IntStreamTest {
    public static void main(String[] args) {
       IntStream intStream = IntStream.builder()
             .add(1)
             .add(-20)
             .add(15).build();
//        System.out.println(intStream.max().getAsInt());
//        System.out.println(intStream.min().getAsInt());
//        System.out.println(intStream.sum());
//        System.out.println(intStream.count());
//        System.out.println(intStream.average().getAsDouble());
        //所有的元素都匹配值大于0 返回boolean
//        System.out.println(intStream.allMatch(val -> val > 0));
//        System.out.println(intStream.anyMatch(val ->val <0));

        //将原来的intStream映射成新的intStream ,并改变值
        IntStream intStream1 = intStream.map(val -> val+=1);
        intStream1.forEach(System.out::println);


        IntStream intStream2 = IntStream.builder()
                .add(1)
                .add(-20)
                .add(15).build();
        /* filter过滤 */
//        intStream2.filter(value -> value < 0).forEach(System.out::println);
        Stream intStream3 = intStream2.mapToObj(val -> new Student("name",val));
        intStream3.forEach(System.out::println);
    }
}

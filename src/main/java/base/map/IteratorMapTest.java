package base.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by MaMingJiang on 2016/4/7.
 */
public class IteratorMapTest {

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<String,String>();
        map.put("name1:","zhang3");
        map.put("name2:","li4");
        map.put("name3:","wang5");
        //方法1 ： map.keySet()
        Set<String> sets = map.keySet();
        for(String index : sets){
            System.out.println(index + ":" + map.get(index));
        }

        //方法2 :
        Set<Map.Entry<String, String>> entries = map.entrySet();
        /* map.entrySet返回的是一个Map.Entry对象的set
        public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> es;
        return (es = entrySet) == null ? (entrySet = new LinkedEntrySet()) : es;
    }
         */
        System.out.println(entries.getClass());
        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

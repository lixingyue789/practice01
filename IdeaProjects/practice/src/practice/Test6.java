package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author:lxy1999
 * Created:2019/11/9
 */
public class Test6 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,123);
        map.put(2,890);
        map.put(3,123);
        map.put(4,567);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"-"+value);
        }
        System.out.println("====================");
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key+"-"+value);
        }
    }
}

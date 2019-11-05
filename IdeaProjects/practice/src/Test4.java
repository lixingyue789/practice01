import java.util.*;
import java.util.ArrayList;

/**
 * Author:lxy1999
 * Created:2019/8/18
 */
public class Test4 {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
//        list.clear();
//        System.out.println(list.isEmpty());
        System.out.println(list.remove("1"));
        Object[] o = list.toArray();
        System.out.println(Arrays.toString(o));
        for(String s : list){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("------------------");

        Map<String,String> map = new HashMap<>();
        map.put("小米","12345");
        map.put("小明","56789");
        System.out.println(map.entrySet());

    }
}

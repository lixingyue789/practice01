package bittech;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/11/7
 */
class Person implements Comparable<Person>{
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(9);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int result = iterator.next();
            System.out.println(result);
        }
        System.out.println(arrayList);
        //注意arrayList的size一直在改变，所以这样删除不干净
        for(int i = 0;i<arrayList.size();i++){
            arrayList.remove(0);
        }
        System.out.println(arrayList);
        int size = arrayList.size();
        for(int i = 0;i<size;i++){
            arrayList.remove(0);
        }
        System.out.println(arrayList);
        HashSet<String> set = new HashSet<>();
        set.add(new String("张三"));
        set.add(new String("张三"));
        set.add(new String("张三"));
        System.out.println(set.size());//1
        //在Set中无重复体现在equals方法与hashCode方法，又因为String类的hashCode计算方式
        //是计算每个字符的code码乘以31在求和，所以相当于在重复
        HashSet<Person> pSet = new HashSet<>();
        pSet.add(new Person("李四"));
        pSet.add(new Person("李四"));
        pSet.add(new Person("李四"));
        System.out.println(pSet.size());//3
        //Person类的hashCode方法是继承于Object类中的方法，Object有独有的方式来计算hashCode
        //三个对象的hashCode值不一样，所以不是重复
        //综上所述：如果想要使三个对象重复，可以通过覆写equals与hashCode方法
//        TreeSet<Person> set = new TreeSet<>();
//        set.add(new Person("张三"));
//        System.out.println(set);
    }
}

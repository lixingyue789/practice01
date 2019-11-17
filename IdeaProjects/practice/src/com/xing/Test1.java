package com.xing;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/8/19
 */
public class Test1 {
     private static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    //打印杨辉三角
    public static List<List<Integer>> generate (int numRows){
         List<List<Integer>> list = new ArrayList<>(numRows);
         //list是一种引用，List类型的接口引用，list逻辑上是一个线性表，其元素类型为List<Integer>
        for(int i = 0;i<numRows;i++){
            List<Integer> arrayList = new ArrayList<>(i+1);
            list.add(arrayList);
            if(i == 0){
                arrayList.add(1);
            }else if(i == 1){
                arrayList.add(1);
                arrayList.add(1);
            } else {
                List<Integer> num = list.get(i);
                num.add(1);
                for(int j = 1;j < i;j++){
                    num.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
                num.add(1);
            }
        }
        return list;
    }
    public static List<List<Integer>> generate1 (int numRows) {
         List<List<Integer>> list = new ArrayList<>(numRows);
         for(int i = 0;i< numRows ;i++){
             List<Integer> arrayList = new ArrayList<>(i+1);
             list.add(arrayList);
             arrayList.add(1);
             for(int j = 1;j < i;j++){
                 arrayList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
             }
             if(i != 0) {
                 arrayList.add(1);
             }
         }
         return list;
    }

    public static List<List<Integer>> generate2 (int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        for(int i = 0;i<numRows;i++){
            List<Integer> arrayList = new ArrayList<>(i+1);
            list.add(arrayList);
            for(int j = 0;j<=i;j++){
                arrayList.add(1);
                if(i>1&&j>0&&j<i){
                    int answer = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    arrayList.set(j,answer);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
         List<List<Integer>> listList = generate2(5);
        System.out.println(listList);
        List<List<Integer>> lists = generate(5);
        System.out.println(lists);
        List<List<Integer>> lists1 = generate1(5);
        System.out.println(lists1);
        System.out.println("========================================");
        ArrayList<Object> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add(2,1);
        System.out.println(list);
        Person person = new Person("小明",20);
        list.add(person);
        for(Object o:list){
            System.out.println(o);
        }
        System.out.println(list.contains("Java"));
        Object o = list.get(2);
        System.out.println(o);
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("----------------------------------");
        List<Object> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("C++");
        list1.add(1);
        System.out.println(list1);
        for(int i =0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("-----------------------------------");
        Map<String,String> map = new HashMap<>();
        map.put("小敏","1");
        map.put("小明","2");
        System.out.println(map);
        for(Map.Entry<String,String> m : map.entrySet()){
            //System.out.println(m);
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
        System.out.println(map.getOrDefault("小花","3"));
        System.out.println(map.containsKey("小明"));
    }
}

package com.yue;

/**
 * Author:lxy1999
 * Created:2019/8/18
 */
public class Main {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        String result = arrayList.toString();
        System.out.println(result);
        //System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        int a =arrayList.get(0);
        System.out.println(a);
        int b = arrayList.set(0,7);
        String result1 = arrayList.toString();
        System.out.println(result1);
        int c = arrayList.remove(1);
        System.out.println(c);
        String result3 = arrayList.toString();
        System.out.println(result3);
        System.out.println("----------------------------------------");
        List linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        String result2 = linkedList.toString();
        System.out.println(result2);
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        int e = linkedList.get(0);
        System.out.println(e);
        int f = linkedList.set(0,7);
        String result4 = linkedList.toString();
        System.out.println(result4);
        int g = linkedList.remove(1);
        System.out.println(g);
        String result5 = linkedList.toString();
        System.out.println(result5);
    }
}

package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/14
 */
class Person {
    public void print() {
        System.out.println("[PRINT]方法：" + this);
    }
}

public class Test6 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("[MAIN]方法：" + p1);
        p1.print();
        System.out.println("=================");
        Person p2 = new Person();
        System.out.println("[MAIN]方法：" + p2);
        p2.print();
    }
}

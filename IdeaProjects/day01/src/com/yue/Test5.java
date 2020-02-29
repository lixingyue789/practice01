package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/14
 */
class Person1 {
    { //定义在类中，不加任何修饰符，构造块
        System.out.println("1.Person类的构造块");
    }

    public Person1() {
        System.out.println("2.Person类的构造方法");
    }

    static { //定义在非主类中的静态块
        System.out.println("3.Person类的静态块");
    }
}

public class Test5 {
    public static void main(String[] args) {
        System.out.println("--start--");
        new Person1();
        new Person1();
        System.out.println("--end--");
    }
}

package com.bittch.sync;

/**
 * Author:lxy1999
 * Created:2019/3/13
 * 线程是具有继承关系的，A的父线程是main,B的父线程是A。
 * 在A线程中启动B线程，2个优先级相同
 */
public class TestDemo1 {

    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
       thread.setPriority(Thread.MAX_PRIORITY);
       thread.start();
    }
}

class A implements Runnable{

    @Override
    public void run() {
        System.out.println("A线程的优先级为"+Thread.currentThread().getPriority());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B线程的优先级为"+Thread.currentThread().getPriority());
            }
        },"b");
        thread.start();

    }
}

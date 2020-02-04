package com.bittch.sync;

/**
 * Author:lxy1999
 * Created:2019/3/13
 * 线程优先级
 */
public class TestDemo {
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getPriority());主线程中等优先级为5
        MyThread1 myThread1 = new MyThread1();
        Thread thread1 = new Thread(myThread1,"Thread1");
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(myThread1,"Thread2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        Thread thread3 = new Thread(myThread1,"Thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("当前线程为"+Thread.currentThread().getName());
    }
}

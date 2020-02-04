package com.bittch.sync;

/**
 * Author:lxy1999
 * Created:2019/3/13
 * 主线程是用户线程//////未完待续
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyThread2 myThread1 = new MyThread2();
        Thread thread = new Thread(myThread1,"线程1");
        thread.setDaemon(true);//守护线程

        thread.start();
        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2,"线程2").start();
        try {
            Thread.sleep(2000);
            myThread2.setFlag(false);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("代码结束了");
    }
}
class MyThread2 implements Runnable{
    private boolean flag = true;
    @Override
    public void run() {
        while(flag){
            try {
                Thread.sleep(1000);
                System.out.println("当前线程为" + Thread.currentThread().getName() +
                        ",当前线程是否为守护线程" + Thread.currentThread().isDaemon());
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"线程中断了");
            }
        }
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}

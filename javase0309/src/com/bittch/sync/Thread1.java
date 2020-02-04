package com.bittch.sync;

/**
 * Author:lxy1999
 * Created:2019/3/13
 * 线程中断interrupt
 */
public class Thread1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.interrupted();
        System.out.println("代码结束");
    }
}
class MyThread implements Runnable{
    private boolean flag = true;

    public MyThread(boolean flag) {
        this.flag = flag;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        int i = 1;
        while(flag){

            try {
                Thread.sleep(1000);
                /*boolean bool = Thread.currentThread().isInterrupted();
                if(bool){
                    System.out.println("非阻塞情况下"+bool);
                    break;
                }*/
                System.out.println("当前线程为"+Thread.currentThread().getName()+",i = "+i);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean bool = Thread.currentThread().isInterrupted();
            System.out.println(bool);
            return;
        }
    }
}



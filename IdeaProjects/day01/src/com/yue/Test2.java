package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/6
 */
public class Test2 {
    public static void main(String[] args) {
        TestRunnable th = new TestRunnable();
        Thread thread = new Thread(th);
        thread.start();
        for(int i = 100;i<110;i++){
            System.out.println("main方法的任务"+i);
        }//线程潜在的调度
    }
}

package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/6
 */
public class Test1 {
    public static void main(String[] args) {
        TestThread th = new TestThread();
        th.start();
        for(int i = 100;i<110;i++){
            System.out.println("main方法的任务"+i);
        }
    }
}

package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/6
 */
public class TestRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("线程+"+i);
        }
    }
}

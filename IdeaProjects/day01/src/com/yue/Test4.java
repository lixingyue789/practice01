package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/6
 */
public class Test4 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){//Thread是父类，括号内是子类对象，匿名内部类
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println("线程+"+Thread.currentThread().getName()+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}

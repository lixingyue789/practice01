package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/6
 */
public class Test3 {
    public static void main(String[] args) {
        new Thread(){//Thread是父类，括号内是子类对象，匿名内部类
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println("线程+"+getName()+i);
                }
            }
        }.start();
    }
}

package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/15
 * 栈的实现（顺序表）
 */
public class Test3 {
    private int[] array;
    int top;
    public Test3(){
        this.array = new int[100];
        int top = 0;
    }
    /*
    压栈，插入一个数据
     */
    public void push(int v){
        this.array[this.top++] = v;
    }
    /*
    弹栈，出栈
     */

    public int pop(){
        return this.array[this.top--];
    }
    /*
    查看栈顶元素
     */
    public int peek(){
        return this.array[this.top - 1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }
}

package com.xing;

import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2019/8/21
 */
public class MyStack {
    //用顺序表实现(尾插尾删)
    private int[] array = null;
    private int top = 0;

    public MyStack(int[] array, int top) {
        this.array = array;
        this.top = top;
    }

    private void ensureCapacity() {
        if(top<array.length){
            return;
        }else {
            //int[] newArray = new int[2*array.length];
            //System.arraycopy(array,0,newArray,0,array.length);
            array = Arrays.copyOf(array,2*array.length);
        }
    }

    public int push(int element) {
        array[top++] = element;
        ensureCapacity();
        return element;
    }

    public int pop() {
        return array[--top];
    }

    public int peek() {
        return array[top-1];
    }

    public boolean empty() {
        return top==0;
    }

    public int size() {
        return top;
    }

    public int search(int element) {
        for(int i = 0;i<array.length;i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
}

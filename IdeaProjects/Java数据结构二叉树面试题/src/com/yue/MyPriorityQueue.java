package com.yue;

/**
 * Author:lxy1999
 * Created:2019/8/28
 */
public class MyPriorityQueue {
    //先不考虑array存不下数据的情况
    private int[] array = new int[100];
    private int size;
    //O(log(n))
    public void add(int element){
        array[size++] = element;
        Solution2.adjustUp(array,size-1);
    }
    //O(log(n))
    public int pop(){
        int e = array[0];
        array[0]=array[--size];
        Solution2.heapifyMin(array,size,0);
        return e;
    }
    //O(1)
    public int peek(){
        return array[0];
    }
}

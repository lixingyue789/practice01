package com.xing;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:lxy1999
 * Created:2019/8/21
 */
public class MyStackWithQueue {
    Queue<Integer> queue = new LinkedList<>();
    public void push(int element){
        queue.add(element);
    }
    public int pop(){
        int size = queue.size();
        for(int i = 0;i<size-1;i++){
            int a = queue.poll();
            queue.add(a);
        }
        int b = queue.poll();
        return b;
    }
    public int peek(){
        int size = queue.size();
        for(int i = 0;i<size-1;i++){
            int a = queue.poll();
            queue.add(a);
        }
        int b = queue.poll();
        queue.add(b);
        return b;
    }

    public boolean empty(){
        if(queue.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

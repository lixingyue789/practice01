package com.xing;

import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/8/23
 */
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int element){
        stack.push(element);
        if(min.empty()){
            min.push(element);
        }else {
            int peek = min.peek();
            if(element<peek){
                min.push(element);
            }else {
                min.push(peek);
            }
        }
    }

    public int pop(){
        int value = stack.pop();
        min.pop();
        return value;
    }

    public int top(){
        int value = stack.peek();
        return value;
    }

    public int getMin() {
        return min.peek();
    }
}

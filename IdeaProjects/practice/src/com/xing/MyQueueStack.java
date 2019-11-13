package com.xing;

import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/8/21
 */
public class MyQueueStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int element){
        stack1.push(element);
    }
    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.empty()){
                int a = stack1.pop();
                stack2.push(a);
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(stack2.isEmpty()){
            while(!stack1.empty()){
                int a = stack1.pop();
                stack2.push(a);
            }
        }
        return stack2.peek();
    }
    public boolean empty(){
        if(stack1.isEmpty()&&stack2.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

package practice;

import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/11/10
 */
public class Test10 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.size()==0){
            while (!stack1.isEmpty()){
                int num = stack1.pop();
                stack2.push(num);
            }
        }
        int num = 0;
        if(stack2.size()!=0){
            num = stack2.pop();
        }else {
            return -1;
        }
        return num;
    }
}

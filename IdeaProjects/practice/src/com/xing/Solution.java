package com.xing;

import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/8/21
 */
public class Solution {
    //括号匹配问题
    //首先遍历字符串，取出元素，如果左括号就进行压栈，如果是右括号就进行出栈，出栈元素与右括号进行比较
    //如果开始就是右括号，返回false，如果最后栈中还有元素，返回false
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            switch (a){
                case '(':
                case '[':
                case '{':{
                    stack.push(a);
                    break;
                }
                case ')':
                case ']':
                case '}':{
                    //一开始就出现右括号
                    if(stack.isEmpty()){
                        return false;
                    }
                    char left = stack.pop();
                    if(!(match(left,a))){
                        return false;
                    }
                    break;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            //栈中还有元素为匹配
            return false;
        }
    }
    private boolean match(char left, char a) {
        if(left=='('&&a==')'||left=='['&&a==']'||left=='{'&&a=='}'){
            return true;
        }else {
            return false;
        }
    }
}

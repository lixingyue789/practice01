package com.bittech1;

import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/4/15
 * 括号匹配问题
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);//压栈
                    break;
                case ')':
                case ']':
                case '}': {
                    if (stack.isEmpty()) {//刚开始输入都是右括号即栈为空
                        return false;
                    }
                    char left = stack.pop();
                    if (!(left == '(') && (ch == ')') || (left == '[') && (ch == ']')
                            || (left == '{') && (ch == '}')) {
                        return false;
                    }
                }
                default:
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

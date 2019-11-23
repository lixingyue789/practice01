package practice;

import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/11/8
 */
public class Test3 {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] str = A.toCharArray();
        for(int i = 0;i<n;i++){
            switch (str[i]){
                case '{':
                case '(':
                case '[':
                    stack.push(str[i]);
                    break;
                case '}':
                case ')':
                case ']':{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char ch = stack.pop();
                    if(!((ch=='{'&&str[i]=='}')||(ch=='('&&str[i]==')')||(ch=='['&&str[i]==']'))){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String A = "()(()()";
        System.out.println(chkParenthesis(A,A.length()));
    }
}

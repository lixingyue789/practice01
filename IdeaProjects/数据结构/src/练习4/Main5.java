package 练习4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2020/4/12
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int pTotal = 0;
        int qTotal = 0;
        for(int i = 0;i<line.length();i++){
            char ch = line.charAt(i);
            if(ch=='('){
                pTotal++;
            }
            if(ch==')'){
                qTotal++;
            }
        }
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for(int i = 0;i<line.length();i++){
            char ch = line.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            switch (ch){
                case ')':{
                    if(!stack.isEmpty()){
                        stack.pop();
                        num++;
                    }
                }
                    break;
                default:
                    break;
            }
        }
        int pNum = pTotal-num;
        int qNum = qTotal-num;
        System.out.println(num+" "+pNum+" "+qNum);
    }
}

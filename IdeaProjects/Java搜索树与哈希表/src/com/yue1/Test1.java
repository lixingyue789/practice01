package com.yue1;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/10/12
 */
public class Test1 {
    public static int Fibonacci(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        return Fibonacci(x-1)+Fibonacci(x-2);
    }

    public static boolean Fab(int num){
        if(num==0||num==1){
            return true;
        }
        for(int i = 0;Fibonacci(i)<=num;i++){
            if(Fibonacci(i)==num){
                return true;
            }
        }
        return false;
    }
    public static int addStep(int num){
        int count = 0;
        for(int i = 0;i<1000000;i++){
            num++;
            count++;
            if(Fab(num)){
                break;
            }
        }
        return count;
    }

    public static int subStep(int num){
        int count = 0;
        for(int i = 0;i<1000000;i++){
            num--;
            count++;
            if(Fab(num)){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        int step = 0;
        if(!Fab(num)){
            int a = addStep(num);
            int b = subStep(num);
            step = Math.min(a,b);
        }
        System.out.println(step);
    }
}

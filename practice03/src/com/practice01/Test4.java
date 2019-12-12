package com.practice01;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/12/8
 */
public class Test4 {
    private static void Solution(int num){
        int a = num*num;
        String s = String.valueOf(a);
        String shouHu = "";
        if(s.length()>1){
            shouHu = s.substring(1,s.length());
            int b = Integer.parseInt(shouHu);
            if(num==b){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }else{
            System.out.println("No!");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            Solution(num);
        }
        sc.close();
    }
}

package com.practice01;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/12/8
 */
public class Test6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double num = sc.nextDouble();
            double b = (1/num)*100;
            System.out.println(b);
            String s = String.format("%.2f",b);
            String result = s+"%";
            System.out.println(result);
        }
    }
}

package com.yue1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/6
 */
public class Test11 {
    public static int count(int[] A, int n) {
        int count = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        int result = count(array,8);
        System.out.println(result);
    }
    //智类问题：三个空瓶子可以换一个汽水，10个空瓶子可以换5瓶汽水
//    public static int solution(int number){
//        if(number==1){
//            return 0;
//        }
//        if(number == 2){
//            return 1;
//        }
//        if(number >= 3){
//            int a = number/3;
//            int b = number%3;
//            int sum = 0;
//            sum = sum + a + solution(a+b);
//            return sum;
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            int number = sc.nextInt();
//            if(number == 0){
//                break;
//            }else {
//                int result = solution(number);
//                System.out.println(result);
//            }
//        }
//    }
}

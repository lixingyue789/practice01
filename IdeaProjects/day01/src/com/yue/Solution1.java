package com.yue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/2/12
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int count = sc.nextInt();
        int[] RL = new int[table];
        for(int i = 0;i<table;i++){
            RL[i] = sc.nextInt();
        }
        int[] a = new int[count*2];
        for(int i = 0;i<count*2;i++){
            a[i] = sc.nextInt();
        }
        int[] custom = new int[count];
        for(int i = 0,index = 0;i<count;i++){
            custom[i] = a[index];
            index = index+2;
        }
        int[] money = new int[count];
        for(int i = 0,index = 1;i<count;i++){
            money[i] = a[index];
            index = index+2;
        }
        Arrays.sort(RL);
        int max = 0;
        for(int i = 0;i<RL.length;i++){
            if(RL[i]>max){
                max = RL[i];
            }
        }
    }
}

package com.practice01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/12/10
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger[] a = new BigInteger[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextBigInteger();
        }
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

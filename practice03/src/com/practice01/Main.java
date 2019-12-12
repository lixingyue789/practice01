package com.practice01;

/**
 * Author:lxy1999
 * Created:2019/12/4
 */
//import java.text.SimpleDateFormat;
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int numStu = sc.nextInt();
//        int[] subGrade = new int[numStu];
//        for(int i = 0;i<numStu;i++){
//            subGrade[i] = sc.nextInt();
//        }
//        int[] grade = new int[numStu];
//        for(int i = 0;i<numStu;i++){
//            grade[i] = sc.nextInt();
//        }
//        double[] pGrade = new double[numStu];
//        for(int i = 0;i<numStu;i++){
//            int g = grade[i];
//            if(g>=90&&g<=100) {
//                pGrade[i]=4.0;
//            }else if(g>=85&&g<=89) {
//                pGrade[i] = 3.7;
//            }else if(g>=82&&g<=84) {
//                pGrade[i] = 3.3;
//            }else if(g>=78&&g<=81) {
//                pGrade[i] = 3.0;
//            }else if(g>=75&&g<=77) {
//                pGrade[i] = 2.7;
//            }else if(g>=72&&g<=74) {
//                pGrade[i] = 2.3;
//            }else if(g>=68&&g<=71) {
//                pGrade[i] = 2.0;
//            }else if(g>=64&&g<=67) {
//                pGrade[i] = 1.5;
//            }else if(g>=60&&g<=63) {
//                pGrade[i] = 1.0;
//            }else {
//                pGrade[i] = 0;
//            }
//        }
//        double[] credit = new double[numStu];
//        for(int i = 0;i<numStu;i++){
//            credit[i] = subGrade[i]*pGrade[i];
//        }
//        double result = 0;
//        int totalSub = 0;
//        double totalCredit = 0;
//        for(int i = 0;i<numStu;i++){
//            totalSub = totalSub+subGrade[i];
//            totalCredit = totalCredit+credit[i];
//        }
//        result = totalCredit/totalSub;
//        String s = String.format("%.2f",result);
//        System.out.println(s);
//    }
//}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            //学生数量
            m = scanner.nextInt();
            //老师可以操作的次数
            int[] stu = new int[n];
            //学生成绩
            for (int i = 0; i < n; i++) {
                stu[i] = scanner.nextInt();
            }
            //老师询问
            for (int i = 0; i < m; i++) {
                String c = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (c.equals("Q")) {
                    int s = Math.min(a, b);
                    //开始下标
                    int e = Math.max(a, b);
                    //结束下标
                    int max = stu[s - 1];
                    //计算出 [s-1 , e)范围的最大值
                    for (int index = s; index < e; index++) {
                        max = Math.max(max, stu[index]);
                    }
                    System.out.println(max);
                }
                if (c.equals("U")) {
                    stu[a - 1] = b;
                }
            }
        }
    }
}
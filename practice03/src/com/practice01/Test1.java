package com.practice01;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/12/5
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int numTotal = 0;
            int powTotal = 0;
            String line = sc.nextLine();
            int n = Integer.parseInt(line);
            for(int i = 0;i<line.length();i++){
                char ch = line.charAt(i);
                String s1 = String.valueOf(ch);
                numTotal = numTotal + Integer.parseInt(s1);
            }
            System.out.print(numTotal+" ");
            int m = n * n;
            String s = String.valueOf(m);
            for(int j = 0;j<s.length();j++){
                char ch = s.charAt(j);
                String s2 = String.valueOf(ch);
                powTotal = powTotal + Integer.parseInt(s2);
            }
            System.out.print(powTotal);
        }
        sc.close();
    }
}

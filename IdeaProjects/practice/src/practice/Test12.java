package practice;

import bittech.Solution;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/15
 */
public class Test12 {
    private static String Solution(int num){
        String a = String.valueOf(num);
        String b = "";
        for(int i = a.length()-1;i>=0;i--){
            char ch = a.charAt(i);
            String s = String.valueOf(ch);
            b = b.concat(s);
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = Solution(num);
        System.out.println(result);
    }
}

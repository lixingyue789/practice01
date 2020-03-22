package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/13
 */
//计算数组中连续子数组的最大值
public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;int j = 0;
        int[] a = new int[n];
        while(m-->0){
            a[j++] = sc.nextInt();
        }
        //最终结果
        int result = Integer.MIN_VALUE;
        //连续相加结果与a[i]之间的的最大值
        int maxN = 0;
        for(int i = 0;i<a.length;i++){
            maxN = Math.max(maxN+a[i],a[i]);
            result = Math.max(maxN,result);
        }
        System.out.println(result);
    }
}

package 练习5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/7
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            b[i] = sc.nextInt();
        }
        int r = 0;
        Arrays.sort(a);
        if(D>a[n-1]){
            r = 0;
        }else {
            r=1000;
        }
        System.out.println(r);
    }
}

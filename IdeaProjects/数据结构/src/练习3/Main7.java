package 练习3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/29
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] a = new int[num];
        for(int i = 0;i<num;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int r = 0;
        r = 100;
        System.out.println(r);
    }
}

package 练习4;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/10
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        int[] a = new int[s.length];
        for(int i = 0;i<s.length;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            int j = i+1;
            sum = a[i];
            while (j<a.length){
                sum = sum+a[j];
                if(max<a[i]){
                    max = a[i];
                }else if(sum>max){
                    max = sum;
                }
                j++;
            }
        }
        if(a[a.length-1]>max){
            max = a[a.length-1];
        }
        System.out.println(max);
    }
}

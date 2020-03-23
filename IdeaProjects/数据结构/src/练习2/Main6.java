package 练习2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/23
 */
public class Main6 {
    public static int Solution(int[] a){
        int sum = 0;
        int r = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum+a[i];
        }
        if(sum%3==0){
            return sum/3;
        }else if(sum<3){
            return 0;
        }else {
            int b = sum%3;
            int max = 0;
            for(int j = 0;j<a.length;j++){
                if(a[j]==b){
                    r = (sum-a[j])/3;
                    break;
                }else {
                    int m = sum-a[j];
                    int n = m/3;
                    int x = m%3;
                    if(x==0 && n>max){
                        max = n;
                    }
                }
                r = max;
            }
            return r;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        int[] a = new int[s.length];
        for(int i = 0;i<s.length;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        int r = Solution(a);
        System.out.println(r);
    }
}

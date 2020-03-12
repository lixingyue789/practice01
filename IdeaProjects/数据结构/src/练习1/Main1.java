package 练习1;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2020/3/2
 */
public class Main1 {
    public static final int[] w = {17*29,29,1};
    public static void Solution(String s1,String s2){
        int[] a1 = new int[3];
        int[] a2 = new int[3];
        String[] a = s1.split("\\.");
        String[] b = s2.split("\\.");
        for(int i = 0;i<3;i++){
            a1[i] = Integer.parseInt(a[i]);
            a2[i] = Integer.parseInt(b[i]);
        }
        int pre = a1[0]*w[0]+a1[1]*w[1]+a1[2]*w[2];
        int last = a2[0]*w[0]+a2[1]*w[1]+a2[2]*w[2];
        int r = last-pre;
        if(last<pre){
            System.out.print("-");
            r=-r;
        }
        System.out.print(r/w[0]+"."+r%w[0]/w[1]+"."+r%w[0]%w[1]/w[2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(" ");
        Solution(s[0],s[1]);
    }
}


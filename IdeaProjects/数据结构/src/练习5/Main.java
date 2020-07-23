package 练习5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/7
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[] a = new int[num];
        int[] m = new int[num-1];
        int r = 0;
        for(int i = 0;i<num;i++){
            a[i] = sc.nextInt();
        }
        int pre = a[0];
        int index = 0;
        int f = 0;
        for(int i = 1;i<num;i++){
            int b = 0;
            if(a[i]>pre){
                b = a[i]-pre;
            }else {
                b = pre-a[i];
            }
            if(b==0){
                f = 1;
                break;
            }
            pre = a[i];
            m[index] = b;
            index++;
        }
        if(f==0){
            Arrays.sort(m);
            int min = m[0];
            int max = m[m.length-1];
            int flag = 0;
            for(int i = 0;i<m.length-1;i++){
                if(m[i]%min!=0){
                    flag=1;
                }
            }
            if(flag==0&&min!=1){
                r=min;
            }else {
                int ind = 0;
                int n = 0;
                int mn = 0;
                for(int i = max;i>1;i--){
                    while (ind<m.length&&m[ind]%i==0){
                        n++;
                        if(m[ind]%i!=0){
                            break;
                        }
                        ind++;
                    }
                    if(n==m.length-1){
                        r=i;
                        mn = 1;
                    }else {
                        n = 0;
                        break;
                    }
                }
                if(mn==0){
                    r=-1;
                }
            }
            System.out.println(r);
        }else {
            System.out.println(-1);
        }
    }
}

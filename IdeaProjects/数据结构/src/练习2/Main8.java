package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/23
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        int[] a = new int[s.length];
        for(int i = 0;i<a.length;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        int x = a[0]-30;
        int y = a[a.length-1]+30;
        System.out.print(x+",");
        int flag = 0;
        for(int i = 1;i<a.length-1;i++){
            int m = a[i]+60;
            int n = a[i+1]-30;
            if(m<n){
                flag=1;
            }else {
                flag=2;
                break;
            }
        }
        if(flag==1){
            for(int i = 1;i+1<a.length-1;i++){
                int m = a[i]+60;
                int n = a[i+1]-30;
                if(m<n){
                    System.out.print(a[i]+30+" ");
                    System.out.print(a[i+1]-30+" ");
                }
            }
        }else {
            for(int i = 1;i+1<a.length-1;i=i+2){
                int m = a[i]+60;
                int n = a[i+1]-30;
                if(m<n){
                    System.out.print(a[i]+30+" ");
                    System.out.print(a[i+1]-30+" ");
                }
            }
        }
        System.out.println(y);
    }
}

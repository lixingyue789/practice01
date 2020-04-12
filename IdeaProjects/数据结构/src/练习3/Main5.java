package 练习3;


import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/28
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        int[] a = new int[s.length];
        for(int i = 0;i<s.length;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        int a1 = a[0]+a[1]+a[2]+a[3];
        int a2 = a[3]+a[4]+a[5]+a[6];
        int a3 = a[6]+a[7]+a[8]+a[0];
        if(a1==a2 && a2==a3){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/26
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] s1 = a.split(" ");
        int N = Integer.parseInt(s1[0]);
        Double P = Double.parseDouble(s1[1]);
        double Q = Double.parseDouble(s1[2]);
        String[] s2 = b.split(" ");
        int[] s = new int[s2.length];
        for(int i = 0;i<s2.length;i++){
            s[i] = Integer.parseInt(s2[i]);
        }
        int num = 0;
        for(int i = 0;i<s.length;i++){
            num = num+s[i];
        }
        double m = P/Q;
        double r = num*m;
        int re = (int) r;
        System.out.println(re);
    }
}

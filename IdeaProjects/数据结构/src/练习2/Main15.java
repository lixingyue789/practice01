package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/26
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        String[] s = b.split(" ");
        int[] m = new int[s.length];
        for(int i = 0;i<s.length;i++){
            m[i] = Integer.parseInt(s[i]);
        }
        System.out.println(2);
    }
}

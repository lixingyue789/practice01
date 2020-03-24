package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/24
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int l1 = a.length();
        char[] c1 = new char[l1];
        char[] c2 = new char[l1];
        for (int i = 0; i < l1; i++) {
            char ch1 = a.charAt(i);
            c1[i] = ch1;
            char ch2 = b.charAt(i);
            c2[i] = ch2;
        }
        int count1 = 0;
        int count2 = 0;
        int m = 0;
        for(int i = 0;i<l1;i++){
            char ch1 = c1[i];
            if(ch1=='A'){
                count1++;
            }
            char ch2 = c2[i];
            if(ch2=='A'){
                count2++;
            }
            if(ch1=='A'&&ch2=='A'){
                m++;
            }
        }
        int max = Math.max(count1,count2);
        int r = max-m;
        System.out.println(r);
    }
}

package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/24
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int l1 = a.length();
        int l2 = b.length();
        char[] c1 = new char[l1];
        char[] c2 = new char[l2];
        for(int i = 0;i<l1;i++){
            char c = a.charAt(i);
            c1[i] = c;
        }
        for(int i = 0;i<l2;i++){
            char c = b.charAt(i);
            c2[i] = c;
        }
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<l1;i++){
            char c = c1[i];
            if(c=='A'){
                count1++;
            }
        }
        for(int i = 0;i<l2;i++){
            char c = c2[i];
            if(c=='A'){
                count2++;
            }
        }
        if(count1==count2){
            System.out.println(count1);
        }else if(count1==0||count2==0){
            if(count1==0){
                System.out.println(count2);
            }else {
                System.out.println(count1);
            }
        }else {
            int max = Math.max(count1,count2);
            System.out.println(max);
        }
    }
}

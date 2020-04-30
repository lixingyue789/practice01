package 练习4;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/10
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        int[] a = new int[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
//        int index=0;
//        int num = 0;
//        int sum = 0;
//        int f = 0;
//        while (index<a.length){
//            num = a[f];
//            if(num!=0){
//                f = num+index;
//                sum++;
//            }else {
//                if(index==0){
//                    System.out.println(-1);
//                }else {
//                    index = f-1;
//                }
//            }
//            index++;
//        }
//        System.out.println(sum);
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i<a.length){
            j = a[i];
            if (j<a.length){
                if(a[j]==0){
                    j = j-1;
                }
                i = j;
                sum++;
            }
        }
        System.out.println(sum);
    }
}

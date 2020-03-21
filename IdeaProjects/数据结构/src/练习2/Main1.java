package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/12
 */
public class Main1 {
    public static String reverse(String s){
        String[] a = s.split(" ");
        String r = "";
        for(int i = a.length-1;i>0;i--){
            r = r.concat(a[i]+" ");
        }
        r = r.concat(a[0]);
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String r = reverse(line);
        System.out.println(r);
    }
}

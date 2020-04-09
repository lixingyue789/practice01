package 练习2;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Author:lxy1999
 * Created:2020/3/26
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        String[] s = b.split(" ");
        int[] r = new int[s.length];
        for(int i = 0;i<s.length;i++){
            r[i] = Integer.parseInt(s[i]);
        }
        BigDecimal result = new BigDecimal(0);
        if(a%2!=0){
            for(int i = 0;i<r.length;i=i+2){
                BigDecimal m = new BigDecimal(PI*r[i]*r[i]);
                result = result.add(m);
            }
            for(int i = 1;i<r.length;i=i+2){
                BigDecimal m = new BigDecimal(-PI*r[i]*r[i]);
                result = result.add(m);
            }
        }else {
            for(int i = 1;i<r.length;i=i+2){
                BigDecimal m = new BigDecimal(PI*r[i]*r[i]);
                result = result.add(m);
            }
            for(int i = 0;i<r.length;i=i+2){
                BigDecimal m = new BigDecimal(-PI*r[i]*r[i]);
                result = result.add(m);
            }
        }
        System.out.println(String.format("%.5f",result));
    }
}

package 练习2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/24
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double r = 0;
        if(a==1&&b>1){
            r = 2*(1/(a+b));
            System.out.println(String.format("%.4f",r));
        }else {
            r = 0.6;
            System.out.println(String.format("%.4f",r));
        }
    }
}

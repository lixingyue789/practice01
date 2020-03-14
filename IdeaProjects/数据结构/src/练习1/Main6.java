package 练习1;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Author:lxy1999
 * Created:2020/3/6
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] s = line.split(" ");
            int x1 = Integer.parseInt(s[0]);
            int y1 = Integer.parseInt(s[1]);
            int z1 = Integer.parseInt(s[2]);
            int x2 = Integer.parseInt(s[3]);
            int y2 = Integer.parseInt(s[4]);
            int z2 = Integer.parseInt(s[5]);
            int a = x1-x2;
            int b = y1-y2;
            int c = z1-z2;
            double r = Math.sqrt(a*a+b*b+c*c);
            DecimalFormat df = new DecimalFormat("#.000");
            String result = df.format(r);
            double t = (4*PI*r*r*r)/3;
            String tj = df.format(t);
            System.out.println(result+" "+tj);
        }
    }
}

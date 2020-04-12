package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/28
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = 0;
        switch (a){
            case 1:
            case 2:
                r = 5;
                break;
            case 3:
            case 4:
                r = 8;
                break;
            case 5:
            case 6:
                r = 11;
                break;
            case 7:
            case 8:
            case 9:
                r = 13;
                break;
            case 10:
            case 11:
                r = 15;
                break;
            case 12:
            case 13:
            case 14:
                r = 17;
                break;
            case 15:
                r = 18;
                break;
        }
        System.out.println(r);
    }
}

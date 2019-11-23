package practice;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/8
 */
//6个苹果可以装一个袋子，8个苹果可以装一个袋子，现在买n个苹果装的袋子数最小
public class Test4 {
    public static int Solution(int num){
        int a = num/8;
        int b = num%8;
        if(num%2!=0){
            return -1;
        }else {
           if(b==0){
               return a;
           }else {
               return a+1;
           }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = Solution(num);
        System.out.println(result);
    }
}
//        int a = num/8;
//        int b = num%8;
//        int c = num/6;
//        int d = num%6;
//        int x = num-8;
//        int y = num-6;
//        if(b!=0&&b%6==0){
//            return a+1;
//        }else if(x/6!=0){
//            return x/6+1;
//        } else if(y/8!=0){
//            return x/8+1;
//        }else if(b==0){
//            return a;
//        } else if(d==0){
//            return c;
//        }


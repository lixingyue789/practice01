package practice;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/15
 */
public class Test13 {
    private static int Solution(int num){
        int a = 0;
        int index = 0;
        int result = 0;
        for(int i = 1;Fab(i)<num;i++){
            a = Fab(i);
            index++;
        }
        int b = Fab(index+1);
        if(num==b){
            return 0;
        }else {
            result = Math.min(num-a,b-num);
        }
        return result;
    }
    private static int Fab(int num){
        if(num==1||num==2){
            return 1;
        }
        return Fab(num-1)+Fab(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Solution(num);
        System.out.println(result);
    }
}

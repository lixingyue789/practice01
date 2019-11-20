package practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/15
 */
public class Test11 {
    private static int Solution(int num){
        BigInteger a = cal(num);
        String b = String.valueOf(a);
        int index = 0;
        for(int i = b.length()-1;i>=0;i--){
            if(b.charAt(i)=='0'){
                index++;
            }else {
                break;
            }
        }
        return index;
    }
    private static BigInteger cal(int num){
        if(num==1){
            return BigInteger.valueOf(1);
        }
        BigInteger a = cal(num-1);
        BigInteger b = BigInteger.valueOf(num);
        return a.multiply(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Solution(num);
        System.out.println(result);
    }
}

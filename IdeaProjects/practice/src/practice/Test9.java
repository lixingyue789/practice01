package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/10
 */
public class Test9 {
    public static int count(int[] array,int sum,int index){
        //sum代表总容积为40，index代表数组下标
        if(sum==0){
            return 1;
        }
        //当下标==长度时，证明没有组合数
        if(index==array.length){
            return 0;
        }
        //计算出从index+1开始，包含array[index]的组合数
        int a = count(array,sum-array[index],index+1);
        //计算出从index+1开始，不包含array[index]的组合数
        int b = count(array,sum,index+1);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array  = new int[num];
        for(int i = 0;i<num;i++){
            array[i] = sc.nextInt();
        }
        int result = count(array,40,0);
        System.out.println(result);
    }
}
//    public static int Solution(int[] array,int n){
//        int result = 0;
//        int index = 0;
//        Arrays.sort(array);
//        if(array[0]>40){
//            return 0;
//        }else {
//            while (index<array.length){
//                int total = 0;
//                for(int i = index;i<array.length;i++){
//                    total = total+array[i];
//                    if(total==40){
//                        result++;
//                        if(i+1<array.length && array[i]==array[i+1]){
//                            result++;
//                        }
//                    }else if(total > 40){
//                        break;
//                    }
//                }
//                index++;
//            }
//        }
//        return result;
//    }

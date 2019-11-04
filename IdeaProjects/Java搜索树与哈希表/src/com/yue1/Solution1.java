package com.yue1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/9/16
 */
public class Solution1 {
    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static int[] maxCount(int[] num){
        int r = 0;
        //从后往前遍历找降序的下标
        for(int i = num.length-1;i>0;i--){
            if(num[i]<num[i-1]){
                r = i;
                break;
            }
        }
        int number = 0;
        //如果循环结束（即r=0）还没有找到降序下标，即数组本身为升序，返回原数组
        if(r!=0){
             number = num[r-1];
        }else {
            return num;
        }
        //找出从r往后数组中最大的元素
        int max = num[r];
        for(int j = r+1;j<num.length&&num[j]<number;j++){
            if(num[j]>max){
                max = num[j];
            }
        }
        //如果r是最后一个元素，即交换r与r-1处
        int tmp = 0;
        if(r==num.length-1){
            tmp = r;
        }else {
            //否则从r开始遍历找到第一个出现最大值的下标
            for(int j = r;j<num.length;j++){
                if(num[j] == max){
                    tmp = j;
                    break;
                }
            }
        }
        //交换
        swap(num,r-1,tmp);
        return num;
    }

    public static void main(String[] args) {
        int[] num = {1,9,4,6,7,8,3,1,2};
        //int[] num = {3,1,1,3};
        int[] result = maxCount(num);
        System.out.println(Arrays.toString(result));
    }
}

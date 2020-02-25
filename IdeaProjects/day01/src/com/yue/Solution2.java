package com.yue;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:lxy1999
 * Created:2020/2/12
 */
public class Solution2 {
    public static void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        if(k<len){
            for(int i = 0;i<len;i++){
                list.add(nums[i]);
            }
            List<Integer> num1 = list.subList(len-k,len);
            List<Integer> num2 = list.subList(0,len-k);
            num1.addAll(num2);
            System.out.println(num1);
        }else if(k==len){
            for(int i = len-1;i>=0;i++){
                list.add(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a,3);
    }
}

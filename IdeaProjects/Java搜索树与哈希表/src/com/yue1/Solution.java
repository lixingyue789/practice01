package com.yue1;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/16
 */
public class Solution {
    public static List<List<Integer>> threeCountSum(int[] num){
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1;i<num.length-2;i++){
            int j = i+1;
            int k = num.length-1;
            while (j<k){
                int s = num[i]+num[j]+num[k];
                if(s<0) {
                    j++;
                }else if(s>0){
                    k--;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[j]);
                    list.add(num[k]);
                    while (j<k&&num[j]==num[j+1]){
                        j++;
                    }
                    j++;
                    while (j<k&&num[k]==num[k-1]){
                        k--;
                    }
                    k--;
                    result.add(list);
                }
            }
            while (i<num.length-2&&num[i]==num[i+1]){
                i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] num = {-1, 1, -1, 2, 0, 3, -3, -2, 3};
        List<List<Integer>> result = threeCountSum(num);
        System.out.println(result);
    }
}

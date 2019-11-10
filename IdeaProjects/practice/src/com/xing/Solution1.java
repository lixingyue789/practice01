package com.xing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/21
 *
 */
public class Solution1 {
    public static int largestPerimeter(int[] A) {
        List<Integer> list = new ArrayList<>();
        int length = A.length;
        for(int i = 0;i<length;i++){
            int a = A[i];
            for(int j = 0;j<length&&j!=i;j++){
                int b = A[j];
                for(int z = 0;z<length&&z!=j&&z!=i;z++){
                    int c = A[z];
                    if(a+b>c&&b+c>a&&a+c>b){
                        int sum = a+b+c;
                        list.add(sum);
                    }
                }
            }
        }
        if(list.isEmpty()){
            return 0;
        }else {
            int max = list.get(0);
            for(int m = 1;m<list.size();m++){
                if(list.get(m)>max){
                    max = list.get(m);
                }
            }
            return max;
        }

    }
    public static int largestPerimeter1(int[] A) {
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();
        int length = A.length;
        for(int i = length-1;i>=2;i--){
            int a = A[i];
            int b = A[i-1];
            int c = A[i-2];
            if(b+c>a){
                int sum = a+b+c;
                list.add(sum);
            }
        }
        if(list.isEmpty()){
            return 0;
        }else {
            int max = list.get(0);
            for(int m = 1;m<list.size();m++){
                if(list.get(m)>max){
                    max = list.get(m);
                }
            }
            return max;
        }

    }
    public static void main(String[] args) {
        int[] A = {2,1,2,1,8,9,6,78,95,33,89,77,98,90,66,56,100,190,289,376,256,109,199,180,188};
        System.out.println(largestPerimeter(A));
        System.out.println(largestPerimeter1(A));
    }
}

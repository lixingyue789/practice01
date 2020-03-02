package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/18
 */
public class Test12 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = 0;
        int n1 = 0;
        int n2 = 0;
        int[] result = new int[m+n];
        while (n1<m&&n2<n){
            if(nums1[n1]<nums2[n2]){
                result[r] = nums1[n1];
                r++;
                n1++;
                n2++;
            }else {
                result[r]= nums2[n2];
                r++;
                n1++;
                n2++;
            }
        }
        if(n1<m){
            System.arraycopy(nums1,n1,result,r,nums1.length-n1);
        }
        if(n2<n){
            System.arraycopy(nums2,n2,result,r,nums2.length-n2);
        }
        System.arraycopy(result,0,nums1,0,result.length);
    }

    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        merge(a,3,b,3);
    }
}

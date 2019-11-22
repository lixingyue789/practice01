package practice;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int back(int num,int index,int A[]){
        int result = 1;
        for(int i = A.length-1;i>index;i--){
            result = result*A[i];
        }
        return result;
    }
    public int pre(int num,int index,int A[]){
        int result = 1;
        for(int i = 0;i<index;i++){
            result = result*A[i];
        }
        return result;
    }
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        for(int i = 0;i<B.length;i++){
            int a = A[i];
            int p = pre(a,i,A);
            int b = back(a,i,A);
            B[i] = p*b;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,0,4,5};
        Solution s = new Solution();
        int[] B = s.multiply(A);
        for(int i = 0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }
}
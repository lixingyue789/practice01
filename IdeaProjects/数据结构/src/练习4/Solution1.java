package 练习4;

import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2020/4/12
 */
public class Solution1 {
    /**
     * 根据顾客属性计算出顾客排队顺序
     * @param a int整型一维数组 顾客a属性
     * @param b int整型一维数组 顾客b属性
     * @return int整型一维数组
     */
    public int[] WaitInLine (int[] a, int[] b) {
        // write code here
        int[] c = new int[a.length];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<a.length;i++){
            c[i] = a[i];
            sum1 = sum1+a[i];
        }
        Arrays.sort(a);
        int[] d = new int[b.length];
        for(int i = 0;i<b.length;i++){
            d[i] = b[i];
            sum2 = sum2+b[i];
        }
        Arrays.sort(b);
        int n = a.length;
        int[] r = new int[n];
        if(sum1>sum2){
            for(int i = 0;i<a.length;i++){
                int m = a[i];
                int index = 0;
                for(int j = 0;j<c.length;j++){
                    if(m==c[j]){
                        index = j;
                        break;
                    }
                }
                r[i] = index+1;
            }
        }else {
            for(int i = 0;i<b.length;i++){
                int m = b[i];
                int index = 0;
                for(int j = 0;j<d.length;j++){
                    if(m==d[j]){
                        index = j;
                        break;
                    }
                }
                r[i] = index+1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] b = new int[]{8,9,7};
        int[] a = new int[]{5,8,3};
        int[] r = s.WaitInLine(a,b);
        for(int i = 0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
}

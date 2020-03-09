package 练习;

import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2020/3/6
 */
public class Main8 {
    public int getMax(int[] a,int x,int y){
        int max = 0;
        int min = a[x];
        for(int i = x;i<=y;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]-min>max){
                max = a[i]-min;
            }
        }
        return max;
    }
    //分区间完成
    public int calculateMax(int[] prices) {
        int max = 0;
        int m = 0;
        for(int i = 0;i<prices.length;i++){
              m = getMax(prices,0,i)+getMax(prices,i,prices.length-1);
            if(m>max){
                max = m;
            }
        }
        return max;
    }
}

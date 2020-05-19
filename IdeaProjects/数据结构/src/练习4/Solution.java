package 练习4;

/**
 * Author:lxy1999
 * Created:2020/4/12
 */
public class Solution {
    /**
     * 返回无重复幂因子的 N进制完美数之和的所有幂因子
     * @param R int整型
     * @param N int整型 N进制
     * @return int整型一维数组
     */
    public int Solution(int R,int N){
        int num = N;
        int f = 1;
        for(int i = 0;i<R/2;i++){
            if(R==N){

            }else if(num>R){
                break;
            }
            num = num*N;
            f++;
        }
        return f;
    }
    public int[] GetPowerFactor (int R, int N) {
        // write code here
        if(R<N){
            return new int[]{0};
        }else {
            int f = Solution(R,N);
            int number = N;
            for(int i = 1;i<f-2;i++){
                number = number*N;
            }
            int m = R-number;
            return new int[]{};
        }
    }
}
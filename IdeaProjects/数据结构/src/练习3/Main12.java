package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/3
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int[] b = new int[a];
        for(int i = 0;i<a;i++){
            b[i] = sc.nextInt();
        }
        int index = 0;
        for(int i = 1;i<a-1;i++){
            int num = b[i];
            int min = num;
            int minNum = 0;
            int maxNum = 0;
            int max = 0;
            for(int j = 0;j<i;j++){
                if(b[j]>num){
                    int m = b[j]-num;
                    if(m<min){
                        min = m;
                        minNum = b[j];
                    }
                }
            }
            for(int k = i+1;k<a;k++){
                if(b[k]<num){
                    int n = num-b[k];
                    if(n>max){
                        max = n;
                        maxNum = b[k];
                    }
                }
            }
            for(int z = 1;z<=minNum;z++){
                if(z*maxNum==minNum){
                    index++;
                    break;
                }else if(z*maxNum>minNum){
                    break;
                }
            }
        }
        System.out.println(index);
    }
}

package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/29
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] num = new int[len];
        for(int i = 0;i<len;i++){
            num[i] = sc.nextInt();
        }
        int index = 0;
        int i = 0;
        int j = 0;
        for(;j<len;j++){
            if(num[j]==0){
                index++;
            }else {
                i = j;
                while (i<len){
                    if(num[i]!=0){
                        i++;
                    }else {
                        j = i-1;
                        break;
                    }
                }
            }
        }
        int r = 0;
        if(x<y){
            r = index*x;
        }else {
            r = index*y;
        }
        System.out.println(r);
    }
}

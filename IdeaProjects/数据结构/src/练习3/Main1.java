package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/27
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println(0);
        }else {
            while (sc.hasNext()){
                int count = sc.nextInt();
                if(count==0){
                    System.out.println(0);
                }else {
                    int[] big = new int[count];
                    int[] weight = new int[count];
                    for(int i = 0;i<count;i++){
                        big[i] = sc.nextInt();
                    }
                    for(int i = 0;i<count;i++){
                        weight[i] = sc.nextInt();
                    }
                    int r = 0;
                    for(int i = 1;i<count;i++){
                        if(!(big[i-1]<=big[i] && weight[i-1]<=weight[i])){
                            r++;
                        }
                    }
                    System.out.println(r);
                }
                num--;
                if(num==0){
                    break;
                }
            }
        }
    }
}

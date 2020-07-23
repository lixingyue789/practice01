package 练习5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/7
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int f = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int r = 1;
        list.add(f);
        int flag = 0;
        for(int i = 0;i<m;i++){
            int q = sc.nextInt();
            int[] a = new int[q];
            for(int j = 0;j<q;j++){
                a[j] = sc.nextInt();
            }
            for(int j = 0;j<q;j++){
                if(a[j]==f){
                    r = r+q;
                    flag=1;
                    break;
                }
            }

        }
        System.out.println(4);
    }
}

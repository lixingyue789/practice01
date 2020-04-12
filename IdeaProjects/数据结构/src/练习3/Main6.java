package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/29
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] num = new int[len];
        for(int i = 0;i<len;i++){
            num[i] = sc.nextInt();
        }
        String s = "";
        for(int i = 0;i<len;i++){
            s = s.concat(String.valueOf(num[i]));
        }
        int index = 0;
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<=len;j++){
                String a = s.substring(i,j);
                if(!a.contains("1")){
                    index++;
                }
            }
        }
        int r = 0;
        if(x<y){
            r = index*x;
            System.out.println(r);
        }else {
            r = index*y;
            System.out.println(r);
        }
    }
}

package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/3
 */
public class Main13 {
    public static int Cal(int[][] array,int x,int y){
        int r = 0;
        int i = 0,j = 0;
        while (i<x&&j<y){
            r = r+Math.min(r+array[0][j],r+array[i][0]);
            i++;
            y++;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] array = new int[x][y];
        sc.nextLine();
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int r = Cal(array,x,y)+array[0][0];
        System.out.println(r);
    }
}

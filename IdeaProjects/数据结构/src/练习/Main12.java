package 练习;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/9
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] array = new int[n][m];
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }
}

package 练习3;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/1
 */
public class Main10 {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static long countDolphin(int n, int m, int[] birthYear, int x) {
        long r = 0;
        if (x == m) {
            for(int i = 0;i<birthYear.length;i++) {
                if(i==0) {
                    r = r + m * 2;
                }else {
                    r = r*2;
                }
            }
        }else if(x<m) {
            int count = 0;
            for(int i = 0;i<birthYear.length;i++) {
                if (birthYear[i] <= x) {
                    count++;
                }
            }
            for(int i = 1;i<=count;i++) {
                if(i==1) {
                    r = r + m * 2;
                }else {
                    r = r*2;
                }
            }
        }
        return r;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _birthYear_size = 0;
        _birthYear_size = Integer.parseInt(in.nextLine().trim());
        int[] _birthYear = new int[_birthYear_size];
        int _birthYear_item;
        for (int _birthYear_i = 0; _birthYear_i < _birthYear_size; _birthYear_i++) {
            _birthYear_item = Integer.parseInt(in.nextLine().trim());
            _birthYear[_birthYear_i] = _birthYear_item;
        }

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = countDolphin(_n, _m, _birthYear, _x);
        System.out.println(String.valueOf(res));
    }
}

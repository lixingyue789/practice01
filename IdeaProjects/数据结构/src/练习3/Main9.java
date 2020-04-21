package 练习3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/1
 */
public class Main9 {
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static int calcMinStaff(List<Integer> a,List<Integer> b,int[] c) {
        int[] d = new int[c.length];
        for(int i = 0;i<c.length;i++){
            d[i] = c[i];
        }
        Arrays.sort(c);
        int f = 0;
        for(int i = 0;i<c.length;i++){
            if(c[i]==d[i]){
                f++;
            }else {
                break;
            }
        }
        if(f==c.length){
            return 1;
        }else {
            int r = a.size();
            for(int i = 0;i<b.size();i++){
                int m = b.get(i);
                if(a.contains(m)){
                    r--;
                    int small = a.indexOf(m);
                    if(small<b.size()){
                        int n = b.get(small);
                        if(a.contains(n)){
                            r--;
                        }
                    }
                }
            }
            return r;
        }
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res = 0;
        int num = in.nextInt();
        in.nextLine();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int[] c = new int[num*2];
        int index = 0;
        for(int i = 0;i<num;i++){
            String s = in.nextLine();
            String[] so = s.split(",");
            a.add(Integer.parseInt(so[0]));
            b.add(Integer.parseInt(so[1]));
            c[index] = Integer.parseInt(so[0]);
            index++;
            c[index] = Integer.parseInt(so[1]);
            index++;
        }
        res = calcMinStaff(a,b,c);
        System.out.println(String.valueOf(res));
    }
}

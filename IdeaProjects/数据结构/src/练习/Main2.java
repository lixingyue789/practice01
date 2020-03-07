package 练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/4
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<List<String>> list = new ArrayList<>();
        int r = 0;
        for(int i = 0;i<=num;i++){
            String a = String.valueOf(i);
            List<String> l = new ArrayList<>();
            l.add(a);
            list.add(l);
        }
        for(int i = 0;i<list.size();i++){
            List<String> b = list.get(i);
            for(int j = 0;j<b.size();j++){
                String c = b.get(j);
                for(int k = 0;k<c.length();k++){
                    char ch = c.charAt(k);
                    if(ch=='2'){
                        r++;
                    }
                }
            }
        }
        System.out.println(r);
    }
}

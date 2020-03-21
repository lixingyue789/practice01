package 练习2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/12
 */
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String r = "";
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(!b.contains(String.valueOf(ch))){
                r = r.concat(String.valueOf(ch));
            }
        }
        System.out.println(r);
    }
}

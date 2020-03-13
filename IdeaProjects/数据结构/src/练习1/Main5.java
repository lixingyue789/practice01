package 练习1;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2020/3/5
 */
public class Main5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String b1 = sc.nextLine();
        String a = a1.toUpperCase();
        String b = b1.toUpperCase();
        List<Character> list = new ArrayList<>();
        String r = "";
        for(int i = 0;i<b.length();i++){
            list.add(b.charAt(i));
        }
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(!list.contains(ch)){
                if(!r.contains(String.valueOf(ch))){
                    r = r.concat(String.valueOf(ch));
                }
            }
        }
        System.out.println(r);
    }
}

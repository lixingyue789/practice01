package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/26
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] s = b.split(" ");
        char ch = a.charAt(0);
        String r = "";
        int len = 0;
        if(ch=='-'){
            len = a.length();
            r = r.concat("-");
            for(int i = 1;i<len;i++){
                int m = Integer.parseInt(String.valueOf(a.charAt(i)));
                r = r.concat(s[m-1]);
            }
        }else {
            len = a.length();
            for(int i = 0;i<len;i++){
                int m = Integer.parseInt(String.valueOf(a.charAt(i)));
                r = r.concat(s[m-1]);
            }
        }
        System.out.println(r);
    }
}

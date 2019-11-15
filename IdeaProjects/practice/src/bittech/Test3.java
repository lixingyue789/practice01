package bittech;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/8
 */
//牛客网：统计回文
public class Test3 {
    public static boolean huiWen(String s1) {
        int i = 0;
        int j = s1.length() - 1;
        int len = s1.length() / 2;
        while (i < len && j >= len) {
            if (s1.charAt(i) == s1.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static int Solution(String s1,String s2) {
        int len = s1.length();
        int i = 0;
        int count = 0;
        if (huiWen(s2.concat(s1))) {
            count++;
        }
        while (i < len) {
            String ms1 = s1.substring(0, i + 1);
            String ms2 = s1.substring(i + 1);
            String result = ms1.concat(s2).concat(ms2);
            if (huiWen(result)) {
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message1 = sc.nextLine();
        String message2 = sc.nextLine();
        int result = Solution(message1,message2);
        System.out.println(result);
    }
}

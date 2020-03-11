package 练习;

/**
 * Author:lxy1999
 * Created:2020/3/10
 */
import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        String[] s = iniString.split(" ");
        int len = 0;
        for(int i = 0;i<s.length;i++){
            int a = s[i].length();
            len = len + a;
        }
        String r = "";
        if(len==length){
            for(int i = 0;i<s.length-1;i++){
                String a = s[i]+"%20";
                r = r.concat(a);
            }
            r = r.concat(s[s.length-1]);
        }else {
            for(int i = 0;i<iniString.length();i++){
                char ch = iniString.charAt(i);
                if(ch == ' '){
                    r = r.concat("%20");
                }else {
                    r = r.concat(String.valueOf(ch));
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        String s =" Hello World  ";
        Replacement r = new Replacement();
        String rr = r.replaceSpace(s,15);
        System.out.println(rr);
    }
}
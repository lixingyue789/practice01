package 练习2;

/**
 * Author:lxy1999
 * Created:2020/3/11
 */
import java.util.*;
public class Main{
    public static boolean Solution(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 0;
        for(int i = 0;i<s.length();i++){
            String a = s.substring(0,i)+s.substring(i+1,s.length());
            boolean b = Solution(a);
            if(b){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}

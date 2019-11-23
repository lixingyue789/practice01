package practice;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/8
 */
public class Test5 {
    public static String Solution(String s1,String s2){
      StringBuilder s = new StringBuilder(s1);
      String result = s1;
      for(int i = 0;i<s2.length();i++){
          for(int j = 0;j<result.length();j++){
              if(s2.charAt(i)==result.charAt(j)){
                  s = s.deleteCharAt(j);
                  result = new String(s);
              }
          }
      }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = Solution(s1,s2);
        System.out.println(result);
    }
}

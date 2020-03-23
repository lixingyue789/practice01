package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/23
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String a = line.substring(1,line.length()-1);
        String[] b = a.split("],");
        int[] num = new int[b.length*2];
        int index = 0;
        for(int i = 0;i<b.length;i++){
            String s1 = b[i];
            String s2 = "";
            if(i==b.length-1){
                s2 = s1.substring(1,s1.length()-1);
                String[] s3 = s2.split(",");
                for(int k = 0;k<s3.length;k++){
                    num[index] = Integer.parseInt(s3[k]);
                    index++;
                }
            }else {
                s2 = s1.substring(1,s1.length());
                String[] s = s2.split(",");
                for(int j = 0;j<s.length;j++){
                    num[index] = Integer.parseInt(s[j]);
                    index++;
                }
            }
        }
        int f = num[0];
        int flag = 0;
        int len = num.length;
        int index1 = 0;
        int result = 0;
        for(int i = 1;i<num.length;i++){
            if(f<=num[i]){
                flag=1;
                f = num[i];
            }else {
                flag=2;
                index1 = i;
                break;
            }
        }
        if(flag==1){
            System.out.println(result);
        }else if(num[0]==num[1]){
            result = 1;
            System.out.println(result);
        }
    }
}

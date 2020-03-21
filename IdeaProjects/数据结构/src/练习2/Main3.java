package 练习2;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/13
 */
//坐标移动
public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] s = line.split(";");
            int x = 0;int y = 0;
            for(int i = 0;i<s.length;i++){
                String a = s[i];
                if(a.length()<=1){
                    continue;
                }
                char ch = a.charAt(0);
                if(!(ch=='A'||ch=='W'||ch=='D'||ch=='S')){
                    continue;
                }
                String b = a.substring(1,a.length());
                int f = 0;
                for(int j = 0;j<b.length();j++){
                    char c = b.charAt(j);
                    if(!(c>='0'&&c<='9')){
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    continue;
                }
                int num = Integer.parseInt(b);
                if(ch=='A'){
                    x = x-num;
                }else if(ch=='D'){
                    x = x+num;
                }else if(ch=='W'){
                    y = y+num;
                }else{
                    y = y-num;
                }
            }
            System.out.println(x+","+y);
        }
    }
}

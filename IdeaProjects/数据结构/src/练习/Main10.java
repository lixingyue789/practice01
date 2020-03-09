package 练习;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/7
 */
public class Main10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            long sum = 0;
            int a = 0;
            int b = 1;
            for(int i = line.length()-1;i>=2;i--){
                a = line.charAt(i);
                if(a>='0'&&a<='9'){
                    a = a-48;
                }else if(a == 'A'){
                    a = 10;
                }else if(a == 'B'){
                    a = 11;
                }else if(a == 'C'){
                    a = 12;
                }else if(a == 'D'){
                    a = 13;
                }else if(a == 'E'){
                    a = 14;
                }else if(a == 'F'){
                    a = 15;
                }
                sum = sum+a*b;
                b = b*16;
            }
            System.out.println(sum);
        }
    }
}

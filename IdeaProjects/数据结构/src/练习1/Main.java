package 练习1;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/2
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for(int i = words.length-1;i>=0;i--){
            if(i==0){
                System.out.print(words[i]);
            }
            System.out.print(words[i]+" ");
        }
    }
}

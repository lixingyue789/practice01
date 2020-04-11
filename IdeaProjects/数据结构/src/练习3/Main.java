package 练习3;

import 链表.LinkedListImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/27
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            while (num!=0){
                int colorNum = sc.nextInt();
                int[] array = new int[colorNum];
                for(int i = 0;i<colorNum;i++){
                    array[i] = sc.nextInt();
                }
                int index = 0;
                for(int i = 0;i<colorNum;i++){
                    if(array[i]<=1){
                        index++;
                    }
                }
                if(index==colorNum){
                    System.out.println(-1);
                }else {
                    System.out.println(colorNum+1);
                }
                num--;
            }
        }
    }
}

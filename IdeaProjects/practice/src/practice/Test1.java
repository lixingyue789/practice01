package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/11/8
 */
public class Test1 {
    public static String Solution1(List<String> list){
        int max = 0;
        int index = 0;
        for(int i = 0;i<list.size();i++){
            int num = list.get(i).length();
            if(num>max){
                max = num;
                index = i;
            }
        }
        return list.get(index);
    }
    public static List<String> Solution(String msg){
        List<String> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int len = msg.length();
        while (i<len){
            for(j = i;j<len;j++){
                char s = msg.charAt(j);
                if(s >='0'&&s<='9'){
                }else {
                    break;
                }
            }
            if(j != i){
                String s1 = msg.substring(i,j);
                list.add(s1);
            }
            i++;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        List<String> list = Solution(message);
        String result = Solution1(list);
        System.out.println(result);
    }
}

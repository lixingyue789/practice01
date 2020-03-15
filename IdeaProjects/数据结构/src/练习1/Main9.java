package 练习1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Author:lxy1999
 * Created:2020/3/7
 */
public class Main9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = 'A';
        while(sc.hasNext()){
            String line = sc.nextLine();
            Map<Character,Integer> map = new TreeMap<>();
            for(int i = 0;i<line.length();i++){
                char ch = line.charAt(i);
                int count = map.getOrDefault(ch,0);
                map.put(ch,count+1);
            }
            for(int i = 0;i<26;i++){
                if(map.containsKey(a)){
                    int c = map.get(a);
                    System.out.println(a+":"+c);
                }else {
                    System.out.println(a+":"+0);
                }
                a=(char)(a+1);
            }
        }
    }
}

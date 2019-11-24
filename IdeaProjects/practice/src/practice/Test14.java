package practice;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test14 {
    private static void Solution(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<list.size();i++){
            int num = list.get(i);
            int count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] ch = line.toCharArray();
        for(int i = 0;i<ch.length;i++){
            int a = ch[i]-48;
            list.add(a);
        }
        Solution(list);
    }
}

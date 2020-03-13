package 练习1;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2020/3/4
 */
public class Main4 {
    public static Character Range(List<Character> list){
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<list.size();i++){
            int c = map.getOrDefault(list.get(i),0);
            map.put(list.get(i),c+1);
        }
        for(Map.Entry<Character,Integer> m:map.entrySet()) {
            int value = m.getValue();
            if (value > max) {
                max = value;
            }
        }
        List<Character> l = new ArrayList<>();
        for(Map.Entry<Character,Integer> m:map.entrySet()) {
            Character key = m.getKey();
            int value = m.getValue();
            if(value==max) {
                l.add(key);
            }
        }
        char min = 'Z';
        if(l.size()==1){
            return l.get(0);
        }else if(l.size()==0) {
            return 'B';
        } else{
                for(int i = 0;i<l.size();i++){
                    if(l.get(i)<min){
                        min = l.get(i);
                    }
                }
                return min;
            }
        }
    //返回1代表甲胜,返回2代表乙胜，平局返回3
    public static int Solution(char c1,char c2){
        int flag = 0;
        if(c1==c2){
            flag = 3;
            return flag;
        }else {
            if((c1=='C'&&c2=='J')||(c1=='J'&&c2=='B')||(c1=='B'&&c2=='C')){
                flag = 1;
                return flag;
            }else {
                flag = 2;
                return flag;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int J = 0;
        int Y = 0;
        int P = 0;
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for(int i = 0;i<num;i++){
            String line = sc.nextLine();
            String[] a = line.split(" ");
            char c1 = a[0].charAt(0);
            char c2 = a[1].charAt(0);
            int f = Solution(c1,c2);
            if(f==1){
                l1.add(c1);
                J++;
            }else if(f==2){
                l2.add(c2);
                Y++;
            }else {
                P++;
            }
        }
        int a1 = num-J-P;
        int a2 = num-Y-P;
        char ch1 = Range(l1);
        char ch2 = Range(l2);
        System.out.println(J+" "+P+" "+a1);
        System.out.println(Y+" "+P+" "+a2);
        System.out.println(ch1+" "+ch2);
    }
}

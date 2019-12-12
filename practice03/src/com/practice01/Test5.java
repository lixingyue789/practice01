package com.practice01;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/12/8
 */
public class Test5 {
    private static void Solution(String s){
        int[] a = new int[4];
        List<Character> list = new ArrayList<>();
        int b = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0'&&ch<='9'){
                a[0] = 1;
            }else if(ch>='a'&&ch<='b'){
                a[1] = 1;
            }else if(ch>='A'&&ch<='B'){
                a[2] = 1;
            }else{
                a[3] = 1;
                if(!list.contains(ch)){
                    b++;
                }
                list.add(ch);
            }
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length()-1;i++){
            String a1 = s.substring(i,i+2);
            int count = map.getOrDefault(a1,0);
            map.put(a1,count+1);
        }
        //System.out.println(map);
        int f = 0;
        Set<String> set = map.keySet();
        for(String str : set){
            int r = map.get(str);
            if(r>=2){
                f = 1;
                break;
            }
        }
        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
        }
        int m = b+count;
        int len = s.length();
        if(f==0&&m>=3&&len>8){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            Solution(s);
        }
    }
}
//-+4wC

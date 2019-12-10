package com.practice01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/12/5
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = 0;
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            HashMap<String,Integer> map = new HashMap<>();
            int pNum = sc.nextInt();
            sc.nextLine();
            String line1 = sc.nextLine();
            String[] s1 = line1.split(" ");
            int pCount = sc.nextInt();
            sc.nextLine();
            String line2 = sc.nextLine();
            String[] s2 = line2.split(" ");
            for(int i = 0;i<pNum;i++){
                list1.add(s1[i]);
            }
            for(int j = 0;j<pCount;j++) {
                list2.add(s2[j]);
            }
            for(int i = 0;i<list2.size();i++){
                int count = map.getOrDefault(list2.get(i),0);
                map.put(list2.get(i),count+1);
            }
            for(int i = 0;i<list1.size();i++){
                String key = list1.get(i);
                if(map.containsKey(key)){
                    int value = map.get(key);
                    System.out.println(key+" : "+value);
                }else{
                    System.out.println(key+" : "+0);
                }
            }
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                String key = entry.getKey();
                int value = map.get(key);
                if(!list1.contains(key)){
                    n= n+value;
                }
            }
            if(n!=0){
                System.out.println("Invalid"+" : "+n);
            }else {
                System.out.println("Invalid"+" : "+0);
            }
        }
    }
}

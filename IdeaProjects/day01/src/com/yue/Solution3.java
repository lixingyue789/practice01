package com.yue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:lxy1999
 * Created:2020/2/13
 */
public class Solution3 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int flag = 0;
        Map<Character,Integer> map1 = new HashMap<>();
        List<Character> list1 = new ArrayList<>();
        for(int i = 0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            list1.add(ch);
        }
        for(int i = 0;i<list1.size();i++){
            char ch = list1.get(i);
            int count = map1.getOrDefault(ch,0);
            map1.put(ch,count+1);
        }
        Map<Character,Integer> map2 = new HashMap<>();
        List<Character> list2 = new ArrayList<>();
        for(int i = 0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            list2.add(ch);
        }
        for(int i = 0;i<list2.size();i++){
            char ch = list2.get(i);
            int count = map2.getOrDefault(ch,0);
            map2.put(ch,count+1);
        }
        for(int i = 0;i<list1.size();i++){
            char ch = list1.get(i);
            if(!list2.contains(ch)){
                return false;
            }
        }
        for(Map.Entry<Character,Integer> map:map1.entrySet()){
            char ch = map.getKey();
            int count = map.getValue();
            if(list2.contains(ch)&&map2.get(ch)<count){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
}

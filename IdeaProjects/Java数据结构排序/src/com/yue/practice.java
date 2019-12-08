package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/7
 * 有错误
 */
//public class practice {
//    public static List<String> commonChars(String[] A) {
//        List<Map<String, Integer>> list = new ArrayList<>();
//        //将字符串中的每一个单词转为数组，遍历数组记录每个字符及它出现的次数
//        //将map都放到list中
//        for (String s : A) {
//            Map<String, Integer> map = new HashMap<>();
//            char[] a = s.toCharArray();
//            for (char ch : a) {
//                String value = String.valueOf(ch);
//                int count = map.getOrDefault(value, 0);
//                map.put(value, count + 1);
//            }
//            list.add(map);
//        }
//        //得到其中一个map，遍历其他的map
//        Map<String,Integer> map = list.get(0);
//        int j = 0;
//        String[] key = new String[100];
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            String keys = entry.getKey();
//            int values = entry.getValue();
//            for (int i = 1; i < list.size(); i++) {
//                Map<String, Integer> a = list.get(i);
//                if(a.containsKey(keys)&&(a.get(keys)!=values)){
//                    if(a.get(keys)<values){
//                        System.out.println(keys+" "+a.get(keys));
//                        map.replace(keys,a.get(keys));
//                    }
//                }
//                if(!a.containsKey(keys)){
//                    key[j] = keys;
//                    j++;
//                }
//            }
//        }
//        for(int i = 0;i<key.length;i++){
//            if(map.containsKey(key[i])){
//                map.remove(key[i]);
//            }
//        }
//        System.out.println(map);
//        List<String> result = new ArrayList<>();
//        for(Map.Entry<String,Integer> entry:map.entrySet()){
//            String keys = entry.getKey();
//            int values = entry.getValue();
//            for(int i = 0;i<values;i++){
//                result.add(keys);
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        //String[] A = {"cool","lock","cook"};
//        String[] A = {"bbddabab","dabcacad","ccbdbcba"};
//        //"cddcacbc","ccbdbcba","cbddaccc","accdcdbb,"cbcddbdd","bbcadcab""
//        System.out.println(commonChars(A));
//        //System.out.println(count(A));
//    }
//}
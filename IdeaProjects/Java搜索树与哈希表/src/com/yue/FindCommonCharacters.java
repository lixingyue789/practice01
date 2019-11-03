package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/13
 */
public class FindCommonCharacters {

    public static List<String> commonChars1(String[] A) {
        //先定义一个list，里面的每个元素都是map类型的，map的key是字符串中每个元素中的每个字符
        //而value是每个字符出现的次数
        List<Map<Character,Integer>> list = new ArrayList<>();
        for(String s:A){
            Map<Character,Integer> map = new HashMap<>();
            char[] a = s.toCharArray();
            for(char ch:a){
                int count = map.getOrDefault(ch,0);
                map.put(ch,count+1);
            }
            list.add(map);
        }
        System.out.println(list);
        //遍历第一个map，在其他map里找，是否出现第一个map中的元素，如果出现，则计算它的次数，如果没有，判断下一个字符
        List<String> result = new ArrayList<>();
        Set<Character> set = list.get(0).keySet();
        for(Character s:set){
            boolean flag = true;
            for(int i = 1;i<list.size();i++){
                if(!list.get(i).containsKey(s)){
                    flag = false;
                    break;
                }
            }
            //如果有map中没有字符s，就不能进行下面步骤，即转入下一次循环
            if(!flag){
                continue;
            }
            //计算次数
            int min = list.get(0).get(s);
            for(int i =1;i<list.size();i++){
                if(min>list.get(i).get(s)){
                    min = list.get(i).get(s);
                }
            }
            //将其加入到result中去
            for(int i = 0;i<min;i++){
                result.add(String.valueOf(s));
            }
        }
        return result;
    }

    public static List<String> commonChars2(String[] A) {
        //定义一个list，每个元素是数组类型
        List<int[]> list = new ArrayList<>();
        for(String s:A){
            //定义一个长度为26的数组，数组下标代表从a到z，数组元素代表其出现的次数
            int[] array = new int[26];
            char[] ch = s.toCharArray();
            for(char c:ch){
                int index = c-'a';
                array[index]++;
            }
            list.add(array);
        }
        for(int[] a:list){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("=============================================================");
        //计算list的数组中所有下标为i的元素的最小值
        int[] r = new int[26];
        for(int i = 0;i<r.length;i++){
            int m = Integer.MAX_VALUE;
            for(int[] a:list){
                m = Math.min(m,a[i]);
            }
            r[i] = m;
        }
        //将重复元素加入到result中，加入元素次数为m次
        List<String> result = new ArrayList<>();
        for(int i = 0;i<26;i++){
            for(int j = 0;j<r[i];j++){
                char ch = (char) (i+'a');
                result.add(String.valueOf(ch));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] A = { "bella", "label", "roller" };
        System.out.println(commonChars1(A));
        System.out.println("=============================================================");
        System.out.println(commonChars2(A));
    }
}

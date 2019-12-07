package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/6
 * 在写一遍Solution
 */
public class Solution2 {
    public static class stringComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
    //首先定义一个map，得到每个元素以及帮它出现的次数
    public static Map<String,Integer> count(String[] words){
        Map<String,Integer> map = new HashMap<>();
        for(String s:words){
            int count = map.getOrDefault(s,0);
            map.put(s,count+1);
        }
        return map;
    }
    //其次定义一个remap，得到出现相同的次数以及它的list
    public static Map<Integer,List<String>> remap(Map<String,Integer> wordToCount){
        Map<Integer,List<String>> countToList = new HashMap<>();
        for(Map.Entry<String,Integer> entry:wordToCount.entrySet()){
            String words = entry.getKey();
            int counts = entry.getValue();
            List<String> list = countToList.get(counts);
            if(list==null){
                list = new ArrayList<>();
                countToList.put(counts,list);
            }
            list.add(words);
        }
        return countToList;
    }
    public static List<String> topKFrequent(String[] words,int k){
        //首先应该得到数组元素出现相同的次数，对次数进行排序
        Map<String,Integer> wordsToCount = count(words);
        Map<Integer,List<String>> countToList = remap(wordsToCount);
        Set<Integer> keys = countToList.keySet();
        int[] count = new int[keys.size()];
        int i = 0;
        for(int key:keys){
            count[i++] = key;
        }
        Arrays.sort(count);
        int index = count.length-1;
        int j = 0;
        List<String> result = new ArrayList<>();
        Comparator<String> comparator = new stringComparator();
        while (j<k){
            int c = count[index--];
            List<String> list = countToList.get(c);
            list.sort(comparator);
            if(list.size()<=k-j){
                result.addAll(list);
                j = j+list.size();
            }else {
                result.addAll(list.subList(0,k-j));
                j = k;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = {
                "i", "love", "leetcode",
                "i", "love", "coding"
        };
        List<String> r = topKFrequent(words, 3);
        System.out.println(r);
    }
}

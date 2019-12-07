package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/5
 */
//给定一个数组，返回出现次数最多的前k个高频单词
public class Solution1 {

    public static class stringComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
    public static Map<String, Integer> count(String[] words) {
        //首先定义一个map，里面数组中的元素及它要出现的次数
        Map<String,Integer> map = new HashMap<>();
        for(String s: words){
            int count = map.getOrDefault(s,0);
            map.put(s,count+1);
        }
        return map;
    }

    public static Map<Integer, List<String>> remap(Map<String, Integer> wordToCount) {
        //在定义一个remap，里面包含出现相同的次数以及线性表（线性表中装的是出现次数相同的元素）
        Map<Integer,List<String>> remap = new HashMap<>();
        for(Map.Entry<String,Integer> entry:wordToCount.entrySet()){
            String keys = entry.getKey();
            int values = entry.getValue();
            List<String> list = remap.get(values);
            if(list==null){
                list = new ArrayList<>();
                remap.put(values,list);
            }
            list.add(keys);
        }
        return remap;
    }

    public static List<String> topKFrequent(String[] words, int k) {
        //将remap的key放入到一个数组中去，然后对其排序，这样就可以得到次数最高的
        Map<String,Integer> wordToCount = count(words);
        Map<Integer,List<String>> countToList = remap(wordToCount);
        Set<Integer> counts = countToList.keySet();
        int[] count = new int[counts.size()];
        int i =0;
        for(int key:counts){
            count[i++] = key;
        }
        Arrays.sort(count);
        //首先定义一个list放入结果元素，定义j=0,当j<k时，数组从后往前取元素，通过remap得到此次数的集合，然后对其进行排序
        //判断k-j与集合size作比较，如果小于，则全部加到list中，如果大于截取list后，将元素添加到list中，最后返回list。
        List<String> result = new ArrayList<>();
        Comparator<String> comparator = new stringComparator();
        int j = 0;
        int index = count.length-1;
        while (j<k){
            int c = count[index--];
            List<String> wordList = countToList.get(c);
            wordList.sort(comparator);
            if(wordList.size()<=k-j){
                result.addAll(wordList);
                j+=wordList.size();
            }else {
                result.addAll(wordList.subList(0,k-j));
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

package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/6
 */
public class Solution3 {
    //900 google.mail.com-->返回结果900 google.mail.com，900 mail.com，900 com
    public static List<String> subDoMainVisits(String[] cpDomMains) {
        //首先遍历数组，将所有的元素以空格分开，然后将后面的元素以点分开，接着遍历数组，利用拷贝数组将其组合起来
        //定义一个map，里面包含s与次数，最后遍历map，将元素添加到list中
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String s:cpDomMains){
            String[] a = s.split(" ");
            int number = Integer.parseInt(a[0]);//将字符串转换为int类型
            String[] b =a[1].split("\\.");
            for(int i = 0;i<b.length;i++){
                String[] c = Arrays.copyOfRange(b,i,b.length);//注意截取时
                String result = String.join(".",c);
                int numbers = map.getOrDefault(result,0);
                map.put(result,numbers+number);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String keys = entry.getKey();
            int values = entry.getValue();
            list.add(values+" "+keys);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] s = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
        List<String> r = subDoMainVisits(s);
        System.out.println(r);
    }
}

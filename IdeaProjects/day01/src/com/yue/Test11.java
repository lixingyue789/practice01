package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/18
 */
public class Test11 {
    public int lengthOfLastWord(String s) {
        String[] r = s.split(" ");
        if(r.length>=1){
            return r[r.length-1].length();
        }else {
            return 0;
        }
    }
}

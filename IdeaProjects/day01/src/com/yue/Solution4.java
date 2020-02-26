package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/13
 */
public class Solution4 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            String s = String.valueOf(x);
            int len = s.length();
            int half = len/2;
            for(int i = 0;i<half;i++){
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(len-i-1);
                if(ch1!=ch2){
                    return false;
                }
            }
        }
        return true;
    }
}

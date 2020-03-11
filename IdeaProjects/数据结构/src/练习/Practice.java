package 练习;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/5
 */
public class Practice {
    //加密：密文（大写）
    public String Encryption(String line){
        String s = line.toUpperCase();
        String result = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='W'){
                char c = (char) (ch+3);
                result = result.concat(String.valueOf(c));
            }else {
                if(ch == 'X'){
                    result = result.concat(String.valueOf('A'));
                }else if(ch == 'Y'){
                    result = result.concat(String.valueOf('B'));
                }else {
                    result = result.concat(String.valueOf('C'));
                }
            }
        }
        return result;
    }
    //解密：明文（小写）
    public String Decryption(String line){
        String s = line.toLowerCase();
        String result = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='d' && ch<='z'){
                char c = (char) (ch-3);
                result = result.concat(String.valueOf(c));
            }else {
                if(ch == 'a'){
                    result = result.concat(String.valueOf('x'));
                }else if(ch == 'b'){
                    result = result.concat(String.valueOf('y'));
                }else {
                    result = result.concat(String.valueOf('z'));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Practice p = new Practice();
        String a = p.Encryption(line);
        System.out.println("加密后的密文为：");
        System.out.println(a);
        String b = p.Decryption(a);
        System.out.println("将密文解密后的明文：");
        System.out.println(b);
    }
}

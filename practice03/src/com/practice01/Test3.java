package com.practice01;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/12/6
 */
public class Test3 {
/**
  * ip地址转成long型数字
  * 将IP地址转化成整数的方法如下：
  * 1、通过String的split方法按.分隔得到4个长度的数组
  * 2、通过左移位操作（<<）给每一段的数字加权，第一段的权为2的24次方，第二段的权为2的16次方
  *第三段的权为2的8次方，最后一段的权为1
**/

    private static long IP_Num(String IP){
        long result = 0;
        String[] s = IP.split("\\.");
        long s0 = Long.parseLong(s[0]);
        long s1 = Long.parseLong(s[1]);
        long s2 = Long.parseLong(s[2]);
        long s3 = Long.parseLong(s[3]);
        result = s3+(s2<<8)+(s1<<16)+(s0<<24);
        return result;
    }
    /**
      * 将十进制整数形式转换成127.0.0.1形式的ip地址
      * 将整数形式的IP地址转化成字符串的方法如下：
      * 1、将整数值进行右移位操作（>>>），右移24位，右移时高位补0，得到的数字即为第一段IP。
      * 2、通过与操作符（&）将整数值的高8位设为0，再右移16位，得到的数字即为第二段IP。
      * 3、通过与操作符吧整数值的高16位设为0，再右移8位，得到的数字即为第三段IP。
      * 4、通过与操作符吧整数值的高24位设为0，得到的数字即为第四段IP。
      * @param longIp
      * @return
      */
    private static String tenIP_IP(String tenIP){
        long ten = Long.parseLong(tenIP);
        StringBuffer sb = new StringBuffer("");
        // 直接右移24位
        sb.append(String.valueOf((ten>>>24)));
        sb.append(".");
        // 将高8位置0，然后右移16位
        sb.append(String.valueOf((ten&0x00FFFFFF)>>>16));
        sb.append(".");
        // 将高16位置0，然后右移8位
        sb.append(String.valueOf((ten&0x00FFFFFF)>>>8));
        sb.append(".");
        // 将高24位置0
        sb.append(String.valueOf((ten&0x000000FF)));
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String IP = sc.nextLine();
        String tenIP = sc.nextLine();
        long a = IP_Num(IP);
        String b = tenIP_IP(tenIP);
        System.out.println(a);
        System.out.println(b);
    }
}

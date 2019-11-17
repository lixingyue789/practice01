package testFile;

import java.io.*;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test4 {
    public static void main(String[] args) {
        //字节输入流，读取中文可能会产生问题
        //字节流的好处在于什么类型的文件都可以处理，不好在于处理纯文本的文件可能会产生乱码的问题
        try {
            FileInputStream fis = new FileInputStream(new File("D://test//Test.txt"));
            byte[] b = new byte[5];
            int count = fis.read(b);
            while (count!=-1){
                String s = new String(b,0,count);
                System.out.println(s);
                count = fis.read(b);
            }
            System.out.println("打印完毕");
            //我�
            //�欢�
            //��abc
            //打印完毕
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:lxy1999
 * Created:2019/11/14
 */
public class test1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("D://test//Test.txt"),true);
            //创建的是文件输入流，若文件路径有问题，则抛出异常
            //创建的是文件输出流，若文件路径有问题，则直接帮我们创建一个新的文件
            fos.write(97);
            fos.write(98);
            fos.flush();
            System.out.println("写入完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

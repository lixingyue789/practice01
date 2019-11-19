package testFile;

import java.io.File;
import java.io.IOException;

/**
 * Author:lxy1999
 * Created:2019/11/11
 */
public class TestFile1 {
    public static void main(String[] args) {
        File file = new File("D://test//abc.txt");
        try {
            boolean value = file.createNewFile();
            System.out.println(value);//T
        } catch (IOException e) {
            e.printStackTrace();
        }
        String name = file.getParent();
        System.out.println(name);//D:\test
        File file2 = file.getParentFile();//D:\test
        System.out.println(file2.getAbsolutePath());
        File file1 = new File("D://test//bbb//inner");
        boolean value = file1.mkdir();//F需要外层父元素正式存在
        System.out.println(value);
        boolean value1 = file1.mkdirs();//可以创建文件夹，如果外层也没有，也会同时创建
        System.out.println(value1);//T
        //遍历寻找父类
        File newFile = new File("D://test//bbb//inner");
        File pFile = newFile.getParentFile();
        while (pFile!=null){
            System.out.println(pFile.getAbsolutePath());
            pFile = pFile.getParentFile();
            //D:\test\bbb
            //D:\test
            //D:\
        }
        File file3 = new File("D://test//bbb//inner");
        File[] files = file3.listFiles();
        //数组对象为空，证明当前file3是一个文件
        //数组对象不为空，证明当前file3是一个文件夹
        //数组对象长度不为0，证明当前file3不是一个空的文件夹，文件夹中有元素
        System.out.println(files.length);//0
    }
}

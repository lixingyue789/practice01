package testFile;

import java.io.*;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test3 {
    public static void copyFile(File file, String path){//C://test//Test.txt
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            File newFile = new File(path+"//"+file.getName());
            fos = new FileOutputStream(newFile);
            //读取文件
            byte[] b = new byte[1024];//可能会读取空格
            int count = fis.read(b);//1024,24个有效
            while (count!=-1){
                //加密：每一次数组的前两个元素位置互换
                byte temp = b[0];
                b[0] = b[1];
                b[1] = temp;
                fos.write(b,0,count);
                fos.flush();
                count = fis.read(b);
            }
            System.out.println("复制完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        File file = new File("C://test//Test.txt");
        copyFile(file,"D://test//bbb");
    }
}

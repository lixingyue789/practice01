package testFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author:lxy1999
 * Created:2019/11/14
 */
public class testFile2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D://test//Test.txt");
            fis.skip(2);
            int code = fis.read();
            System.out.println((char)code);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();//关闭流通道，流一定要关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

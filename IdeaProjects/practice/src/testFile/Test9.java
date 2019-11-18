package testFile;

import java.io.*;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test9 {
    public static void main(String[] args) {
        BufferedOutputStream bos = null;
        try {
            File file = new File("D://test//Test.txt");
            FileOutputStream fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write('o');
            System.out.println("完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

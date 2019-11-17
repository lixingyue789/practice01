package testFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test6 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File file = new File("D://test//Test.txt");
            fw = new FileWriter(file);
            char[] ch = {'我','喜','欢','你'};
            fw.write(ch);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

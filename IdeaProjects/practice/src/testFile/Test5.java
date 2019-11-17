package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test5 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new File("D://test//Test.txt");
            fr = new FileReader(file);
            int code = fr.read();
            while (code!=-1){
                System.out.println((char)code);
                code = fr.read();
            }
            System.out.println("完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

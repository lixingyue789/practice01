package testFile;

import java.io.*;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test7 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("D://test//Test.txt");
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            int code = br.read();
            System.out.println((char)code);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

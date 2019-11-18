package testFile;

import java.io.*;

/**
 * Author:lxy1999
 * Created:2019/11/16
 */
public class Test8 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            File file = new File("D://test//Test.txt");
            FileWriter fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            bw.write('你');
            bw.flush();
            System.out.println("写入完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package abc;


/**
 * Author:lxy1999
 * Created:2020/5/24
 */
import java.io.*;
public class Practice {
    //起初aaa.txt内容为空，将abc.txt内容写入到aaa.txt中去
    public static void main(String[] args) {
        try {
            System.out.println("起初aaa.txt内容为空，abc.txt文档中有中国两字");
            FileReader fr = new FileReader("D:\\abc.txt");
            //带缓冲区的字节输入流
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("D:\\aaa.txt");
            //带缓冲区的字节输出流
            BufferedWriter bw = new BufferedWriter(fw);
            //将abc.txt文档中的内容读出，并写入到aaa.txt中去
            String line = br.readLine();
            bw.write(line);
            bw.flush();
            System.out.println("将abc.txt文档中的内容写入到aaa.txt中去");
            System.out.println("写入成功！！！");
            FileReader is = new FileReader("D:\\aaa.txt");
            BufferedReader brs = new BufferedReader(is);
            String s = brs.readLine();
            System.out.println("aaa.txt文档中的内容为："+s);
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

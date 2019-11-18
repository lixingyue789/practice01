package testFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:lxy1999
 * Created:2019/11/11
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("D://test//Test.txt");
        System.out.println(file.canRead());//T
        System.out.println(file.canWrite());//T
        System.out.println(file.canExecute());//T
        System.out.println(file.isFile());//T
        System.out.println(file.isDirectory());//F
        System.out.println(file.isHidden());//F
        long l = file.length();
        System.out.println(l);//0
        long time = file.lastModified();
        Date date = new Date(time);
        System.out.println(time);//1573472562528
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(sdf.format(date));//2019-42-11 07:42:42
        String name = file.getName();
        System.out.println(name);//Test.txt
        String path = file.getAbsolutePath();
        System.out.println(path);//D:\test\Test.txt——>绝对路径
        File file1 = new File("test//Test.txt");
        String path1 = file1.getAbsolutePath();
        System.out.println(path1);//D:\Java代码\practice01\IdeaProjects\practice\test\Test.txt
    }
}

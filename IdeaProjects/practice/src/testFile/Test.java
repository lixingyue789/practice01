package testFile;

import java.io.File;

/**
 * Author:lxy1999
 * Created:2019/11/11
 */
//public class Test {
//    public void showFile(File file){
//        File[] files = file.listFiles();
//        //数组不为空，为文件夹，数组length不为0，文件夹有元素
//        if (files!=null&&files.length!=0){
//            for(File file1 : files){
//                this.showFile(file1);//每一个子元素都找人遍历
//            }
//        }
//        System.out.println(file.getAbsolutePath());
//    }
//
//    public void deletFile(File file){
//        File[] files = file.listFiles();
//        if (files!=null&&files.length!=0){
//            for(File file1 : files){
//                this.deletFile(file1);//每一个子元素都找人遍历
//            }
//        }
//        file.delete();
//    }
//    public static void main(String[] args) {
//        File newFile = new File("D://test");
//        Test t = new Test();
//        t.showFile(newFile);
//        //D:\test\abc.txt
//        //D:\test\bbb\inner
//        //D:\test\bbb
//        //D:\test\Test.txt
//        //D:\test
//        File newFile1 = new File("D://test//Test.txt");
//        t.showFile(newFile1);//D:\test\Test.txt
//        t.deletFile(newFile1);//删除成功
//    }
//}
public class Test {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
    static class A {
        protected int value;
        public A(int v) {
            setValue(v);//本来应该执行父类的setValue方法
            // 但是子类覆写父类的方法，所以此时执行子类的setValue方法
            //value = 10
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            try {
                value++;//11 17
                return value;//11 22 17 34
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);//22
                System.out.println(value);//22 34
            }
            return value;
        }
    }
    static class B extends A {
        public B() {
            super(5);
            setValue(getValue() - 3);//11-3=8
        }
        public void setValue(int value) {
            super.setValue(2 * value);//10 16
        }
    }
}

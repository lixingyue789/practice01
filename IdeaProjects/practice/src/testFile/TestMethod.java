package testFile;

/**
 * Author:lxy1999
 * Created:2019/11/11
 */
public class TestMethod {

    public void testOne(){
        this.testTwo();
        System.out.println("我是testOne方法");
    }

    public void testTwo(){
        this.testTree();
        System.out.println("我是testTwo方法");
    }

    public void testTree(){
        System.out.println("我是testTree方法");
    }

    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.testOne();
    }
    //我是testTree方法
    //我是testTwo方法
    //我是testOne方法
}

/**
 * Author:lxy1999
 * Created:2020/2/14
 */
public class HelloA {
    //构造方法
    public HelloA() {
        System.out.println("Hello A!父类构造方法");
    }

    // 非静态代码块
    {
        System.out.println("i'm A class.父类非静态代码块");
    }

    // 静态代码块
    static {
        System.out.println("static A 父类静态代码块");
    }
}

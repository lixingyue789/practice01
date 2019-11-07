/**
 * Author:lxy1999
 * Created:2019/8/12
 */
public class HelloA {
    public HelloA() {
        System.out.println("Hello A!父类构造方法");
    }

    {
        System.out.println("i'm A class.父类非静态代码块");
    }

    static {
        System.out.println("static A 父类静态代码块");
    }
}


/**
 * Author:lxy1999
 * Created:2019/8/12
 */


//public class Test {
//    public static void main(String[] args) {
//        try {
//            System.out.println(calculate(10, 0));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static int calculate(int x, int y) throws Exception {
//        int result = 0;
//        System.out.println("1.[计算开始前]*****");
//        try {
//            result = x / y;
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            System.out.println("2.[计算结束]#####");
//        }
//        return result;
//    }
//}
//class Test
//{
//    private int data;
//    int result = 0;
//    public void m()
//    {
//        result += 2;
//        data += 2;
//        System.out.print(result + " " + data);
//    }
//}
//class ThreadExample extends Thread
//{
//    private Test mv;
//    public ThreadExample(Test mv)
//    {
//        this.mv = mv;
//    }
//    public void run()
//    {
//        synchronized(mv)
//        {
//            mv.m();
//        }
//    }
//}
//class ThreadTest
//{
//    public static void main(String args[])
//    {
//        Test mv = new Test();
//        Thread t1 = new ThreadExample(mv);
//        Thread t2 = new ThreadExample(mv);
//        Thread t3 = new ThreadExample(mv);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
class Test1 {
    public static void hello() {
        System.out.println("hello");
    }
}

public class Test {
    public static void main(String[] args) {
        Test1 test = null;
        test.hello();
    }
}
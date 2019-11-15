package bittech;

/**
 * Author:lxy1999
 * Created:2019/11/7
 */
public class Test1 {
    public static String testException() {
        System.out.println("程序开始执行");
        try{
            System.out.println("try开始");
            String str = null;
            //int a = str.length();
            System.out.println("try执行完毕");
            return "try中的返回值";
        }catch(NullPointerException e){
            System.out.println("捕获了空指针异常");
        }catch (Exception e){
            System.out.println("捕获了异常");
        }finally {
            System.out.println("我是finally块，我必须执行");
        }
        System.out.println("产生异常后的所有程序");
        return "最终的返回值";
    }
    public static void testException1() throws MyException {
        System.out.println("测试自定义异常的方法执行了");
        if(2<3){
            throw new MyException("说明一下异常的具体情况");
        }
    }
    public static void main(String[] args) {
        try {
            testException1();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

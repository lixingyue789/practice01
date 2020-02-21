/**
 * Author:lxy1999
 * Created:2020/2/18
 */
public class Test10 {
    public static String testException() {
        System.out.println("程序开始执行");
        try{
            System.out.println("try开始");
            String str = null;
            int a = str.length();
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

    public static void main(String[] args) {
        System.out.println(testException());
    }
}

/**
 * Author:lxy1999
 * Created:2020/2/18
 */
public class Test9 {
    public static int cal(int x, int y) {
        int result = 0;
        System.out.println("1.[计算开始前]*****");
        try {
            result = x / y;
        } catch (Exception e) {
            throw e; // 抛出去
        } finally {
            System.out.println("2.[计算结束]#####");
        }
        System.out.println(1);
        return result;
    }

    public static void main(String[] args) {
//        try {
//            System.out.println(cal(10, 1));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
            int num = 10;
            assert num == 55 : "错误：num应当为55";
            System.out.println(num);
    }
}

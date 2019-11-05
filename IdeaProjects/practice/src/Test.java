/**
 * Author:lxy1999
 * Created:2019/8/12
 */


public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(calculate(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculate(int x, int y) throws Exception {
        int result = 0;
        System.out.println("1.[计算开始前]*****");
        try {
            result = x / y;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("2.[计算结束]#####");
        }
        return result;
    }
}
package 练习;

/**
 * Author:lxy1999
 * Created:2020/3/6
 */
public class Main7 {
    public static void main(String[] args){
        int a = 300;
        long b = 0;
        System.out.print(a+" ");
        for(int i = 0;i<30;i++){
            b = (long) (b + Math.pow(2,i));
        }
        System.out.print(b);
    }
}

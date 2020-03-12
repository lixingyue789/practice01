package 练习1;

/**
 * Author:lxy1999
 * Created:2020/3/10
 */

public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a > b)
                a /= 2;
            else
                b /= 2;
        }
        return a;
    }



    public static void main(String[] args) {
        LCA l = new LCA();
        int a = l.getLCA(68999,228762);
        System.out.println(a);
    }
}

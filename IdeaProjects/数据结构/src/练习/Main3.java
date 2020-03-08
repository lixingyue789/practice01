package 练习;

/**
 * Author:lxy1999
 * Created:2020/3/4
 */
public class Main3 {
    public int count(int n){
        int count = 0;
        while (n>0){
            if(n%10==2){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public int countNumberOf2s(int n) {
        int r = 0;
        for(int i = 2;i<=n;i++){
            r = r+count(i);
        }
        return r;
    }

    public static void main(String[] args) {
        Main3 m = new Main3();
        int n = m.countNumberOf2s(100);
        System.out.println(n);
    }
}

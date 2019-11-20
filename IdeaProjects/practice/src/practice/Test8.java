package practice;

/**
 * Author:lxy1999
 * Created:2019/11/9
 */
public class Test8 {
    public static void operate(StringBuffer a,StringBuffer b){
        a.append(b);
        b=a;
    }
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a);//AB
        System.out.println(b);//B
    }
}

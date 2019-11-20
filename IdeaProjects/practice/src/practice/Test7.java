package practice;

/**
 * Author:lxy1999
 * Created:2019/11/9
 */
public class Test7 {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public void change(String str,char[] ch){
        str = "test ok";
        System.out.println(str);
        ch[0] = 'g';
        System.out.println(ch);
        //应为传递参数传递的是地址引用，所以数组会变，但是String类比较特殊，它不会改变
        //如果要改变它，就会在产生新的一个空间来存储它
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        test7.change(test7.str,test7.ch);
        System.out.println(test7.str);
        System.out.println(test7.ch);
    }
}

package com.yue;

/**
 * Author:lxy1999
 * Created:2020/2/14
 */
//class com.yue.Outter {
//    private String outName;
//    private int outAge;
//
//    class Inner {
//        private int InnerAge;
//
//        public Inner() {
//            outName = "I am com.yue.Outter class";
//            com.yue.Outter.this.outAge = 20;
//        }
//
//        public void display() {
//            System.out.println(outName);
//            System.out.println(outAge);
//        }
//    }
//
//}
//
//public class com.yue.Test8 {
//    public static void main(String[] args) {
//        com.yue.Outter.Inner inner = new com.yue.Outter().new Inner();
//        inner.display();
//    }
//}
class Outter {
    private int num;

    public void display(int test) {
        class Inner {
            private void fun() {
                num++;
                System.out.println(num);
                System.out.println(test);
            }
        }
        new Inner().fun();
    }
}

public class Test8 {
        public static void main(String[] args) {
        Outter out = new Outter();
        out.display(20);
    }
}

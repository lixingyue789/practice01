package com.xing;

/**
 * Author:lxy1999
 * Created:2019/8/19
 */
public class Test{
    private static int i=1;
    public int getNext(){
        return i++;
    }
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();//返回是1，此时i= 2
        //System.out.println(test.getNext());
        testObject.getNext();//返回是2，此时是3
        System.out.println(testObject.getNext());
    }
}

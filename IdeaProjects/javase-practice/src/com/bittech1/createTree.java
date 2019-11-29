package com.bittech1;

import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2019/4/20
 * 待验证 带空结点的构造二叉树
 */
public class createTree {
    static class RV{
        Node node;//根结点
        int used;

       RV(Node node,int used){
           this.node = null;
           this.used = used;
       }
    }
    public static RV createTree1(char[] perOrder){
        if(perOrder.length == 0){
            return new RV(null,0);
        }
        char rootValue = perOrder[0];
        if(rootValue == '#'){
            return new RV(null,1);
        }
        Node root = new Node(rootValue);//根结点
        //左子树 递归
        char[] leftPerOrder = new char[perOrder.length - 1];
        leftPerOrder = Arrays.copyOfRange(perOrder,1,perOrder.length);
        RV leftReturn = createTree1(leftPerOrder);
        //右子树 递归
        char[] rightPerOrder = new char[perOrder.length - 1 - leftReturn.used];
        rightPerOrder = Arrays.copyOfRange(perOrder,1 + leftReturn.used,perOrder.length);
        RV rightReturn = createTree1(rightPerOrder);
        root.left = leftReturn.node;
        root.right = rightReturn.node;
        return new RV(root,1 + leftReturn.used + rightReturn.used);
    }
}

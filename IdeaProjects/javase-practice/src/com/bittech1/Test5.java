package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/20
 * 将一个二叉树转换成一个由括号和整数组成的字符串
 * 不能省略第一个对括号来中断输入和输出之间的一对一映射关系
 */
public class Test5 {
    private static void perOrderTraversal(Node root){
        if(root != null){
            System.out.println(root.value);
            perOrderTraversal(root.left);
            perOrderTraversal(root.right);
        }
    }
    private static void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.value);
            inOrderTraversal(root.right);
        }
    }
    //二叉树创建字符串
    private static void perOrderTree2Str(Node root,StringBuilder sb){
        if(root != null){
            sb.append("(");
        }else if(root.left == null && root.right != null){
            sb.append("()");
        }else{
            perOrderTree2Str(root.left,sb);
        }
        perOrderTree2Str(root.right,sb);
    }
    private static String tree2Str(Node root){
        if(root == null){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        perOrderTree2Str(root,stringBuilder);
        stringBuilder.delete(0,1);
        stringBuilder.delete(stringBuilder.length() - 1,stringBuilder.length());
        return stringBuilder.toString();
    }
    /*
    最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
    满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）
    找公共祖先
     */
    private static boolean find(Node root,Node t){
        if(root == null){
            return false;
        }
        if(root == t){
            return true;
        }
        boolean left = find(root.left,t);
        if(left){
            return true;
        }
        boolean right = find(root.right,t);
        if(right){
            return true;
        }
        return false;
    }
    private static Node lowestCommonAncestor(Node root,Node p,Node q){
        if(p == root || q == root){
            return root;
        }
        boolean pLeft = find(root.left,p);
        boolean qLeft = find(root.left,q);
        if(pLeft && qLeft){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(!pLeft && !qLeft){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }



}

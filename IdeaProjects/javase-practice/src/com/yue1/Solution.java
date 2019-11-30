package com.yue1;

/**
 * Author:lxy1999
 * Created:2019/8/25
 */
class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}
public class Solution {
    //判断是否为平衡树，时间复杂度为O(n)
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left,right);
        return max+1;
    }

    public boolean isBalanced(Node root){
        if(root == null){
            return true;
        }

        boolean left = isBalanced(root.left);
        if(!left){
            return false;
        }
        boolean right = isBalanced(root.right);
        if(!right){
            return false;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight-rightHeight>1||rightHeight-leftHeight<-1){
            return false;
        }

        return true;
   }
}

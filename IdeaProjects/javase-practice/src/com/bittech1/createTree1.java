package com.bittech1;

import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2019/4/18
 *中序与后序构造二叉树
 */
public class createTree1 {
    private static class Node{
        char value;
        Node left;
        Node right;
        Node(char v){
            this.value = v;
        }
    }

    private static int find(char[] array,int v){
        for(int i = 0;i < array.length;i++){
            if(array[i] == v){
                return i;
            }
        }
        return -1;
    }
    Node buildTree(char[] inOrder,char[] postOrder){
        char rootValue = postOrder[postOrder.length - 1];
        Node root = new Node(rootValue);
        int leftSize = find(inOrder,rootValue);
        char[] leftInorder = Arrays.copyOfRange(inOrder,0,leftSize);
        char[] leftPostOrder = Arrays.copyOfRange(postOrder,0,leftSize);
         return root;
    }
}

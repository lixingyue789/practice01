package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/17
 * 二叉树
 */
public class Tree2 {
    private static class Node{
        char value;
        Node left;
        Node right;
        Node(char v){
            this.value = v;
        }
    }
    //当树是空的，node = null;
    private static void preOrderTraversal(Node root){//前序遍历(根，左子树，右子树)
        if(root != null){
            System.out.println(root.value+ ' ');
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    private static void inOrderTraversal(Node root){//中序遍历(左子树，根，右子树)
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.value+ ' ');
            inOrderTraversal(root.right);
        }
    }
    private static void postOrderTraversal(Node root){//后序遍历(左子树，右子树，根)
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.value+ ' ');
        }
    }
    private static Node createTestTree(){
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        e.right = h;
        return a;
    }
    private static int count = 0;//用遍历的方法解决
    private static void countByTraversal(Node root){
        if(root != null){
            countByTraversal(root.left);
            countByTraversal(root.right);
            count++;
        }
    }
    private static int count(Node root){
        if(root == null){
            return 0;
        }

            return count(root.left) + count(root.right) + 1;

    }
    private static int leafNode(Node root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else {
            return leafNode(root.left) + leafNode(root.right);
        }
    }
    private static int height(Node root){
        if(root == null){
            return 0;
        }else {
            int left = height(root.left);
            int right = height(root.right);
            return (left > right ? left : right) + 1;
        }
    }
    private static int kLevel(Node root,int k){//第K层以下的结点数
        if(root == null){
            return 0;
        }else if(k == 1){
            return 1;
        }else {
            return kLevel(root.left,k - 1) + kLevel(root.right,k - 1);
        }
    }
    private static Node find(Node root,char v){
        if(root == null){
            return null;
        }
        if(root.value == v){
            return root;
        }
        Node left = find(root.left,v);
        if(left != null){
            return left;
        }
        Node right = find(root.right,v);
        if(right != null){
            return right;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = createTestTree();
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        System.out.println("二叉树的高度是" + height(root));
    }
}

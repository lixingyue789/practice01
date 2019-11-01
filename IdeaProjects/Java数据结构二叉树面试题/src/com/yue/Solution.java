package com.yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:lxy1999
 * Created:2019/8/25
 */
public class Solution {
    //二叉树前序遍历：根+左子树+右子树
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //二叉树的前序遍历（用list接收，合并多个线性表）
    public static List<Integer> preOrder1(Node root){
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return new ArrayList<>(0);
        }
        list.add(root.value);
        List<Integer> left = preOrder1(root.left);
        list.addAll(left);
        List<Integer> right = preOrder1(root.right);
        list.addAll(right);
        return list;
    }
    //二叉树前序遍历（用list接收，往一个线性表中添加元素）
    public static List<Integer> list;
    public static void preOrderTraversal1(Node root){
        if(root==null){
            return;
        }
        list.add(root.value);
        preOrderTraversal1(root.left);
        preOrderTraversal1(root.right);
    }
    public static List<Integer> preOrder2(Node root){
        list= new ArrayList<>();
        preOrderTraversal1(root);
        return list;
    }
    //二叉树的中序遍历：左子树+根+右子树
    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);
    }
    //二叉树的后序遍历：左子树+右子树+根
    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");
    }
    //二叉树的结点个数（遍历）
    public static int count = 0;
    public static void count1(Node root){
        //首先应该遍历二叉树，遇到结点数目加一
        if(root==null){
            return;
        }
        count++;
        count1(root.left);
        count1(root.right);
    }
    //二叉树的结点个数（汇总）
    public static int count2(Node root){
        //二叉树的结点=根+左子树+右子树，终止条件同上
        if(root==null){
            return 0;
        }
        int left = count2(root.left);
        int right = count2(root.right);
        return left+right+1;
    }
    //二叉树的叶子结点(遍历)
    public static int leafCount = 0;
    public static void leafCount1(Node root){
        //遍历二叉树当左右子树为空时，数目加一
        if(root==null){
            return;
        }
        //代表叶子结点
        if(root.left==null&&root.right==null){
            leafCount++;
        }
        leafCount1(root.left);
        leafCount1(root.right);
    }
    //二叉树的叶子结点（汇总）
    public static int leafCount2(Node root){
        //叶子结点=根+左子树叶子结点+右子树叶子结点,终止条件：树空
        if(root==null){
            return 0;
        }
        //代表只有一个结点树
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left = leafCount2(root.left);
        int right = leafCount2(root.right);
        return left+right;
    }
    //二叉树的高度
    public static int height(Node root){
        //左子树高度与右子树高度的最大值加一，终止：树空
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int max = Math.max(leftHeight,rightHeight);
        return max+1;
    }
    //计算二叉树第k层结点
    public static int kLevelCount(Node root,int k){
        //要计算第k层结点就要计算第k-1层结点，终止：树空，考虑k=1时
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return kLevelCount(root.left,k-1)+kLevelCount(root.right,k-1);
    }
    //查找二叉树的结点,返回该引用
    public static Node find(Node root,Node p){
        if(root==null){
            return null;
        }
        if(root==p){
            return root;
        }
        Node left = find(root.left,p);
        if(left!=null){
            return left;
        }
        Node right = find(root.right,p);
        if(right!=null){
            return right;
        }
        return null;
    }
    //查找该树中是否有该结点
    public static boolean find1(Node root,Node p){
        if(root == null){
            return false;
        }
        if(root==p){
            return true;
        }
        if(find1(root.left,p)){
            return true;
        }
        return find1(root.right,p);
    }
    //判断两个树是否相同
    public static boolean isSameTree(Node p,Node q){
        //判断两个树：根+左子树+右子树
        if(p==null||q==null){
            if(p==null&&q==null){
                return true;
            }
            return false;
        }
        return p.value==q.value
                &&isSameTree(p.left,q.left)
                &&isSameTree(p.right,q.right);
    }
    //判断是否镜像
    public static boolean isMirror(Node p,Node q){
        //判断左子树是否与与右子树相同
        if(p==null||q==null){
            if(p==null&&q==null){
                return true;
            }
            return false;
        }
        return p.value==q.value
                &&isMirror(p.left,q.right)
                &&isMirror(p.right,q.left);
    }
    //判断是否对称
    public boolean isSymmetric(Node root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    //判断一个数是否为另一个树的子树
    public static boolean isSubTree1(Node p,Node q){
        //首先判断p与q整个树是否相同，递归判断p的左子树是否与q相同，p的右子树是否与q相同
        if (p==null||q==null){
            return false;
        }
        return isSameTree(p,q)
                ||isSubTree1(p.left,q)
                ||isSubTree1(p.right,q);
    }
    //构建二叉树
    public static Node buildTree(List<Integer> preOrder, List<Integer> inOrder) {
        //利用前序和中序构建二叉树，递归构建左子树、右子树,终止：size==0
        if (preOrder.size() == 0) {
            return null;
        }
        int rootValue = preOrder.get(0);
        Node root = new Node(rootValue);
        int leftSize = inOrder.indexOf(rootValue);
        List<Integer> leftPreOrder = preOrder.subList(1, leftSize + 1);
        List<Integer> leftInOrder = inOrder.subList(0, leftSize);
        Node left = buildTree(leftPreOrder, leftInOrder);
        root.left = left;
        List<Integer> rightPreOrder = preOrder.subList(leftSize+1,preOrder.size());
        List<Integer> rightInOrder = inOrder.subList(leftSize+1,inOrder.size());
        Node right = buildTree(rightPreOrder,rightInOrder);
        root.right = right;
        return root;
    }
    //构建二叉树
    public static Node buildTree1(List<Integer> inOrder,List<Integer> postOrder){
        //利用后序、中序构建二叉树
        if(inOrder.size()==0){
            return null;
        }
        int rootValue = postOrder.get(postOrder.size()-1);
        Node root = new Node(rootValue);
        int leftSize = inOrder.indexOf(rootValue);
        List<Integer> leftInOrder = inOrder.subList(0,leftSize);
        List<Integer> leftPostOrder = postOrder.subList(0,leftSize);
        Node left = buildTree1(leftInOrder,leftPostOrder);
        root.left = left;
        List<Integer> rightInOrder = inOrder.subList(leftSize+1,inOrder.size());
        List<Integer> rightPostOrder = postOrder.subList(leftSize,postOrder.size()-1);
        Node right = buildTree1(rightInOrder,rightPostOrder);
        root.right = right;
        return root;
    }
    public static Node createTree(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = null;c.right = f;
        d.left = null;d.right = null;
        e.left = null;e.right = null;
        f.left = null;f.right = null;
        return a;
    }

    public static void main(String[] args) {
        Node root = createTree();
        preOrderTraversal(root);
        System.out.println();
        System.out.println("---------------");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("---------------");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("---------------");
        count1(root);
        System.out.println(count);
        int count2 = count2(root);
        System.out.println(count2);
        System.out.println("---------------");
        leafCount1(root);
        System.out.println(leafCount);
        int leafCount2 = leafCount2(root);
        System.out.println(leafCount2);
        System.out.println("---------------");
        System.out.println(height(root));
        System.out.println("---------------");
        System.out.println(kLevelCount(root,3));
        System.out.println("---------------");
        System.out.println(preOrder1(root));
        System.out.println(preOrder2(root));
        System.out.println("---------------");
        List<Integer> preOrder = Arrays.asList(1,2,4,5,3,6);
        List<Integer> inOrder = Arrays.asList(4,2,5,1,3,6);
        List<Integer> postOrder = Arrays.asList(4,5,2,6,3,1);
        Node n1 = buildTree(preOrder,inOrder);
        System.out.println("成功");
        Node n2 = buildTree1(inOrder,postOrder);
        System.out.println("成功");
    }
}

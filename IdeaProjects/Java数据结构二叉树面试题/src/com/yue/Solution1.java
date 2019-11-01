package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/8/25
 */
public class Solution1 {
    public static Node createTree1(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = null;c.right = null;
        d.left = null;d.right = null;
        e.left = null;e.right = f;
        f.left = null;f.right = null;
        return a;
    }
    //用数组建树：根据前序和中序，分别递归建立左子树和右子树，终止：数组长度为0
    public static Node buildTree(int[] preOrder, int[] inOrder) {
        if(preOrder.length==0){
            return null;
        }
        int rootValue = preOrder[0];
        Node root = new Node(rootValue);
        int leftSize = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (root.value == inOrder[i]) {
                leftSize = i;
            }
        }
        int[] leftPreOrder = Arrays.copyOfRange(preOrder, 1, leftSize + 1);
        int[] leftInOrder = Arrays.copyOfRange(inOrder,0,leftSize);
        Node left = buildTree(leftPreOrder,leftInOrder);
        root.left = left;
        int[] rightPreOrder = Arrays.copyOfRange(preOrder,leftSize+1,preOrder.length);
        int[] rightInOrder = Arrays.copyOfRange(inOrder,leftSize+1,inOrder.length);
        Node right = buildTree(rightPreOrder,rightInOrder);
        root.right = right;
        return root;
    }

    public static Node buildTree1(int[] inOrder,int[] postOrder){
        if(inOrder.length==0){
            return null;
        }
        int rootValue = postOrder[postOrder.length-1];
        Node root = new Node(rootValue);
        int leftSize = 0;
        for(int i = 0;i<inOrder.length;i++){
            if(inOrder[i]==root.value){
                leftSize = i;
            }
        }
        int[] leftInOrder = Arrays.copyOfRange(inOrder,0,leftSize);
        int[] leftPostOrder = Arrays.copyOfRange(postOrder,0,leftSize);
        Node left = buildTree1(leftInOrder,leftPostOrder);
        root.left = left;
        int[] rightInOrder = Arrays.copyOfRange(inOrder,leftSize+1,inOrder.length);
        int[] rightPostOrder = Arrays.copyOfRange(postOrder,leftSize,postOrder.length-1);
        Node right = buildTree1(rightInOrder,rightPostOrder);
        root.right = right;
        return root;
    }

    static class ReturnValue{
        Node root;
        int used;
    }
    //根据一个带空树的前序遍历建树
    //根+左子树+右子树，但只有一种遍历，所有需要记录左子树锁所需要的元素个数
    public static ReturnValue createTreePreOrder(List<Integer> preOrder){
        //首先考虑线性表为空的情况
        if(preOrder.size()==0){
            ReturnValue rv = new ReturnValue();
            rv.root = null;
            rv.used = 0;
            return rv;
        }
        //其次考虑线性表中遇到‘#’时，用掉一个元素
        int value = preOrder.get(0);
        Node root = new Node(value);
        if(value=='#'){
            ReturnValue rv = new ReturnValue();
            rv.root = null;
            rv.used = 1;
            return rv;
        }
        //将线性表分割
        ReturnValue leftPreOrder = createTreePreOrder(preOrder.subList(1,preOrder.size()));
        ReturnValue rightPreOrder = createTreePreOrder(preOrder.subList(1+leftPreOrder.used,preOrder.size()));
        //分割树线性表的左右子树
        root.left = leftPreOrder.root;
        root.right = rightPreOrder.root;
        //返回
        ReturnValue rv = new ReturnValue();
        rv.root = root;
        rv.used = 1+leftPreOrder.used+rightPreOrder.used;
        return rv;
    }
    public static void preOrderTraver(StringBuilder sb,Node root){
        //首先在进行前序遍历的同时给前后以及左为空右不为空的加上括号
        if(root==null){
            return;
        }
        sb.append("(");
        sb.append(root);
        if(root.left==null&&root.right!=null){
            sb.append("()");
        }
        preOrderTraver(sb,root.left);
        preOrderTraver(sb,root.right);
        sb.append(")");
    }
    //二叉树创建字符串
    public static String treeStr(Node root){
        if(root == null){
            return "";
        }
        //取出字符串中[1,result.length-1)
        StringBuilder sb = new StringBuilder();
        preOrderTraver(sb,root);
        String result = sb.toString();
        return result.substring(1,result.length()-1);
    }
    //给定一个二叉树，找出该树两个指定节点的公共祖先
    public static Boolean find(Node root,Node p){
        //首先查找结点
        if(root==null||p==null){
            return false;
        }
        if(root==p){
            return true;
        }
        if(find(root.left,p)){
            return true;
        }
        return find(root.right,p);
    }
    public static Node lowerAncestor(Node root,Node p,Node q){
        //判断p、q是否为root
        if(root == p||root==q){
            return root;
        }
        Boolean pLeft = find(root.left,p);
        Boolean qLeft = find(root.left,q);
        //判断p、q是否都在左子树上
        if(pLeft&&qLeft){
            return lowerAncestor(root.left,p,q);
        }
        //判断p、q是否都在右子树上
        if(!pLeft&&!qLeft){
            return lowerAncestor(root.right,p,q);
        }
        //p、q分别在左右子树上
        return root;
    }
    //平衡二叉树
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int max = Math.max(leftHeight,rightHeight);
        return max;
    }
    public static boolean isBalanced(Node root){
        if(root == null){
            return false;
        }
        if(isBalanced(root.left)){
            return true;
        }
        if(isBalanced(root.right)){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diff = leftHeight-rightHeight;
//        if(diff==1||diff==-1||diff==0){
//            return true;
//        }
        if(diff>1||diff<-1){
            return false;
        }
        return true;
    }
    //二叉树的层序遍历(队列)
    public static void levelTraversal(Node root){
        //首先判断root是否为空
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        //将首元素加到队列中
        queue.add(root);
        //若队列中还有元素就继续循环
        while (!queue.isEmpty()){
            //将队首元素弹出，并打印
            Node front = queue.poll();
            System.out.print(front.value+" ");
            //将弹出元素的左右孩子结点加入到队列中去
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
    }
    //二叉树的层序遍历（用List）
    //要将每一层的元素加到一个list中，所有要lever属性
    static class Element{
        Node node;
        int level;
    }
    public static List<List<Integer>> levelTraversal1(Node root){
        List<List<Integer>> list = new ArrayList<>();
        //如果root为空，返回空的list
        if(root == null){
            return list;
        }
        Queue<Element> queue = new LinkedList<>();
        Element element = new Element();
        element.node = root;
        element.level = 0;
        //将root加入到对列中去
        queue.add(element);
        while (!queue.isEmpty()){
            //将队首元素弹出并记录
            Element front = queue.poll();
            //线性表中每个元素又是一个线性表，当线性表的size与弹出元素的层数一致时，需要增加一个新的线性表
            if(front.level==list.size()){
                list.add(new ArrayList<>());
            }
            //如果不同，直接在线性表中加入元素
            list.get(front.level).add(front.node.value);
            //如果弹出元素的左右孩子都不为空，将它们加入到队列中
            if(front.node.left!=null){
                Element left = new Element();
                left.node = front.node.left;
                left.level = front.level+1;
                queue.add(left);
            }
            if(front.node.right!=null){
                Element right = new Element();
                right.node = front.node.right;
                right.level = front.level+1;
                queue.add(right);
            }
        }
        return list;
    }
    //判断是否完全二叉树
    public static boolean isComplement(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (true) {
            Node front = queue.poll();
            if (front == null) {
                break;
            }
            queue.add(root.left);
            queue.add(root.right);
        }
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(node!=null){
                return false;
            }
        }
        return true;
    }

    public static void perOrderT(Node root){
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(!stack.isEmpty()||cur!=null) {
            while (cur != null) {
                System.out.print(cur.value + " ");
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
    }
    public static void inOrderT(Node root){
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur!=null||!stack.isEmpty()){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.value+" ");
            cur = top.right;
        }
    }
    public static void postOrderT(Node root){
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node last = null;
        while (cur!=null||!stack.isEmpty()){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.peek();
            if (top.right == null || top.right == last) {
                stack.pop();
                System.out.print(top.value+" ");
                last = top;
            } else {
                cur = top.right;
            }
        }
    }
    public static void main(String[] args) {
        int[] preOrder = {1,2,4,5,3,6};
        int[] inOrder = {4,2,5,1,3,6};
        int[] postOrder = {4,5,2,6,3,1};
        Node n1 = buildTree(preOrder,inOrder);
        System.out.println("成功");
        Node n2 = buildTree1(inOrder,postOrder);
        System.out.println("成功");
        System.out.println("=======================");
        List<Integer> list = Arrays.asList(1,2,(int)'#',(int)'#',3,(int)'#',(int)'#');
        ReturnValue rv = new ReturnValue();
        rv = createTreePreOrder(list);
        System.out.println("成功");
        System.out.println("=======================");
        Node root = createTree1();
        System.out.println(treeStr(root));
        System.out.println("=======================");
        levelTraversal(root);
        System.out.println();
        System.out.println("=======================");
        System.out.println(isBalanced(root));
        System.out.println("=======================");
        List<List<Integer>> lists = levelTraversal1(root);
        System.out.println(lists);
        System.out.println("========================");
        perOrderT(root);
        System.out.println();
        System.out.println("=========================");
        inOrderT(root);
        System.out.println();
        System.out.println("=========================");
        perOrderT(root);
    }
}

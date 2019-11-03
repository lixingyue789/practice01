package com.xing;


/**
 * Author:lxy1999
 * Created:2019/9/15
 */
//实现Set(底层是搜索树，以value的形式存在)
public class MyBinarySearchTree {
    private static class Node{
        private int key;
        private int value;

        private Node left;
        private Node right;
    }

    private Node root = null;

    /**
     * 通过key得到value
     * @param key
     * @return
     */
    public int get(int key) {
        Node cur = root;
        while (cur!=null){
            if(key==cur.key){
                return cur.value;
            }else if(key<cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return -1;
    }

    /**
     * 将key，value加到set中去
     * @param key
     * @param value
     * @return
     */
    public int put(int key, int value) {
        if (root == null){
            Node node = new Node();
            node.key = key;
            node.value = value;
            root = node;
            return -1;
        }
        Node cur = root;
        Node parent = null;
        while (cur!=null){
            if(key==cur.key){
                int oldValue = cur.value;
                cur.value = value;
                return oldValue;
            }else if(key<cur.value){
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        if(key<parent.value){
            parent.left = node;
        }else {
            parent.right = node;
        }
        return -1;
    }

    private void deleteNode(Node parent,Node cur){
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            Node goat = cur.left;
            Node goatParent = cur;
            while (goat.right != null) {
                goatParent = goat;
                goat = goat.right;
            }

            // goat 是比 cur 的值小的中最大的一个
            cur.key = goat.key;
            cur.value = goat.value;

            // 思考题，为什么还需要判断替罪羊是它父亲的哪个孩子？
            if (goat == goatParent.left) {
                goatParent.left = goat.left;
            } else {
                goatParent.right = goat.left;
            }
        }
    }

    /**
     * 将set中的key删除
     * @param key
     * @return
     */
    public int remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur!=null){
            if(key==cur.key){
                int oldValue = cur.value;
                deleteNode(parent,cur);
                return oldValue;
            }else if(key<cur.key){
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        return -1;
    }
}

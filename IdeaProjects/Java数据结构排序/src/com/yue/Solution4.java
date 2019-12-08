package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/6
 */
//利用搜索树实现map中的方法，搜索树中序是有序的，即左子树小于根，右子树大于根
public class Solution4 {
    public static class Node{
        int key;
        int value;
        Node left;
        Node right;

    }
    private static Node root = null;

    /**
     * 查找
     * @param key 关键字
     * @return 找到了返回对应的 value，如果没找到，返回 -1
     */
    public int get(int key) {
        if(root == null){
            return -1;
        }
        Node cur = root;
        while (cur!=null){
            if(key == cur.key){
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
     * 添加
     * @param key
     * @param value
     * @return 在map中key是无重复的，一旦重复就会覆盖以前的value值
     */
    public int put(int key, int value) {
        if(root==null){
            root = new Node();
            root.key = key;
            root.value = value;
            root.left = null;
            root.right = null;
            return -1;
        }
        Node cur = root;
        //当添加的元素在树中，则覆盖，若没有则申请结点插入，同时要与父节点比较放左边还是右边
        Node parent = null;
        while (cur!=null){
            if(key == cur.key){
                int oldValue = cur.key;
                cur.key = key;
                return oldValue;
            }else if(key<cur.key){
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        //走到空上
        Node node = new Node();
        node.key = key;
        node.value = value;
        if(key<parent.key){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return -1;
    }

    /**
     * 在二叉树中如果找到key就返回value，否则返回defaultValue
     * @param key
     * @param defaultValue
     * @return
     */
    public int getOrDefault(int key, int defaultValue) {
        if(root==null){
            return defaultValue;
        }
        Node cur = root;
        while (cur!=null){
            if(key == cur.key){
                return cur.value;
            }else if(key<cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return defaultValue;
    }

    /**
     * 方法一：层序遍历
     * 打印所有的key
     * @return
     */
    public Set<Integer> keySet1() {
        Set<Integer> set = new HashSet<>();
        if(root == null){
            return set;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node result = queue.poll();
            set.add(result.key);
            if(result.left!=null){
                queue.add(result.left);
            }
            if(result.right!=null){
                queue.add(result.right);
            }
        }
        return set;
    }

    /**
     * 方法二：中序遍历
     * 打印所有的key
     * @return
     */
    public Set<Integer> keySet2() {
        Set<Integer> set = new HashSet<>();
        inOrderTravel(root,set);
        return set;
    }
    public static void inOrderTravel(Node root,Set<Integer> set){
        if(root!=null){
            inOrderTravel(root.left,set);
            set.add(root.key);
            inOrderTravel(root.right,set);
        }
    }
    public static class Entry{
        private int key;
        private int value;

        private int getKey(){
            return key;
        }

        private int getValue(){
            return value;
        }

        private Set<Entry> entrySet(){
            Set<Entry> set = new HashSet<>();
            if(root == null){
                return set;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.isEmpty()){
                Node front = queue.poll();
                Entry entry = new Entry();
                entry.key = front.key;
                entry.value = front.value;
                set.add(entry);
                if(front.left!=null){
                    queue.add(front.left);
                }
                if(front.right!=null){
                    queue.add(front.right);
                }
            }
            return set;
        }
    }
}

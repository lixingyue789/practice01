package com.yue;

/**
 * Author:lxy1999
 * Created:2019/8/18
 * 双向链表
 */

public class LinkedList implements List{
     private class Node{
         private int value;
         private Node next;
         private Node pre;

         private Node(int value) {
             this.value = value;
         }

         private Node(int value, Node next, Node pre) {
             this.value = value;
             this.next = next;
             this.pre = pre;
         }
     }

     private Node head = null;
     private Node last = null;
     private int size = 0;

    @Override
    public boolean add(int element) {
        return add(size,element);
    }

    @Override
    public boolean add(int index, int element) {
        if(index<0 && index>size){
            System.out.println("插入位置不合法");
            return false;
        }
        if(index == 0){
            Node newNode = new Node(element,head,null);
            if (newNode.next != null) {
                newNode.next.pre = newNode;
            }else {
                last = newNode;
            }
            head = newNode;
            size++;
            return true;
        }
        if(index == size){
            Node newNode = new Node(element,null,last);
            if(newNode.pre != null){
                newNode.pre.next = newNode;
            }else {
                head = newNode;
            }
            last = newNode;
            size++;
            return true;
        }

        Node cur = getNode(index);
        Node newNode = new Node(element,cur.pre,cur);
        cur.pre.next = newNode;
        cur.pre = newNode;
        size++;
        return true;
    }



    private Node getNode(int index) {
        int middle = size/2;
        if(index<middle){
            Node cur = head;
            for(int i = 0;i<index;i++){
                cur = cur.next;
            }
            return cur;
        }else {
            Node cur = last;
            for(int i = 0;i<size-index-1;i++){
                cur = cur.pre;
            }
            return cur;
        }
    }

    @Override
    public int get(int index) {
        if(index<0&&index>=size){
            return -1;
        }
        return getNode(index).value;
    }

    @Override
    public int set(int index, int val) {
        if(index<0&&index>=size){
            return -1;
        }
        int oldValue = getNode(index).value;
        getNode(index).value = val;
        return oldValue;
    }

    @Override
    public int remove(int index) {
        if(index<0&&index>=size){
            return -1;
        }
        Node cur = getNode(index);
        if(cur.pre!= null){
            cur.pre.next = cur.next;
        }else {
            head = head.next;
        }
        if(cur.next!=null){
            cur.next.pre = cur.pre;
        }else {
            last = last.pre;
        }
        size--;
        return cur.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        String result = "[";
        for(Node node = head;node!=null;node = node.next){
            result +=  (node.value+" ");
        }
        result +="]";
        return result;
    }
}
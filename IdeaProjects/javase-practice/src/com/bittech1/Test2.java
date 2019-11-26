package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/15
 * 不带头双向链表实现
 */
public class Test2 {
    public static class Node{
        int value;
        Node next;
        Node pre;
        public Node(int value,Node next,Node pre){
            this.value = value;
            this.next = this.pre = null;
        }
    }
    public Node head;
    public Node last;
    public Test2(Node head,Node last){
        this.head = this.last = null;
    }

    public void addFirst(Node node){
        node.next = head.next;
        head = node;
        if(this.last == null){
            this.last = node;
        }
    }

    public void removeFirst(Node node){
        this.head = this.head.next;
        if(this.head == null){
         this.last = null;
        }
    }

    public void addLast(Node node){
        if(this.last == null){
            this.last = node;
        }else{
            node.pre = this.last;
            this.last.next = node;
            this.last = node;
        }
    }

    public void removeLast(Node node) {
        if(this.last == null){
            this.head = this.last = null;
        }else{
            this.last.pre.next = null;
        }
    }
}

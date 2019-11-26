package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/15
 * 队列的实现（链表）
 */
public class Test4 {
    public static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node last;
    public Test4(Node head,Node last){
        this.head = this.last = null;
    }
    /*
    把数据插到队尾
     */
    public void push(int v){
        Node node = new Node(v);
        node.next = null;
        if(this.head == null){
            this.head = this.last = node;
        }else{
            this.head = this.last = node;
        }
    }
    /*
    出队列
     */
    public int pop(){
        int v = this.head.value;
        this.head = this.head.next;
        if(this.head == null){
            this.last = null;
        }
        return v;
    }
    /*
    返回队首元素
     */
    public int front(){
        return this.head.value;
    }
    public int size(){
        int count = 0;
        Node node = head;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }
    public boolean isEmpty(){
        return this.last == null;
    }
}

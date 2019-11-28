package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/8
 */
/**
 * Author:lxy1999
 * Created:2019/4/8
 */
public class MyLinkedList {

    public static class Node {
        /**
         * 值
         */
        public int value;
        /**
         * 下一个结点的引用
         */
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * 链表中第一个结点的引用
     */
    public Node head;

    public MyLinkedList() {
        this.head = null;
    }

    /**
     * 头插
     */
    public void pushFront(int item) {
        Node node = new Node(item);
        node.next = this.head;
        this.head = node;
    }

    /**
     * 尾插
     */
    public void pushBack(int item) {
        Node node = new Node(item);
        if (this.head == null) {
            this.head = node;
        } else {
            Node last = getLast();
            last.next = node;
        }
    }

    /**
     * 查找链表中的最后一个结点，前提链表中至少有一个结点
     */
    private Node getLast() {
        if (this.head == null) {
            throw new Error();
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * 通过循环遍历链表中的每一个结点
     */
    public void display() {
        // 如何通过循环，遍历链表的每一个结点
        Node cur = this.head;
        while (cur != null) {
            System.out.format("%d --> ",cur.value);
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        /*list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.display();//3-->2-->1-->null
        */
        list.pushBack(10);
        list.pushBack(20);
        list.pushBack(30);
        list.display();
    }
}
package com.xing;

/**
 * Author:lxy1999
 * Created:2019/8/21
 */
public class MyQueue {
    //用链表实现队列（尾删头插）
    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node front = null;
    private Node rear = null;
    private int size = 0;

    public void push(int element) {
        size++;
        if(rear!=null){
            rear.next = new Node(element);
        }else {
            rear=front = new Node(element);
        }
    }
    public int pop() {
        size--;
        int value = front.value;
        front = front.next;
        return value;
    }

    public int rear() {
        int value = rear.value;
        return value;
    }

    public int front() {
        return front.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }
}

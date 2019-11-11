package com.xing;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:lxy1999
 * Created:2019/8/20
 */
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.print(list.peek()+" ");
        System.out.print(list.peekFirst()+" ");
        System.out.println(list.peekLast());
        System.out.print(list.poll()+" ");
        System.out.print(list.pollFirst()+" ");
        System.out.println(list.pollLast());
        System.out.println(list);
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list);
        System.out.println(list.pop());
        Queue<Integer> queue = new LinkedList<>();

    }
}

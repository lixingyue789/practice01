package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/12
 */
public class Test1 {
    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode random;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode CopyRandomList(ListNode head){
        if(head == null){
            return null;
        }
        // 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点
        //该指针可以指向前面的结点也可以只向后面的结点也可以指向自己也可以指向空
        //要求返回这个链表的深度拷贝
        //复制
        ListNode cur = head;
        while(cur != null){
           ListNode newNode = new ListNode(cur.val);
            //将新申请的结点插入旧链表中
            //把newNode插入到cur后面
            newNode.next = cur.next;
            cur.next = newNode;
            //让cur走向下一个结点
            cur = cur.next.next;
        }
        //找random
        cur = head;
        ListNode newNode = cur.next;
        while (cur != null){
            if(cur.random == null){
                newNode.random = null;
            }else{
                newNode.random = cur.random.next;
            }
            //让cur走向下一个结点
            cur = cur.next.next;
        }
        //拆分
        ListNode result = head.next;
        cur = head;
        while(cur != null){
            cur.next = newNode.next;
            if(newNode.next != null) {
                newNode.next = newNode.next.next;
            }
            cur = cur.next;
        }
        return result;
    }
    public static void show(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.format("%d --> ",cur.val);
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(2);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = null;
        n1.random = n3;n2.random = n1;n3.random = n3;n4.random = null;
        CopyRandomList(n1);
        show(n1);
    }
}

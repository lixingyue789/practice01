package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/9
 * 验证其他函数是否正确
 */
public class Test {
    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public class Solution {
        public ListNode Partition(ListNode pHead, int x) {
            //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
            ListNode small = null;//小于x
            ListNode smallLast = null;//小于x的最后一个结点
            ListNode big = null;//大于x
            ListNode bigLast = null;//大于x的最后一个结点

            ListNode cur = pHead;
            while (cur != null) {
                ListNode next = cur.next;
                //小于x尾插到small,大于或等于x尾插到big
                if (cur.val < x) {
                    cur.next = null;
                    if (small == null) {
                        small = cur;
                    } else {
                        smallLast.next = cur;
                    }
                    smallLast = cur;
                } else {
                    if (big == null) {
                        big = cur;
                    } else {
                        bigLast.next = cur;
                    }
                    bigLast = cur;
                }
                cur = next;
            }
            //需要考虑链表为空的情况
            if (small == null) {
                return big;
            } else {
                smallLast.next = big;
                return small;
            }
        }
        public ListNode FindKthToTail(ListNode head, int k) {
            //输出该链表中倒数第k个结点
            ListNode front = head;
            ListNode back = head;

            int i;

            for (i = 0; front != null && i < k; i++) {
                front = front.next;
            }

            if (front == null && i < k) {
                return null;
            } else if (front == null) {//考虑边界问题，i = k
                return head;
            }

            while (front != null) {
                front = front.next;
                back = back.next;
            }
            return back;
        }


        public int length(ListNode head) {
            int len = 0;
            ListNode cur = head;
            while (cur != null) {
                len++;
                cur = cur.next;
            }
            return len;
        }

        public ListNode reverse(ListNode head) {
            ListNode result = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                //头插
                cur.next = result;
                result = cur;
                cur = next;
            }
            return result;
        }

        public boolean chkPalindrome(ListNode A) {
            //链表的回文结构(判断是否有回文)
            //A-B-C-D-B-A(不是回文)
            int len = length(A);
            int halfLen = len / 2;

            ListNode middle = A;
            for (int i = 0; i < halfLen; i++) {
                middle = middle.next;
            }
            ListNode r = reverse(middle); //r:A-B-D   middle:D-B-A

            ListNode c1 = A;
            ListNode c2 = r;

            while (c1 != null && c2 != null) {
                if (c1.val != c2.val) {
                    return false;
                }
                c1 = c1.next;
                c2 = c2.next;
            }
            return true;
        }

        public ListNode deleteDuplication(ListNode head) {
            // 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
            if (head == null) {
                return null;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;//消除第一个结点没有前驱的特殊性
            ListNode prev = dummy;//prev永远是p1的前驱结点，用来删除结点
            ListNode p1 = head;
            ListNode p2 = head.next;
            while (p2 != null) {
                if (p1.val != p2.val) {
                    prev = prev.next;
                    p1 = p1.next;
                    p2 = p2.next;
                } else {
                    while (p2 != null && p1.val == p2.val) {
                        p2 = p2.next;
                    }
                    prev.next = p2;
                    p1 = p2;
                    if (p2 != null) {
                        p2 = p2.next;
                    }
                }
            }
            return dummy.next;
        }
        public ListNode deleteDuplication2(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode pre = null;
            ListNode n1 = head;
            ListNode n2 = head.next;
            while (n2 != null) {
                if (n1.val != n2.val) {
                    pre = n1;
                    n1 = n1.next;
                    n2 = n2.next;
                } else {
                    while (n2 != null && n1.val == n2.val) {
                        n2 = n2.next;
                    }
                    if (n1 == head) {
                        head = n2;
                    } else {
                        pre.next = n2;
                    }

                    n1 = n2;
                    if (n2 != null) {
                        n2 = n2.next;
                    }
                }
            }
            return head;
        }
    }


    public static ListNode CopyRList(ListNode head){
        //普通的链表复制
        ListNode cur = head;
        ListNode result = null;
        ListNode last = null;//记录结果链表的最后一个结点
        while (cur != null){
            ListNode newNode = new ListNode(cur.val);
            //尾插
            if(result == null){
                result = newNode;
            }else {
                last.next = newNode;
            }
            last = newNode;
            cur = cur.next;
        }
        last.next = null;
        return result;
    }

    public int getLength(ListNode head){
        int length = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            length++;
        }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        //输入两个链表，找出它们的第一个公共结点
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int m = len1 - len2;
        ListNode longer = headA;
        ListNode shorter = headB;
        if(len1 < len2){
            m = len2 - len1;
            longer = headB;
            shorter = headA;
        }
        for(int i = 0;i < m;i++){
            longer = longer.next;
        }
        while (longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(8);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = null;
        CopyRList(n1);
    }
}

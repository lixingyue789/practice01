package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/8
 * 验证其他函数是否正确
 */
public class interview {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static class Solution {
        public ListNode removeElement(ListNode head, int val) {
            //删除链表中等于给定值 val 的所有节点
            ListNode result = null;//定义结果链表
            ListNode last = null;//记录结果链表中的最后一个链表
            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                if (cur.val != val) {
                    //把cur结点 尾插 到result链表上
                    cur.next = null;
                    if (result == null) {
                        result = cur;
                    } else {
                        last.next = cur;
                    }//尾插结束
                    last = cur;//更新链表中的最后一个结点
                }
                cur = next;
            }
            return result;
        }

        public ListNode removeElement2(ListNode head, int val) {
            //删除链表中等于给定值 val 的所有节点
            if (head == null) {
                return null;
            }
            ListNode cur = head;
            while (cur.next != null) {
                if (cur.next.val != val) {
                    cur = cur.next;
                } else {
                    cur.next = cur.next.next;
                }
            }
            if (head.val == val) {
                return head.next;
            } else {
                return head;
            }
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            ListNode cur1 = l1;
            ListNode cur2 = l2;
            ListNode result = null;//结果链表
            ListNode last = null;//记录结果链表的最后一个结点

            while (cur1 != null && cur2 != null) {
                if (cur1.val <= cur2.val) {
                    ListNode next = cur1.next;
                    //让cur1尾插到result上
                    //尾插
                    cur1.next = null;
                    if (result == null) {
                        result = cur1;
                    } else {
                        last.next = cur1;
                    }
                    last = cur1;
                    cur1 = next;
                } else {
                    ListNode next = cur2.next;
                    //让cur2尾插到result上
                    //尾插
                    cur2.next = null;
                    if (result == null) {
                        result = cur2;
                    } else {
                        last.next = cur2;
                    }
                    last = cur2;
                    cur2 = next;
                }
            }
                if (cur1 != null) {
                    last.next = cur1;
            }
                if (cur2 != null) {
                    last.next = cur2;
            }
            return result;
        }

        public static void main(String[] args) {
            ListNode n1 = new ListNode(1);
            ListNode n2 = new ListNode(6);
            ListNode n3 = new ListNode(3);
            ListNode n4 = new ListNode(6);
            ListNode n5 = new ListNode(4);
            ListNode n6 = new ListNode(6);
            ListNode n7 = new ListNode(8);

            n1.next = n2;n2.next = n3;n3.next = n4;
            n4.next = n5;n5.next = n6;n6.next = n7;
            n7.next = null;
            Solution solution = new Solution();
            ListNode result = solution.removeElement(n1,6);
            ListNode cur = result;
            while (cur != null){
                System.out.println(cur.val);
                cur = cur.next;
            }
        }
    }
}

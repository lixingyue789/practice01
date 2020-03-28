package 链表;

/**
 * Author:lxy1999
 * Created:2020/3/1
 */
public class practice6 {
    public ListNode partition(ListNode pHead, int x) {
        ListNode first = null;
        ListNode second = null;
        ListNode last1 = null;
        ListNode last2 = null;
        ListNode cur = pHead;
        ListNode back = null;
        while(cur!=null){
            if(cur.val<x){
                ListNode n = new ListNode(cur.val);//***********
                if(first==null){
                    first = n;
                    back = n;
                }else {
                    last1 = first;
                    while (last1.next!=null){
                        last1 = last1.next;
                    }
                    last1.next = n;
                    back = n;
                }
            }else{
                ListNode n = new ListNode(cur.val);
                if(second==null){
                    second = n;
                }else {
                    last2 = second;
                    while (last2.next!=null){
                        last2 = last2.next;
                    }
                    last2.next = n;
                }
            }
            cur = cur.next;
        }
        if(back!=null){
            back.next = second;
            return first;
        }else {
            return second;
        }
    }
}

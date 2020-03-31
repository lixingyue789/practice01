package 链表;

/**
 * Author:lxy1999
 * Created:2020/3/1
 */
public class practice7 {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode Head = new ListNode(0);
        Head.next = pHead;
        ListNode slow = Head;
        ListNode fast = Head.next;
        while(fast!=null){
            if(fast.next!=null && fast.val==fast.next.val){
                while(fast.next!=null && fast.val == fast.next.val){
                    fast = fast.next;
                }
                slow.next = fast.next;
                fast = fast.next;
            }else{
                slow = slow.next;
                //if(fast.next!=null){
                fast = fast.next;//***********
                //}
            }
        }
        return Head.next;
    }
}

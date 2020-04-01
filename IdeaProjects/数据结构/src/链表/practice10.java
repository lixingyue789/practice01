package 链表;

/**
 * Author:lxy1999
 * Created:2020/3/4
 */
public class practice10 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=slow){
            if(fast==null||fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}

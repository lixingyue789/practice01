package 链表;

/**
 * Author:lxy1999
 * Created:2020/2/29
 */
public class practice2 {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = result;
            result = cur;
            cur = next;
        }
        return result;
    }
}

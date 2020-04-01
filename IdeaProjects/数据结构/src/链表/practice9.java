package 链表;

/**
 * Author:lxy1999
 * Created:2020/3/2
 * 超时
 */
public class practice9 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode result = null;
        if(headA==null||headB==null){
            result = new ListNode(0);
        }
        ListNode n1 = headA;
        ListNode n2 = headB;
        while(n1!=null){
            while(n2!=null&&n1.val!=n2.val){
                n2=n2.next;
            }
            if(n2==null){
                n1=n1.next;
            }else{
                result = new ListNode(n2.val);
            }
        }
        return result;
    }
}


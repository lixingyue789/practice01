package 链表;

/**
 * Author:lxy1999
 * Created:2020/3/2
 */
public class practice8 {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        if(A==null){
            return false;
        }
        ListNode result = null;
        ListNode cur = A;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = result;
            result = cur;
            cur = next;
        }
        ListNode n1 = A;
        ListNode n2 = result;
        while(n1!=null && n2!=null){
            if(n1.val!=n2.val){
                return false;
            }else{
                n1 = n1.next;
                n2 = n2.next;
            }
        }
        return true;
    }
}

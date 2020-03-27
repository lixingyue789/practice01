package 链表;

/**
 * Author:lxy1999
 * Created:2020/2/29
 */
public class practice3 {
    public ListNode middle(ListNode head,int len){
        int n = len/2;
        ListNode cur = head;
        for(int i = 0;i<n;i++){
            cur = cur.next;
        }
        return cur;
    }
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int index = 0;
        while(cur!=null){
            index++;
            cur = cur.next;
        }
        ListNode result = middle(head,index);
        return result;
    }
}

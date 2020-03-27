package 链表;

/**
 * Author:lxy1999
 * Created:2020/2/28
 */
public class practice1 {
    public void display(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val == val){
            head = head.next;
        }
        if(head==null){
            return head;
        }else {
            ListNode cur = head;
            while(cur.next!=null){
                if(cur.next.val == val){
                    cur.next = cur.next.next;
                }else{
                    cur = cur.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        practice1 p = new practice1();
        p.removeElements(n1, 6);
        p.display(n1);
    }
}



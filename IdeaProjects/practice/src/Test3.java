/**
 * Author:lxy1999
 * Created:2019/8/15
 */
class Node {
    public int val;
    public Node next = null;

    public Node(int val) {
        this.val = val;

    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';

    }
}
public class Test3 {

    public Node reverse(Node head) {
        Node result = null;
        Node cur = head;
       while (cur != null){
            Node next = cur.next;
            cur.next=result;
            result = cur;
            cur= next;
       }
        return result;
    }

    public static Node Orderly(Node head1,Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        Node result = null;
        Node last = null;
       while(cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                if(result==null){
                    result = cur1;
                }else{
                    last.next = cur1;
                }
                last = cur1;
                cur1 = cur1.next;
            }else {
                if(result==null){
                    result = cur2;
                }else{
                    last.next = cur2;
                }
                last = cur2;
                cur2 = cur2.next;
            }
        }
        if(cur1!=null){
           last.next = cur1;
        }

        if(cur2!=null){
           last.next = cur2;
        }
        return result;
    }

    public static Node partition(Node head,int x){
        Node cur = head;
        Node small = null;
        Node smallLast = null;
        Node big = null;
        Node bigLast = null;
        for(;cur!=null;cur = cur.next){
            if(cur.val<x){
                if(small == null){
                    small = cur;
                }else {
                    smallLast.next = cur;
                }
                smallLast = cur;
            }else {
                if(big == null){
                    big = cur;
                }else {
                    bigLast.next = cur;
                }
                bigLast = cur;
            }
        }
        if(smallLast == null){
            return big;
        }else{
            smallLast.next = big;
        }
        if(bigLast == null){
            return small;
        }else{
            bigLast.next = null;
        }
        return small;
    }


    public static void main(String[] args) {

        Node node1 = new Node(2);
        Node node2 = new Node(6);
        Node node3 = new Node(3);
        Node node4 = new Node(8);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        Node result1 = Orderly(node1,node3);
       Node result1 = partition(node1,6);
       Node cur = result1;
       for(;cur!=null;cur = cur.next){
           System.out.println(cur);
       }
    }

}

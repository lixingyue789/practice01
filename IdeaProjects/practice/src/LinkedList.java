/**
 * Author:lxy1999
 * Created:2019/8/11
 */

public class LinkedList {
    static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void display(Node head){
        for(Node cur = head;cur != null; cur = cur.next){
            System.out.print(" " + cur.value);
        }
    }
    public static Node createLinkedList(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    public static Node pushFront(Node head,int value){
        Node newNode = new Node(100);
        newNode.next=head;
        head = newNode;
        return newNode;
    }
    public static void main(String[] args) {
        Node node = createLinkedList();
        display(node);
        node = pushFront(node,100);
    }
}

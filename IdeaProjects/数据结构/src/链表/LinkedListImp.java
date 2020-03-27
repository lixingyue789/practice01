package 链表;

public class LinkedListImp implements ILinkedList {

    private Node head;//保存链表中第一个结点的引用

    public LinkedListImp(){
        this.head = null;
    }

    @Override
    public void addFirst(int item) {
        Node node = new Node(item);
        node.next = this.head;
        this.head = node;
    }

    public Node getLast(){
        Node cur = this.head;
        while (cur.next!=null){
            cur = cur.next;
        }
        return cur;
    }
    @Override
    public void addLast(int item) {
        Node node = new Node(item);
        if(this.head==null){
            this.head = node;
        }else {
            Node last = getLast();
            last.next = node;
        }
        node.next = null;
    }

    @Override
    public void addIndex(int item, int index) {
        Node cur = this.head;
        for(int i = 0;i<index-1;i++){
            cur = cur.next;
        }
        Node node = new Node(item);
        node.next = cur.next;
        cur.next = node;
    }

    @Override
    public void removeFirst() {
        if(this.head == null){
            throw new Error();
        }
        this.head = this.head.next;
    }

    public Node getLastLast(){
        Node cur = this.head;
        while (cur.next.next!=null){
            cur = cur.next;
        }
        return cur;
    }

    @Override
    public void removeLast() {
        if(this.head==null){
            throw new Error();
        }
        if(this.head.next==null){
            this.head = null;
        }else {
            Node cur = getLastLast();
            cur.next = null;
        }
    }

    @Override
    public void removeIndex(int index) {
        Node cur = this.head;
        for(int i = 0;i<index-1;i++){
            cur = cur.next;
        }
        if(cur.next.next!=null){
            cur.next = cur.next.next;
        }
    }

    @Override
    public int getLength() {
        int index = 0;
        Node cur = this.head;
        while (cur!=null){
            index++;
            cur = cur.next;
        }
        return index;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur.next!=null){
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.print(cur.value);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.next = n2;n2.next = n3;n3.next = n4;
        n4.next = n5;n5.next = n6;
        LinkedListImp IMP = new LinkedListImp();
        IMP.head = n1;
        IMP.display();
        System.out.println();
        System.out.println(IMP.getLength());
        IMP.addFirst(0);
        IMP.display();
        System.out.println();
        IMP.addLast(7);
        IMP.display();
        System.out.println();
        IMP.addIndex(8,2);
        IMP.display();
        System.out.println();
        IMP.removeIndex(2);
        IMP.display();
        System.out.println();
        IMP.removeFirst();
        IMP.display();
        System.out.println();
        IMP.removeLast();
        IMP.display();
        System.out.println();
    }
}

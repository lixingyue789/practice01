/**
 * Author:lxy1999
 * Created:2019/3/31
 * 链表的增删
 */
public class MyLinkedList {
    //链表中的一个结点
    public static class Node{
        public int value;//保存的是有效数据
        public Node next;//下一个结点的线索 （引用）
        public Node(int v){
            this.value = v;
            this.next = null;
        }
    }
    public Node head;//保存链表中第一个结点的引用
    public MyLinkedList(){
        this.head = null;
    }

    //在前面增加一个
    public void pushFront(int item){
        Node node = new Node(item);
        node.next = this.head;
        this.head = node;
    }

    //删除第一个结点
    public void popFront(){
        if(this.head == null){
            throw new Error();
        }
        this.head = this.head.next;
    }

    //在后面增加一个
    private Node getLast(){
        Node cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }
        return cur;
    }
    public void pushBack(int item){
        Node node = new Node(item);
        if(this.head == null){
            this.head = node;
        }else {
            Node last = getLast();
            last.next = node;
        }
    }

    //删除最后一个
    private Node getLastLast(){
        Node cur = this.head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        return cur;
    }
    public void popBack(){
        if(this.head == null){
            throw new Error();
        }
        if(this.head.next == null){
            this.head = null;
        }else{
            Node lastLast = getLastLast();
            lastLast.next = null;
        }
    }
}

public class Main {
    private static Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }
        // 1. 分别遍历两个链表，取值比较小的结点，尾插到新链表中
        // 2. 把剩余链表接到新链表的后边

        Node c1 = head1;
        Node c2 = head2;
        Node rhead = null;
        Node rlast = null;

        while (c1 != null && c2 != null) {
            // 取值比较小的结点
            if (c1.val <= c2.val) {
                // 把 c1 尾插到新链表
                // 如果链表中没有结点，更新链表的第一个结点
                // 否则，找到链表的最后一个结点，让它的 next = 要插入的结点
                if (rhead == null) {
                    rhead = c1;
                } else {
                    rlast.next = c1;
                }

                // 再更新下链表的最后一个结点
                rlast = c1;

                // 让 c1 指向原来的下一个结点
                c1 = c1.next;
            } else {
                // 把 c2 尾插到新链表
                if (rhead == null) {
                    rhead = c2;
                } else {
                    rlast.next = c2;
                }

                rlast = c2;

                c2 = c2.next;
            }
        }

        if (c1 != null) {
            rlast.next = c1;
        } else {
            rlast.next = c2;
        }

        return rhead;
    }

    private static Node createOrderList1() {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(9);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5; n5.next = n6;

        return n1;
    }

    private static Node createOrderList2() {
        Node n1 = new Node(0);
        Node n2 = new Node(1);
        Node n3 = new Node(2);
        n1.next = n2; n2.next = n3;

        return n1;
    }

    public static void main(String[] args) {
        Node head1 = createOrderList1();
        Node head2 = createOrderList2();

        Node rhead = merge(head1, head2);

        for (Node c = rhead; c != null; c = c.next) {
            System.out.println(c);
            System.out.println(c.toString());
        }
    }
}

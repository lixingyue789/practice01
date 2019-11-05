class Parent2 {
    {
        System.out.println("A");
    }
    Parent2() {
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
}
public class InstanceOrder extends Parent2 {
    InstanceOrder() {
        super();
        System.out.println(1);
    }
    InstanceOrder(int v) {
        this();
        System.out.println(2);
    }
    private int initA() {
        System.out.println(3);
        return 0;
    }
    private int initB() {
        System.out.println(4);
        return 0;
    }
    int a = initA();
    {
System.out.println(5);
    }
    int b = initB();
    {
 System.out.println(6);
    }
    public static void main(String[] args) {
new InstanceOrder(1000);
    }
}

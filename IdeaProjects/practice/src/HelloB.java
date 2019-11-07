public class HelloB extends HelloA {
   public HelloB() {
       System.out.println("Hello B! 构造方法");
   }

   {
       System.out.println("i'm B class.非静态代码块");
   }

   static {
       System.out.println("static B 静态代码块");
   }

   public static void main(String[] args) {
       System.out.println("---start---");
       new HelloB();
       new HelloB();
       System.out.println("---end---");
   }
}

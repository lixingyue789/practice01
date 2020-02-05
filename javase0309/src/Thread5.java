/**
 * Author:lxy1999
 * Created:2019/3/9
 */
public class Thread5 {
    public static void main(String[] args) {
        MyThread3 myThread1 = new MyThread3();
        MyThread3 myThread2 = new MyThread3();
        new Thread(myThread1).start();
        new Thread(myThread2).start();
    }
}

class MyThread3 implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {
        while (this.ticket > 0){
            System.out.println(Thread.currentThread().getName()+"  "+"剩余"+this.ticket--+"张票");
        }
    }
}

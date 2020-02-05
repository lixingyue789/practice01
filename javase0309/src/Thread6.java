import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Author:lxy1999
 * Created:2019/3/9
 * Callable 实现多线程
 */
public class Thread6 {
    public static void main(String[] args) {
     MyThread4 myThread1 = new MyThread4();
        FutureTask <String> task = new FutureTask<>(myThread1);
        new Thread(task).start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyThread4 implements Callable<String>{//核心业务
    private int ticket = 10;
    @Override
    public String call() throws Exception {
        while (this.ticket > 0){
            System.out.println(Thread.currentThread().getName()+"  "+"剩余"+this.ticket--+"张票");
        }
        return "票买完了，下次再来。";
    }
}

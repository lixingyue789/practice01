/**
 * Author:lxy1999
 * Created:2020/2/5
 */
public class TestThread extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("线程+"+i);
        }
    }
}

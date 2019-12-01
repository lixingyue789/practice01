import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/3/31
 * 线性表
 */
public class MyTest {
    private static int[] createArray(int size){
        Random random = new Random(20190330);
        int[] array = new  int[size];
        for (int i = 0;i < size;i++){
            array[i] = random.nextInt(size);
        }
        return array;
    }
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList(10);
        arrayList.pushBack(5);
        arrayList.pushBack(3);
        arrayList.pushBack(2);
    }
}

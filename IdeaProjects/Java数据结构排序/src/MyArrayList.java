
/**
 * Author:lxy1999
 * Created:2019/9/4
 */
public class MyArrayList<E> {

    private E[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        //泛型无法定义泛型数组
        //压制警告
        array = (E[])new Object[100];
        size = 0;
    }

    public void add(E e){
        array[size++] = e;
    }

    public void remove(){
        //size--;会引起内存泄漏，这种写法没有被GC判定为死掉
        array[--size] = null;
    }
}

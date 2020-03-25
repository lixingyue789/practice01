package 顺序表;

/**
 * Author:lxy1999
 * Created:2019/3/31
 * 线性表：数据在逻辑上有前后关系
 * 顺序表：存储位置上和逻辑关系是吻合的
 * 链表：逻辑上有线性关系，物理上储存不保证连续
 * 结点类： 值  ，  下一个结点的引用
 * 链表类： 第一个结点的引用
 * 线性表包括顺序表和链表
 * 顺序表：尾插尾删 o(1)
 * 头插头删 o(n)
 * 中间插入中间删除 o(n)
 */
public interface IArrayList {
    //把item插入到线性表的前面
    //item是要插入的数据
    void pushFront(int item);

    //把item插入到线性表的最后
    //item是要插入的数据
    void pushBack(int item);

    //把item插入到index下标位置处，index后的数据后移
    //@param item @param index
    void  add(int item, int index);

    //删除前面的数据
    void popFront();

    //删除后面的数据
    void popBack();

    //删除index处的数据，index后的数据前移
    //@param index
    void remove(int index) throws Exception;

    //删除第一次出现关键字key
    int removeFirst(int key);

    //查找关键字key，返回key的下标，没有返回null
    int search(int key);

    //查找关键字key是否在顺序表中
    boolean contains(int key);

    //打印顺序表的长度
    int size();

    //打印顺序表
    void display();

}

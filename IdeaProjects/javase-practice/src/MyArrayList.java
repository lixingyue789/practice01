import java.util.Iterator;

/**
 * Author:lxy1999
 * Created:2019/3/31
 * 线性表的增，删
 */
public class MyArrayList implements IArrayList {


    private int[] array;//保存数据的空间
    private int size;//保存有效数据的个数

    public MyArrayList(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }


    @Override
    public void pushFront(int item) {
        ensureCapacity();
        for (int i = this.size; i >= 1; i--) {//空间下标
            this.array[i] = this.array[i - 1];
        }//所有的数据后移一位
        /*
        for(int i = this.size - 1;i >= 0;i--){//数据下标
            this.array[i + 1] = this.array[i];
        }
        */
        this.array[0] = item;
        this.size++;
    }

    @Override
    public void pushBack(int item) {
        ensureCapacity();
        this.array[this.size] = item;
        this.size++;
    }

    @Override
    public void add(int item, int index) {
        if (index < 0 || index > this.size) {
            throw new Error();
        }
        ensureCapacity();
        /*
        for(int i = this.size;i > index;i--){//空间下标
            this.array[i] = this.array[i - 1];
        }*/
        /*
        for(int i = 0;i < this.size - index ;i++){//i代表循环的次数
             this.array[this.size - i] = this.array[this.size - i - 1];
        }
        */
        for (int i = this.size - 1; i >= index; i--) {//数据下标
            this.array[i + 1] = this.array[i];
        }
        this.array[index] = item;
        this.size++;
    }

    @Override
    public void popFront() {
        if (this.size == 0) {
            throw new Error();
        }
        for (int i = 1; i <= this.size - 1; i++) {//数据下标
            this.array[i - 1] = this.array[i];
        }
        /*
        for(int j = 0;j <= this.size - 2;j++){
            this.array[j] = this.array[j + 1];
        }*/
        this.array[--this.size] = 0;
    }

    @Override
    public void popBack() {
        if (this.size == 0) {
            throw new Error();
        }
        this.array[--this.size] = 0;
    }

    @Override
    public void remove(int index) {//index为下标
        if (index < 0 || index > this.size) {
            throw new Error();
        }
        if (this.size == 0) {
            throw new Error();
        }
        for (int i = index; i <= this.size - 2; i++) {
            this.array[i] = this.array[i + 1];
        }
        /*
        for (int i = index + 1; i <= this.size - 1; i++) {//数据下标
            this.array[i - 1] = this.array[i];
        }*/
        this.array[--this.size] = 0;
    }
    //保证数组容量够用
    //先判断容量是否够用
    private void ensureCapacity() {
        if (this.size < this.array.length) {
            return;
        }
        //1.找新房子，找原来的2倍大小
        int capacity = this.array.length * 2;
        int[] newArray = new int[capacity];
        //2.搬家
        for (int i = 0; i < this.size;i++) {
          newArray[i] = this.array[i];
        }
        //3.去学校登记下新房子的位置，推掉老房子
        this.array = newArray;
    }
    /*
    public void display(){
        for(int i = 0;i < this.array.length;i++){
            System.out.println(i);
        }
    }*/
}

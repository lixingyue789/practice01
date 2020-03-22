package 顺序表;

import 链表.ILinkedList;

/**
 * Author:lxy1999
 * Created:2020/2/27
 */
public class ArrayListImp implements IArrayList {

    private int[] array;//保存数据的空间
    private int size;//保存有效数据个数

    public ArrayListImp(int capacity){
        array = new int[capacity];
        this.size = 0;
    }
    //确保数组容量够用，不够则扩大两倍
    private void ensureCapacity(){
        if(this.size < this.array.length){
            return;
        }
        int newCapacity = this.array.length*2;
        int[] newArray = new int[newCapacity];
        for(int i = 0;i<this.size;i++){
            newArray[i++] = this.array[i++];
        }
        this.array = newArray;
    }

    @Override
    public void pushFront(int item) {
        ensureCapacity();
        for(int i = this.size;i>0;i--){
            array[i] = array[i-1];
        }
        this.array[0] = item;
        this.size++;
    }

    @Override
    public void pushBack(int item) {
        ensureCapacity();
        array[this.size] = item;
        this.size++;
    }

    @Override
    public void add(int item, int index) {
        ensureCapacity();
        for(int i = this.size;i>index;i--){
            array[i] = array[i-1];
        }
        this.array[index] = item;
        this.size++;
    }

    @Override
    public void popFront() {
        if(this.size==0){
            try {
                throw new IException("没有可删除的数");
            } catch (IException e) {
                e.printStackTrace();
            }
        }
        for(int i = 1;i<this.size;i++){
            array[i-1] = array[i];
        }
        this.array[--this.size] = 0;
    }

    @Override
    public void popBack() {
        if(this.size==0){
            try {
                throw new IException("没有可删除的数");
            } catch (IException e) {
                e.printStackTrace();
            }
        }
        this.array[--this.size] = 0;
    }

    @Override
    public void remove(int index) {
        if(index<0 && index>size){
            try {
                throw new IException("没有可删除的数");
            } catch (IException e) {
                e.printStackTrace();
            }
        }
        for(int i = index+1;i<this.size;i++){
            array[i-1] = array[i];
        }
        this.array[--this.size] = 0;
    }

    @Override
    public int removeFirst(int key) {
        if(contains(key)){
            int index = 0;
            for(int i = 0;i<size;i++){
                if(array[i] == key){
                    index = i;
                    break;
                }
            }
            remove(index);
            return index;
        }else {
            return 0;
        }
    }

    @Override
    public int search(int key) {
        for(int i = 0;i<size;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(int key) {
        for(int i = 0;i<size;i++){
            if(array[i] == key){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void display() {
        for(int i = 0;i<this.array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print(array[array.length-1]);
    }

    public static void main(String[] args) {
        ArrayListImp IMP = new ArrayListImp(10);
        IMP.pushFront(8);
        IMP.pushBack(8);
        IMP.add(1,1);
//        IMP.popFront();
//        IMP.popBack();
        IMP.remove(0);
        IMP.display();
        System.out.println();
        System.out.println(IMP.contains(8));
        IMP.removeFirst(8);
        IMP.display();
        System.out.println();
        System.out.println(IMP.search(8));
        System.out.println(IMP.contains(1));
        System.out.println(IMP.size());
    }
}

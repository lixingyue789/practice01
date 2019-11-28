package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/8
 * 线性表头插，扩容
 */
public class MyArrayList {
    /**
     * 储存数据的空间
     */
    private int[] array;
    /**
     * 已有数据的个数
     */
    private int size;

    public MyArrayList(int[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public void pushFront(int item){
        //扩容
        if(this.size == this.array.length) {
            int capacity = this.array.length * 2;
            int[] newArray = new int[capacity];
            //搬家
            for (int j = 0; j < this.size; j++) {
                newArray[j] = this.array[j];
            }
            //变更信息
            this.array = newArray;
        }
            //头插
        for (int i = this.size; i > 0; i--) {
            this.array[i] = this.array[i - 1];
        }

        /*
        for(int j = 0;j < this.size;j++){
            this.array[this.size - j] = this.array[this.size - j - 1];
        }*/
        this.array[0] = item;
        this.size++;
    }
    public void display(){
        for(int i = 0;i < this.array.length;i++){
            System.out.format("%d-->",array[i]);
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] array = new int[6];
        MyArrayList list = new MyArrayList(array,6);
        list.pushFront(9);
        list.pushFront(2);
        list.pushFront(5);
        list.pushFront(4);
        list.display();
    }

}




package com.yue;

import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2019/8/17
 */
public class ArrayList implements List {
    int[] array = null;
    int size;

    public void ensureCapacity() {
        if (array != null && size < array.length) {
            return;
        }
        int capacity;
        if (array == null) {
            capacity = 10;
        } else {
            capacity = 2 * array.length;
        }
        if (array == null) {
            array = new int[capacity];
        }
        array = Arrays.copyOf(array, capacity);
    }

//    public void ensureCapacity() {
//        if(array!=null&&size<array.length){
//            return;
//        }
//        int oldCapacity = array.length;
//        int newCapacity = 2 * oldCapacity;
//        int[] newArray = new int[newCapacity];
//        for(int i = 0;i<size;i++){
//            newArray[i]=array[i];
//        }
//        array=newArray;
//    }

    @Override
    public boolean add(int element) {
        return add(size, element);
    }

    @Override
    public boolean add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("下标不合法");
            return false;
        }
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
        return true;
    }


    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return array[index];
    }

    @Override
    public int set(int index, int val) {
        if (index < 0 || index >= size) {
            return -1;
        }
        int oldValue = array[index];
        array[index] = val;
        return oldValue;
    }

    @Override
    public int remove(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        int value = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(array,size));
    }

}



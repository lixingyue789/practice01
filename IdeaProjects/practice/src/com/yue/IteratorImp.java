package com.yue;

/**
 * Author:lxy1999
 * Created:2019/8/17
 */
public class IteratorImp implements Iterator {

    private ArrayList arrayList;
    private int index;

    @Override
    public boolean hasNext() {
        return index<arrayList.size;
    }

    @Override
    public int next() {
        int value = arrayList.array[index];
        index++;
        return value;
    }

    @Override
    public int remove() {
        System.arraycopy(arrayList.array,index+1,arrayList.array,index,arrayList.size-index);
        int value = arrayList.array[index];
        return value;
    }
}

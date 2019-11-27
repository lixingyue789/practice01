package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/27
 */
public class Test7 {
    private static void insertSort(int[] array){
        //有序[0,i)
        //无序[i,length)
        for(int i = 0;i < array.length;i++){
            int j = 0;
            for(j = i - 1;j > 0 && array[i] > array[j];j--){
            }
            //空间下标
            int pos = j + 1;
            int key = array[j];
            for(int k = i;k > pos ;k--){
                array[k] = array[k - 1];
            }
            array[pos] = key;
        }
    }
    private static void insertSort1(int[] array){//边比较边排序
        for(int i = 0;i < array.length;i++){
            int key = array[i];
            int j = i - 1;
            for(;j >= 0;j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }
    private static void createHeap(int[] array){//o(n)
        for(int i = (array.length - 2)/2;i >= 0;i--){
            heapify(array,array.length,i);
        }
    }
    private static void heapify(int[] array,int size,int index){//o(n * log(n))
        while (2 * index + 1 < size){
            int max = 2 * index + 1;
            if(2 * index + 2<size && array[2 * index + 2] > array[2 * index + 1]){
                max = max + 1;
            }
            if(array[index] > array[max]){
                break;
            }else {
                int t = array[index];
                array[index] = array[max];
                array[max] = t;
            }
            index = max;
        }
    }
    private static void swap(int[] array,int x,int y){

    }
    private static void heapSort(int[] array){
        int i = 0;
        for(;i < array.length;i++){
            swap(array,0,array.length -i - 1);
        }
        heapify(array,array.length - i - 1,0);
    }
    //挖坑
    private static int parition2(int[] array,int left,int right){
        int begin = left;
        int end = right;
        int pivot = array[right];
        while(begin < end){
            while (begin < end && array[begin] <= pivot) {
                begin++;
            }
            array[end] = array[begin];
            while (begin < end && array[end] >= pivot){
                end--;
            }
            array[begin] = array[end];
        }
        array[begin] = pivot;//begin = end
        return begin;
    }
    private static void merge(int[] array,int low,int mid,int high){
        //[low,mid),[mid,high)
        int i = 0;
        int[] extra = new int[high - low];
        while (low < mid && mid <high){
            if(array[low] <= array[mid]){
                extra[i++] = array[low];
                low++;
            }else{
                extra[i++] = array[mid];
                mid++;
            }
        }
        while (low < mid){
            extra[i++] = array[low++];
        }
        while (mid < high){
            extra[i++] = array[high++];
        }
        for(int k = low;k < high;k++){
            array[k] = extra[k - low];
        }
    }
}

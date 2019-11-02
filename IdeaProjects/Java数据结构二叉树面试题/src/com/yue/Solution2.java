package com.yue;

import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/8/27
 */
public class Solution2 {
    //创建一个数组，元素随机
    public static int[] createArray(){
        Random random = new Random(135531);
        int[] array = new int[10];
        for(int i = 0;i<array.length;i++){
            int a = random.nextInt(100);
            array[i] = a;
        }
        return array;
    }
    //打印数组
    public static void showArray(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    //交换
    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    //堆化，即向下调整(时间复杂度：log(n))
    //首先判断下标为index的位置是否为叶子结点，如果不是，则需要判断index结点的父结点是否有右孩子
    //如果有右孩子，则取左右孩子结点中最大的与父节点进行比较，如果孩子结点大，则与其父节点进行交换，继续向下调整
    public static void heapifyMax(int[] array,int size,int index) {
        while (true) {
            int left = 2 * index + 1;
            if (left >= size) {
                return;
            }
            int max = left;
            int right = left + 1;
            if (right < size && array[right] > array[max]) {
                max = right;
            }
            if (array[index] >= array[max]) {
                return;
            }
            swap(array, index, max);
            index = max;
        }
    }
    public static void createMaxHeap(int[] array,int size){
        //建大堆:时间复杂度：n*log(n)
        //从最后一个结点的父节点往前遍历，依次做向下调整
        for(int i = (size-2)/2;i>=0;i--){
            heapifyMax(array,size,i);
        }
    }
    //向上调整
    //首先判断index位置是否小于size，然后让index结点与它的父节点进行比较，如果父节点较小则两者交换，继续调整
    public static void adjustUp(int[] array,int index){
        while (index>0){
            int parent = (index-1)/2;
            if(array[parent]>=array[index]){
                return;
            }
            swap(array,parent,index);
            index = parent;
        }
    }
    public static void heapifyMin(int[] array,int size,int index){
        while (true) {
            int left = 2 * index + 1;
            if (left >= size) {
                return;
            }
            int min = left;
            if (left+1< size && array[left+1] < array[min]) {
                min = left+1;
            }
            if (array[index] <= array[min]) {
                return;
            }
            swap(array, index, min);
            index = min;
        }
    }
    public static void createMinHeap(int[] array,int size){
        //建小堆
        //从最后一个结点的父节点往前遍历，依次做向下调整
        for(int i = (size-2)/2;i>=0;i--){
            heapifyMin(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] a = createArray();
        showArray(a);
        createMaxHeap(a,a.length);
        showArray(a);
        System.out.println("================================");
        createMinHeap(a,a.length);
        showArray(a);
    }
}

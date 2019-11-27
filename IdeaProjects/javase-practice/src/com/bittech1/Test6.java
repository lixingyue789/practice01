package com.bittech1;

/**
 * Author:lxy1999
 * Created:2019/4/25
 */
public class Test6 {
    private static void heapify(int[] tree,int index){
        //首先判断是不是叶子
        int left = 2 * index + 1;
        if(left >= tree.length){
            return;
        }
        //index结点是否有右结点，如果有，则需比较左孩子与右孩子的大小，找出最大的
        int right = 2 * index + 2;
        int max = left;
        if(right < tree.length && tree[left] < tree[right]){
            max = right;
        }
        //判断根节点是否大于孩子结点中最大的
        if(tree[index] > tree[max]){
            return;
        }
        //交换根结点与其最大的孩子结点
        int t = 0;
        t = tree[index];
        tree[index] = tree[max];
        tree[max] = t;
        //继续向下调整
        heapify(tree,max);

    }
    //向上调整
    private void adjustUp(int[] array,int size,int index){
        int parent = (index - 1)/2;
        if(index > 0 && array[parent] < array[index]){
            int t = 0;
            t = array[parent];
            array[parent] = array[index];
            array[index] = t;
        }
        adjustUp(array,size,parent);
    }
    private static void selectSort(int[] array){
        //无序 [0,arr.length - i)
        //有序[arr.length - i,arr.length)
        for(int i = 0;i < array.length;i++){
            int max = 0;
            for(int j = 1;j < array.length - i;j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            int t = array[max];
            array[max] = array[array.length -i -1];
            array[array.length - i - 1] = t;
        }
    }
    private static void bubbleSort(int[] array){
        for(int i = 0;i < array.length - 1;i++){
            for (int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
}

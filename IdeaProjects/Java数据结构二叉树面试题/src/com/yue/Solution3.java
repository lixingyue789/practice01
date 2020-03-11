package com.yue;

import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/8/28
 */
public class Solution3 {
    //创建一个随机数组
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
    //插入排序：时间复杂度：o(n^2) 空间复杂度：o(1) 是稳定的
    //给定一组数，假设前面的部分是有序的，后面的部分是无序的，从无序的部分找一个元素插入到有序的部分，直到全部有序
    //起初有序部分只有第一个数，后面都是无序部分
    //假如有n个数，默认第一个数有序，则外层循环可以循环n-1次
    public static void insertSort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            //有序：[0,i],无序：[i+1,array.length)
            int key = array[i+1];//待插入元素
            //从后往前遍历有序部分，找到合适的位置，后面的元素往后挪动一位，最后插入元素
            int j = 0;
            for(j = i;j>=0;j--){
                if(key>=array[j]){
                    break;
                }
                array[j+1] = array[j];//即j下标以后的元素均往后移动一位
            }
            array[j+1] = key;
        }
    }
    public static void insertSort1(int[] array){
        for(int i = 1;i<array.length;i++){
            //有序：[0,i),无序：[i,array.length)
            int key = array[i];
            int j = 0;
            for(j = i-1;j>=0;j--){
                if(key>=array[j]){
                    break;
                }
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }

    //希尔排序：时间复杂度为O(n^1.3-n^1.4) 空间复杂度为：O(1) 不稳定
    //将现有的元素按照一定的公式进行分组，将各个组内元素进行插入排序(预排序)
    //最后当分组为1时，插入排序，终止
    //公式为：[(array.length)/3]+1
    public static void insertSortWithGap(int[] array,int gap){
        //当gap为1时，就是插入排序
        //假设有十个数进行希尔排序，前四个元素可以看成有序的，所以只需要循环六次即可，即array.length-gap次
        for(int i = 0;i<array.length-gap;i++){
            int key = array[i+gap];
            int j = 0;
            for(j=i;j>=0;j = j-gap){
                if(key>=array[j]){
                    break;
                }
                array[j+gap] = array[j];
            }
            array[j+gap] = key;
        }
    }
    public static void shellSort(int[] array){
        int gap = array.length;
        while (true){
            gap = gap/3+1;
            insertSortWithGap(array,gap);
            if(gap==1){
                return;
            }
        }
    }
    //直接选择排序:时间复杂度为o(n^2),空间复杂度为O(1),不稳定
    //给定一组无序的数，假设前面的数是无序的，后面的数是有序的，在无序部分找到最大的数与无序部分的最后一个元素进行交换，直到有序
    //起初有序部分为0，无序部分为所有元素
    //假设有n个数，选择排序直到后n-1个元素有序，就默认整个数组有序，即循环n-1次
    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static void selectSort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            //无序：[0,array.length-i) 有序：[array.length-i,array.length)
            int max = 0;
            for(int j = 1;j<array.length-i;j++){
                if(array[max]<array[j]){
                    max = j;
                }
            }
            swap(array,max,array.length-i-1);
        }
    }
    //堆排序
    //给定一组数据，将这组数据建成大堆，将最大的元素与最后一个元素交换后，删除最后一个元素。
    //继续向下调整，找到第二大，继续交换，一次循环，直到排序完成
    //开始时无序部分是[0,array.length-i)，建堆后，当最大元素与最后元素交换后，无序部分的元素为：[0,array.length-i-1)
    public static void heapify(int[] array,int size,int index){
        //向下调整
        //首先应该考虑index是否为叶子结点，如果不是，则需要考虑index结点是否有右孩子
        // 如果有右孩子，则将左右孩子中最大的结点与index节点比较，如果孩子结点较大，则进行交换，然后继续向下调整
        while (true) {
            int left = 2 * index + 1;
            if (left >= size) {
                break;
            }
            int max = left;
            int right = left + 1;
            if (right < size && array[max] < array[right]) {
                max = right;
            }
            if (array[max] <= array[index]) {
                return;
            }
            swap(array, max, index);//java中值传递
            index = max;
        }
    }
    public static void createHeap(int[] array){
        //建大堆
        //从最后一个结点的父节点往前遍历，依次做向下调整
        for(int i = (array.length-2)/2;i>=0;i--){
            heapify(array,array.length,i);
        }
    }
    public static void heapSort(int[] array){
        createHeap(array);
        //因为已经建大堆，即最大元素已知，假设有n个元素，只需要循环n-1次
        for(int i = 0;i<array.length-1;i++){
            swap(array,0,array.length-i-1);
            heapify(array,array.length-i-1,0);
        }
    }

    public static void main(String[] args) {
        int[] a = createArray();
        showArray(a);
        insertSort(a);
        showArray(a);
        insertSort1(a);
        showArray(a);
        System.out.println("==========================");
        shellSort(a);
        showArray(a);
        System.out.println("==========================");
        selectSort(a);
        showArray(a);
        System.out.println("==========================");
        heapSort(a);
        showArray(a);
    }
}

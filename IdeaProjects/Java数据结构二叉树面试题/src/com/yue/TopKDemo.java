package com.yue;

import java.util.Arrays;
import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/8/28
 */
public class TopKDemo {
    //在多个元素中找前k名，建小堆
    public static int[] TopK(int[] array,int k){
        int[] heap = new int[k];
        for(int i = 0;i<k;i++){
            heap[i] = array[i];
        }
        Solution2.createMinHeap(heap,heap.length);
        for(int i = k;i<array.length;i++){
            if(array[i]>heap[0]){
                heap[0] = array[i];
                Solution2.heapifyMin(heap,k,0);
            }
        }
        return heap;
    }

    public static void main(String[] args) {
        Random random = new Random(114158);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int[] topK = TopK(array, 5);
        System.out.println(Arrays.toString(topK));
        System.out.println("====================================");
        Arrays.sort(array);
        System.out.println(Arrays.toString(
                Arrays.copyOfRange(array, array.length-10, array.length)
        ));
    }
}

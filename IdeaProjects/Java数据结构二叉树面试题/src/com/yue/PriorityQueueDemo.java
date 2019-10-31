package com.yue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/8/28
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Random random = new Random(20190828);
        for(int i = 0;i<10;i++){
            int a = random.nextInt(100);
            queue1.add(a);
            queue2.add(a);
        }
        while (!queue1.isEmpty()){
            int a = queue1.poll();
            System.out.print(a+" ");
        }
        System.out.println();
        while (!queue2.isEmpty()) {
            int a = queue2.poll();
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

package com.yue;

/**
 * Author:lxy1999
 * Created:2019/9/11
 */
//public class HashBucket {
//    public int hashFunction(int key,int capacity){
//        return key%capacity;
//    }
//    public int remove(int key){
//        int index = hashFunction(key,array.length);
//        Node head = array[index];
//        Node cur = head;
//        Node pre = null;
//        while (cur!=null){
//            if(key == cur.key){
//                int oldValue = cur.value;
//                if(cur == head){
//                    array[index] = head.next;
//                }else {
//                    pre.next = cur.next;
//                }
//                size--;
//                return oldValue;
//            }
//            pre = cur;
//            cur = cur.next;
//        }
//        return -1;
//    }
//}

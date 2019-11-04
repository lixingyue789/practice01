package com.yue;

/**
 * Author:lxy1999
 * Created:2019/9/15
 */
//实现HashMap,哈希的开散列（数组+链表）
public class HashBucket {
    private static class Node{
        private int key;
        private int value;
        private Node next;
    }
    private Node[] array;
    private int size;

    public HashBucket(){
        array = new Node[8];
        size = 0;
    }

    private int hashFunction(int index,int capacity){
        return index%capacity;
    }

    /**
     * 通过链表中的key找到链表中的value
     * @param key
     * @return
     */
    public int get(int key) {
        int index = hashFunction(key,array.length);
        Node head = array[index];
        Node cur = head;
        while (cur!=null){
            if(key==cur.key){
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }

    /**
     * 扩容
     */
    private void resize() {
        //申请新的数组
        Node[] newArray = new Node[2*array.length];
        //size不断在增加,index会变大
        //搬移
        for(int i = 0;i<array.length;i++){
            Node head = array[i];
            Node cur = head;
            while (cur!=null){
                int index = hashFunction(cur.key,newArray.length);
                Node node = new Node();
                node.key = cur.key;
                node.value = cur.value;
                node.next = newArray[index];
                newArray[index] = node;
                cur = cur.next;
            }
        }
        array = newArray;
    }

    /**
     * 将key，value加到map中去
     * @param key
     * @param value
     * @return
     */
    public int put(int key, int value) {
        int index = hashFunction(key,array.length);
        Node head = array[index];
        Node cur = head;
        while (cur!=null){
            if(key==cur.key){
                int oldValue = cur.value;
                cur.value = value;
                return oldValue;
            }
            cur = cur.next;
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        node.next = head;
        array[index] = node;
        size++;
        if((double)size/array.length>0.75){
            resize();
        }
        return -1;
    }

    /**
     * 删除map中的key
     * @param key
     * @return
     */
    public int remove(int key) {
        int index = hashFunction(key,array.length);
        Node head = array[index];
        Node cur = head;
        Node pre = null;
        while (cur != null){
            if(key==cur.key){
                int oldValue = cur.value;
                if(cur == head){
                    array[index] = head.next;
                }else {
                    pre.next = cur.next;
                }
                size--;
                return oldValue;
            }
            pre = cur;
            cur = cur.next;
        }
        return -1;
    }
}

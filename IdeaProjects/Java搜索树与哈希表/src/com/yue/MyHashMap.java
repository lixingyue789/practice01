package com.yue;


/**
 * Author:lxy1999
 * Created:2019/9/15
 */
public class MyHashMap<K,V> {

    private static class Node<M,N>{
        private M key;
        private N value;
        private Node<M,N> next;
    }

    private Node<K, V>[] array;
    private int size;

    public MyHashMap(){
        array = (Node<K, V>[])new Object[16];
        size = 0;
    }

    /**
     * 会调用K类型的equals和hashCode方法
     * @param key
     * @return
     */
    public V get(K key) {
        int hash = key.hashCode();
        int n = array.length;
        hash = ((hash>>16)^hash);
        int index = hash^(n-1);//是hash更均匀

        Node<K,V> head = array[index];
        Node<K,V> cur = head;
        while (cur!=null){
            if(key.equals(cur.key)){
                return cur.value;
            }
            cur = cur.next;
        }
        return null;
    }
}

package bittech;

/**
 * Author:lxy1999
 * Created:2019/8/23
 */
class MyCircularQueue {
    private int[] array = null;
    private int front = 0;//队首元素下标
    private int rear = 0;//队尾元素下标的下一个
    private int size = 0;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(array.length==size){
            return false;
        }
        array[rear] = value;
        rear = (rear+1)%array.length;//rear的下一个下标
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(size==0){
            return false;
        }
        front=(front+1)%array.length;
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(size==0){
            return -1;
        }
        return array[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(size==0){
            return -1;
        }
        int index = (rear-1+array.length)%array.length;//rear的前一个下标
        return array[index];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(size==array.length){
            return true;
        }else{
            return false;
        }
    }
}
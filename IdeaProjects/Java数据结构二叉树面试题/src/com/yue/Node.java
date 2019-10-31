package com.yue;

/**
 * Author:lxy1999
 * Created:2019/8/25
 */
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public String toString(){
        return value+" ";
    }
}

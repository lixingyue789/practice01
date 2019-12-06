package com.yue;

import java.util.*;

/**
 * Author:lxy1999
 * Created:2019/9/5
 */
//有关Map、Set的练习题
class Node{
    int value;
    Node next;
    Node random;
    public Node(int value){
        this.value = value;
    }
}
public class Solution {
    //数组中只有一个元素出现了一次，其余元素出现了两次，找出那个只出现一次的元素
    public static int singleNumber(int[] number) {
        //首先定义一个map记录元素与其出现的次数，然后通过次数找到那个出现一次的元素
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:number){
            int count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }
        int keyResult = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value==1){
                keyResult = key;
            }
        }
        return keyResult;
    }

    public static Node createNode(){
        Node n1 = new Node(7);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(2);
        n1.next = n2;n2.next = n3;n3.next = n4;n4.next = null;
        n1.random = n3;n2.random = n1;n3.random = n3;n4.random = null;
        return n1;
    }

    public static void show(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.format("%d-->",cur.value);
            cur = cur.next;
        }
        System.out.println("null");
    }

    //复制带随机指针的链表
    public static Node copyRandomList1(Node head) {
        //首先将每个结点都复制一份，插入到链表中每个结点的后面，构成一条新链表，通过原链表的random的next找到新链表的random，最后拆分链表
        if(head==null){
            return null;
        }
        Node cur = head;
        while (cur!=null){
            Node node = new Node(cur.value);
            node.next = cur.next;
            cur.next = node;
            cur = cur.next.next;
        }
        cur = head;
        Node newNode = cur.next;
        while (cur!=null){
            if(cur.random == null){
                newNode.random = null;
            }else {
                newNode.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        Node result = head.next;
        cur = head;
        while (cur!=null){
            cur.next = newNode.next;
            if(newNode.next!=null){
                newNode.next = newNode.next.next;
            }
            cur = cur.next;
        }
        return result;
    }


    public static Node copyRandomList2(Node head) {
        //首先将原有的链表复制（除random外）一份，得到一个与原先链表（无random）一样的链表，然后将两个链表的值分别放入map中，新链表的random是旧链表random的value
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        Node result = null;
        Node last = null;
        while (cur!=null){
            Node node = new Node(cur.value);
            if(result==null){
                result = node;
            }else {
                last.next = node;
            }
            last = node;
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        Node n = result;
        while (cur!=null){
            //cur的random的值就是n的random
            n.random = map.get(cur.random);
            cur = cur.next;
            n = n.next;
        }
        return result;
    }
    //J代表宝石类型，S代表你拥有的石头，S中每个字符代表一种石头，返回S中有多少种宝石
    public static int numJewelsInStones(String J, String S) {
        //将J中的元素放入set中（不重复），然后遍历S，看set中是否包含S中的元素，如果有，count加一
        //数组a为宝石，数组b为石头
        char[] a = S.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch:a){
            set.add(ch);
        }
        int count = 0;
        char[] b = J.toCharArray();
        for(char ch:b){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] number = {2,1,2,1,3,3,4,5,5,6,6};
        int keyResult = singleNumber(number);
        System.out.println(keyResult);
        System.out.println("===============================");
        Node node1 = createNode();
        copyRandomList1(node1);
        show(node1);
        System.out.println("===============================");
        Scanner scanner = new Scanner(System.in);
        String J = scanner.nextLine();
        String S = scanner.nextLine();
        int baoShiResult = numJewelsInStones(J,S);
        System.out.println(baoShiResult);
        System.out.println("===============================");
        //键盘中有一些键坏了，已知输入的数据以及要输进去的数据，进行对比，将坏掉的键以顺序且大写打印出来
        Scanner sc = new Scanner(System.in);
        String actual = sc.nextLine();
        String now = sc.nextLine();
        //now数组且元素都大写
        char[] a = now.toUpperCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch:a){
            set.add(ch);
        }
        //actual数组且数组大写
        char[] b = actual.toUpperCase().toCharArray();
        Set<Character> brokenKeys = new HashSet<>();
        for(char ch:b){
            if(!set.contains(ch)){
                if(!brokenKeys.contains(ch)){
                    System.out.print(ch+" ");
                    brokenKeys.add(ch);
                }
            }
        }
    }
}

package com.xing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/8/20
 */
public class PlayCards {

    public static void temp(ArrayList<PorkCard> arrayList,int i,int j){
        PorkCard temp1 = arrayList.get(i);
        PorkCard temp2 = arrayList.get(j);
        arrayList.set(i,temp2);
        arrayList.set(j,temp1);
    }

    public static void main(String[] args) {
        //写出52张牌
        ArrayList<PorkCard> arrayList = new ArrayList<>(52);
        //定义一个数组放入各种花色
        String[] cardColor = {"红桃","黑桃","方块","梅花"};
        //52张牌中有4中花色,每种花色13张
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 13;j++){
                PorkCard porkCard = new PorkCard(cardColor[i],j);
                arrayList.add(porkCard);
            }
        }
        System.out.println(arrayList);
        System.out.println("--------------------------------------");

        //洗牌->取出第52张牌，在前51张随机抽取一张后，两张牌交换(第一张牌例外)
        Random random = new Random(20190820);
        for(int i = 51;i >0;i--){
            //i = 51时，bound的范围[0,51)
            int num = random.nextInt(i);
            temp(arrayList,i,num);
        }
        System.out.println(arrayList);
        System.out.println("--------------------------------------");
        //给三个人分别发五张牌
        ArrayList<PorkCard> A = new ArrayList<>(5);
        ArrayList<PorkCard> B = new ArrayList<>(5);
        ArrayList<PorkCard> C = new ArrayList<>(5);
        for(int i = 1;i<16;i++){
            PorkCard porkCard = arrayList.get(arrayList.size()-1);
            switch (i%3){
                case 0:
                    A.add(porkCard);
                    break;
                case 1:
                    B.add(porkCard);
                    break;
                case 2:
                    C.add(porkCard);
                    break;
                default:
                    break;
            }
            arrayList.remove(porkCard);
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println("------------------------------------");
        //查看A中有没有梅花4，如果有则删除，如果没有则返回
        PorkCard porkCard = new PorkCard("梅花",4);
        System.out.println(A);
        for(int i = 0;i<A.size();i++){
            if(porkCard.equals(A.get(i))){
                A.remove(porkCard);
                System.out.println(A);
            }
        }
        System.out.println("------------------------------------");

        Iterator<PorkCard> iterator = A.iterator();
        System.out.println(A);
        PorkCard porkCard1 = new PorkCard("红桃",4);
        while (iterator.hasNext()){
            PorkCard porkCard2 = iterator.next();
            if(porkCard1.equals(porkCard2)){
                iterator.remove();
                //在迭代器、foreach循环中使用集合提供的remove(),就会出现异常，而Iterator.remove()不会出现异常
            }
        }
        System.out.println(A);
        System.out.println("------------------------------------");
        if (A.contains(porkCard1)) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
        System.out.println("--------------------------------------");
        ListIterator<PorkCard> listIterator = A.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
    }
}

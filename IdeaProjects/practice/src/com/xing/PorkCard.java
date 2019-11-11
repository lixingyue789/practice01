package com.xing;

import java.util.Objects;

/**
 * Author:lxy1999
 * Created:2019/8/20
 */
public class PorkCard {
    private int value;
    private String color;

    public PorkCard(){

    }

    public PorkCard(String color,int value){
        this.color = color;
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "["+this.color+","+this.value+"]";
    }
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }

        //PorkCard类型的引用是否指向o对象
        if(!(o instanceof PorkCard)){
            return false;
        }

        PorkCard porkCard = (PorkCard) o;
        return this.value==porkCard.value&&this.color.equals(porkCard.color);
    }

}

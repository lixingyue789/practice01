package Homework;

/**
 * Author:lxy1999
 * Created:2020/4/20
 */
public class Beer {

    private double price;

    private int num;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Beer(double price, int num){
        this.price = price;
        this.num = num;
    }

    public double TotalPrice(){
        return this.price*this.num;
    }

}

package Homework;

/**
 * Author:lxy1999
 * Created:2020/4/20
 */
public class Apple {

    private double price;

    private double weight;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Apple(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    public double TotalPrice(){
        return this.price*this.weight;
    }
}

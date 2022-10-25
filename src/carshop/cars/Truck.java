package carshop.cars;

public class Truck extends Car {
    int weight;



    public Truck(int speed, boolean isSellOut, double regularPrice,String color,int weight){
        this.speed = speed;
        this.isSellOut=isSellOut;
        this.regularPrice=regularPrice;
        this.color=color;
        this.weight=weight;
    }
    public Truck() {

    }
    public void getInfo(){
        System.out.println("Скорость - "+speed);
        System.out.println("Наличие - "+isSellOut);
        System.out.println("Цена - "+regularPrice);
        System.out.println("Цвет - "+color);
        System.out.println("Вес - "+weight);
    }
    @Override
    public double getSalePrice() {
        if(weight>=2000){
            return regularPrice-regularPrice*0.1;
        }else {
            return regularPrice;
        }
    }
    // если вес больше 2000, скидка 10%.


}

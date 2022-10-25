package carshop.cars;

public class Sedan extends Car {
    int length;


    public Sedan(int speed, boolean isSellOut, double regularPrice,String color,int length){
        this.speed = speed;
        this.isSellOut=isSellOut;
        this.regularPrice=regularPrice;
        this.color=color;
        this.length=length;
    }


    public Sedan() {

    }

    public void getInfo(){
        System.out.println("Скорость - "+speed);
        System.out.println("Наличие - "+isSellOut);
        System.out.println("Цена - "+regularPrice);
        System.out.println("Цвет - "+color);
        System.out.println("Длинна - "+length);
    }

    @Override
    public double getSalePrice() {
        if(length>20){
            return regularPrice-regularPrice*0.05;
        }else {
            return regularPrice;
        }
    }
    // (если длина больше 20, скидка 5%)


}

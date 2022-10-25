package carshop.cars;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice,String color,int year, int manufacturerDiscount){
        this.speed = speed;
        this.isSellOut=isSellOut;
        this.regularPrice=regularPrice;
        this.color=color;

        this.year = year;
        this.manufacturerDiscount=manufacturerDiscount;
    }

    public Ford() {

    }

    public void getInfo(){
        System.out.println("Скорость - "+speed);
        System.out.println("Наличие - "+isSellOut);
        System.out.println("Цена - "+regularPrice);
        System.out.println("Цвет - "+color);
        System.out.println("Вес - "+year);
        System.out.println("Скидка от производителя - "+manufacturerDiscount);
    }

    @Override
    public double getSalePrice() {
        return regularPrice-regularPrice*manufacturerDiscount/100;
    }




}

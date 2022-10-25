package carshop.cars;

public abstract class Car  {
   protected int speed;
   protected boolean isSellOut;
   protected double regularPrice;
    protected String color;


    public void getInfo(){
        System.out.println("Скорость - "+speed);
        System.out.println("Наличие - "+isSellOut);
        System.out.println("Цена - "+regularPrice);
        System.out.println("Цвет - "+color);
    }

    public double getRegularPrice(){
       return regularPrice;
    }
    public String getColor(){
        return color;
    }
    public boolean getIsSellOut(){
        return isSellOut;
    }




   public abstract double getSalePrice();



}

package carshop.impl;

import carshop.Interface.Admin;
import carshop.Interface.Customer;
import carshop.cars.Car;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;

public  class MyOwnAutoShop extends Car implements Admin, Customer {


    Car[] cars = new Car[]{
         new Sedan(),
         new Ford(),
         new Ford(),
         new Truck(),
         new Truck()
    };


    public Car[] getCars(){
        return cars;
    }


    @Override
    public void getCarsPrice() {

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i].getRegularPrice());
        }

    }

    @Override
    public void getCarColors() {
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i].getColor());
        }
    }

    @Override
    public void getCarPrice(int id) {
        System.out.println(cars[id].getRegularPrice());
    }

    @Override
    public void getCarColor(int id) {
        System.out.println(cars[id].getColor());
    }

    @Override
    public void purchaseCar(int id) {
        System.out.println(cars[id].getIsSellOut());
    }


    @Override
    public void getIncome() {
        double sum=0;
        for (int i=0;i<cars.length;i++){
            if(cars[i].getIsSellOut()==false){
                sum+=cars[i].getRegularPrice();
            }
        }
        System.out.println(sum);
    }
    @Override
    public double getSalePrice() {
        return 0;
    }
}

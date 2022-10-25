package carshop.Interface;

import carshop.cars.Car;

public interface Customer {
    void getCarsPrice();
    void getCarColors();
    void getCarPrice(int id);
    void getCarColor(int id);
    void purchaseCar(int id);

}

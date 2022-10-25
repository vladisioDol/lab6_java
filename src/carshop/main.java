package carshop;

import carshop.cars.Car;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.impl.MyOwnAutoShop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        MyOwnAutoShop car = new MyOwnAutoShop();
        Car [] cars= new Car[5];

        cars[0] = car.getCars()[0]=new Sedan(90,true,100,"red(Sedan)",25);
        cars[1] = car.getCars()[1]=new Ford(99,false,200,"yellow(Ford)",1999,10);
        cars[2] = car.getCars()[2]=new Ford(101,true,300,"green(Ford)",1990,20);
        cars[3] = car.getCars()[3]=new Truck(88,false,400,"black(Truck)",1900);
        cars[4] = car.getCars()[4]=new Truck(92,true,500,"gray(Truck)",2010);

        int answer=0;
        System.out.println("Hello my dear customer!\n");
        while (answer!=7) {
            System.out.println("\t\tMenu\n");
            System.out.println("1.Show all prices");
            System.out.println("2.Show all colors");
            System.out.println("3.Show price by id");
            System.out.println("4.Show color by id");
            System.out.println("5.Show purchase by id");
            System.out.println("6.Show discounted prices");
            System.out.println("7.Exit\n");
            System.out.print("Your answer: ");
            answer=console.nextByte();
            switch (answer){
                case 1:{
                    car.getCarsPrice();
                    break;
                }
                case 2:{
                    car.getCarColors();
                    break;
                }
                case 3:{
                    System.out.println("Please enter car id(0-4)");
                    answer=console.nextInt();
                    while (answer<0 || answer>4){
                        System.out.println("Enter a number from 0 to 4!");
                        answer=console.nextInt();
                    }
                    car.getCarPrice(answer);
                    break;
                }
                case 4:{
                    System.out.println("Please enter car id(0-4)");
                    answer=console.nextInt();
                    while (answer<0 || answer>4){
                        System.out.println("Enter a number from 0 to 4!");
                        answer=console.nextInt();
                    }
                    car.getCarColor(answer);
                    break;
                }
                case 5:{
                    System.out.println("Please enter car id(0-4)");
                    answer=console.nextInt();
                    while (answer<0 || answer>4){
                        System.out.println("Enter a number from 0 to 4!");
                        answer=console.nextInt();
                    }
                    car.purchaseCar(answer);
                    break;
                }
                case 6:{
                    System.out.println( ((Sedan)cars[0]).getSalePrice() );
                    System.out.println(((Ford)cars[1]).getSalePrice());
                    System.out.println(((Ford)cars[2]).getSalePrice());
                    System.out.println(((Truck)cars[3]).getSalePrice());
                    System.out.println(((Truck)cars[4]).getSalePrice());
                    break;
                }

                case 7:{
                    System.out.println("Bye bye");
                    System.out.print("Amount of cars sold: ");
                    car.getIncome();
                    System.out.println("List of cars sold:\n");
                    for (int i=0;i<cars.length;i++){
                        if(cars[i].getIsSellOut()==false){
                            cars[i].getInfo();
                            System.out.println();
                        }
                    }
                    break;
                }
                default:{
                    System.out.println("It's not on the menu!!!!");
                    break;
                }
            }


        }
    }


}
package com.black.testy;

/**
 * User: EthanArcher
 * Date: 16/05/2013
 * Time: 17:28
 */
public class Car {

    String manufacturer, reg, owner;
    int year;

    public Car(String man, String r, int y , String o){

        manufacturer = man;
        reg = r;
        year = y;
        owner = o;

    }

    public static void main(String[] args)
    {
        Car car1, car2;

        car1 = new Car("Rolls Royce", "RRY 888", 1930, "Bertie Wooster");
        car2 = new Car("Vauxhall", "TGR 33L", 2007, "Richard Hammond");

        printCar(car1);
        printCar(car2);

        System.out.println("");

        if (car1.equals(car1)){
            System.out.println("Same Car");
        }
        else System.out.println("Different Cars");


    }

    public static void printCar(Car x)
    {
        System.out.print(x.manufacturer + " " + x.reg  + " " + x.year  + " " + x.owner);

    }

    public boolean equals(Car c)
    {
        if ((manufacturer == c.manufacturer) && (reg == c.reg) && (year == c.year) && (owner == c.owner)) return true;
        else return false;
    }

}



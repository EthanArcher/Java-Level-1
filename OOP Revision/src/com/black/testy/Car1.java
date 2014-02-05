package com.black.testy;

/**
 * User: EthanArcher
 * Date: 16/05/2013
 * Time: 22:24
 */
public class Car1 {

    String manufacturer, reg, owner;
    int year;

    public Car1 (String man, String r, int y , String o){

        manufacturer = man;
        reg = r;
        year = y;
        owner = o;

    }

    public static void main(String[] args)
    {
        Car1 rolls, vaux;

        rolls = new Car1("Rolls Royce", "RRY 888", 1930, "Bertie Wooster");
        vaux = new Car1("Vauxhall", "TGR 33L", 2007, "Richard Hammond");

        printCar(rolls);
        printCar(vaux);

        rolls.otherPrint();
        vaux.otherPrint();

    }

    public static void printCar(Car1 car)
    {
        System.out.println(car.manufacturer + " " + car.reg  + " " + car.year  + " " + car.owner);

    }

    public void otherPrint()
    {
        System.out.println(manufacturer + " " + reg  + " " + year  + " " + owner);
    }


}

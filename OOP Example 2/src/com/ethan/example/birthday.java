package com.ethan.example;

/**
 * User: EthanArcher
 * Date: 11/02/2013
 * Time: 22:48
 */
public class birthday {
    public static void main(String[] args) {
        MyDate2 jillBirthday;

        jillBirthday = new MyDate2(7, "August", 2013);

        System.out.println("Jills Birthday is on");
        printDate(jillBirthday);

    }

    public static void printDate(MyDate2 d){

        System.out.println(d.day + " " + d.month + " " + d.year);

    }

}

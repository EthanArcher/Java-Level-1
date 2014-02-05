package com.ethan.oop.examples;

/**
 * User: EthanArcher
 * Date: 11/02/2013
 * Time: 11:10
 */
public class Example1 {
    public static void main(String[] args) {
        MyDate1 exam1011, peterBirthday;

        exam1011 = new MyDate1 (17, "March", 2013);
        peterBirthday = new MyDate1(13, "November", 2013);

        printDate(exam1011);
        printDate(peterBirthday);
        printDate(17, "March", 2013);


    }

    public static void printDate (MyDate1 d){
        System.out.println(d.day + " " + d.month + " " + d.year);
    }

    public static void printDate (int d, String m, int y){
        System.out.println(d + " " + m + " " + y) ;

    }



}


package com.green.practical10;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 13:16
 */
public class MyDate1 {

    int day;
    String month;
    int year;

    public MyDate1 (int day,String month,int year)
    {

        this.day = day;
        this.year = year;
        this.month = month;
    }



    public void printDate()
    {
        System.out.println(day + "\t" + year + "\t" + month);

    }

}

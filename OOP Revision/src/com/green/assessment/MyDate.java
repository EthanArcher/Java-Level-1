package com.green.assessment;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 22:20
 */

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;

class MyDate
{

    public MyDate()
    {
        superDate = new Date(-1899, 0, 1);
        updateDMY();
    }

    public MyDate(int day, String month, int year)
    {
        int m = findMonth(month);
        superDate = new Date(year - 1900, m, day);
        updateDMY();
    }

    private int findMonth(String month)
    {
        int m;
        for(m = 0; !monthNames[m].equals(month) && m < 11; m++);
        if(m > 11)
            m = 0;
        return m;
    }

    private void updateDMY()
    {
        date = superDate.getDate();
        month = monthNames[superDate.getMonth()];
        year = superDate.getYear() + 1900;
    }

    public MyDate copy()
    {
        return new MyDate(date, month, year);
    }

    public boolean before(MyDate d)
    {
        return superDate.before(d.getSuperDate());
    }

    public boolean after(MyDate d)
    {
        return superDate.after(d.getSuperDate());
    }

    public boolean equals(MyDate d)
    {
        return superDate.equals(d.getSuperDate());
    }

    private Date getSuperDate()
    {
        return superDate;
    }

    public int getDate()
    {
        return date;
    }

    public int getDay()
    {
        int day = superDate.getDay();
        return day;
    }

    public String getDayName()
    {
        int day = superDate.getDay();
        return dayNames[day];
    }

    public String getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void setDate(int d)
    {
        superDate.setDate(d);
        updateDMY();
    }

    public void setMonth(String month)
    {
        int m = findMonth(month);
        superDate.setMonth(m);
        updateDMY();
    }

    public void setYear(int y)
    {
        superDate.setYear(y - 1900);
        updateDMY();
    }

    public void setToNextDay()
    {
        setDate(getDate() + 1);
        updateDMY();
    }

    public void setToToday()
    {
        superDate = Calendar.getInstance().getTime();
        updateDMY();
    }

    public String toString()
    {
        int m = findMonth(month) + 1;
        String ds;
        if(date < 10)
            ds = (new StringBuilder()).append("0").append(date).toString();
        else
            ds = (new StringBuilder()).append("").append(date).toString();
        String ms;
        if(m < 10)
            ms = (new StringBuilder()).append("0").append(m).toString();
        else
            ms = (new StringBuilder()).append("").append(m).toString();
        return (new StringBuilder()).append(ds).append("/").append(ms).append("/").append(year).toString();
    }

    public String toDateString()
    {
        return (new StringBuilder()).append(date).append(" ").append(month).append(" ").append(year).toString();
    }

    public static void main(String args[])
    {
        MyDate d1 = new MyDate(10, "February", 2011);
        MyDate d2 = new MyDate(31, "December", 2010);
        MyDate temp = d2.copy();
        d2.setToNextDay();
        System.out.println((new StringBuilder()).append("d1 = ").append(d1.toDateString()).toString());
        System.out.println((new StringBuilder()).append("Copy of original d2 = ").append(temp.toDateString()).toString());
        System.out.println((new StringBuilder()).append("Day after d2 = ").append(d2.toDateString()).toString());
        temp = new MyDate();
        System.out.println((new StringBuilder()).append("Blank date = ").append(temp.toDateString()).toString());
        temp.setToToday();
        System.out.println((new StringBuilder()).append("Today = ").append(temp.toDateString()).toString());
        if(d1.after(d2))
            System.out.println("d1 comes after d2");
        else
        if(d2.after(d1))
            System.out.println("d2 comes after d1");
        else
            System.out.println("d1 is the same date as d2");
        if(d2.before(d1))
        {
            temp = d2;
            d2 = d1;
            d1 = temp;
        }
        System.out.println((new StringBuilder()).append("d1 = ").append(d1.toDateString()).toString());
        System.out.println((new StringBuilder()).append("d2 = ").append(d2.toDateString()).toString());
        System.out.println((new StringBuilder()).append("Day of d1 = ").append(d1.getDayName()).append(" i.e. ").append(d1.getDay()).toString());
        System.out.println((new StringBuilder()).append("d2 = ").append(d2.getDayName()).append(" in ").append(d2.getMonth()).toString());
        MyDate easter = new MyDate(24, "April", 2011);
        MyDate exam1011 = new MyDate(23, "May", 2011);
        MyDate semester2 = new MyDate(31, "January", 2011);
        System.out.println((new StringBuilder()).append("Easter is ").append(easter.toString()).toString());
        System.out.println((new StringBuilder()).append("1011 is ").append(exam1011.toString()).toString());
        System.out.println((new StringBuilder()).append("2nd semester starts on ").append(semester2.toString()).toString());
        d1 = new MyDate(31, "January", 2011);
        d2 = new MyDate(28, "February", 2011);
        int x1 = d1.getYear();
        d2.setMonth("March");
        if(d1.after(d2))
            System.out.println("d1 comes after d2");
        if(d1.equals(d2))
            System.out.println("d1 represents the same date as d2");
        d2 = d1.copy();
        d1.setToNextDay();
        System.out.println((new StringBuilder()).append("d1 falls on a ").append(d1.getDayName()).toString());
        if(d1.getDay() == d2.getDay())
            System.out.println("d1 and d2 fall on the same day of the week");
        System.out.println((new StringBuilder()).append("d1 is ").append(d1.toString()).toString());
        System.out.println((new StringBuilder()).append("d1 is ").append(d1.toDateString()).toString());
    }

    int date;
    String month;
    int year;
    private Date superDate;
    private static String dayNames[] = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    private static String monthNames[] = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };

    public void printDate()
    {
        System.out.println(date + "\t" + month + "\t" + year);

    }

}

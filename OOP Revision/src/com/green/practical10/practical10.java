package com.green.practical10;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 13:26
 */
public class practical10 {

    public static void main(String[] args){

        MyDate easter, exam, birth;

        easter = new MyDate (31, "March", 2013);
        exam = new MyDate (21, "May", 2013);
        birth = new MyDate (29, "December", 2013);

        easter.printDate();
        exam.printDate();
        birth.printDate();

        if (easter.before(exam)){

            System.out.println("Easter is before the Exam and is on the " + easter);
            easter.printDate();

        }

    }

}

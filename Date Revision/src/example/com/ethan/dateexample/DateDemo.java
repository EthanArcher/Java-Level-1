package example.com.ethan.dateexample;

/**
 * User: EthanArcher
 * Date: 21/02/2013
 * Time: 22:26
 */
public class DateDemo {

    public static void main(String[] args) {
         MyDate ethan, hannah;

        ethan = new MyDate (29, "December", 1993);
        hannah = new MyDate (16, "October", 1993);

        System.out.println("Ethan was born on the ");
        printDate (ethan);
        System.out.println("and Hannah was born on the ");
        printDate(hannah);
        System.out.println("and they are in love");

    }

    public static void printDate(MyDate date) {

        System.out.println(date.day + " " + date.month + " " + date.year);
    }

}

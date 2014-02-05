package com.green.practical11;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 14:12
 */
public class practical11 {


    public static void main(String[] args)
    {
        // Declare and create CreditCard array

        CreditCard[] cardArray = new CreditCard[4];

        MyDate cardStart;
        cardStart = new MyDate();
        cardStart.setToToday();



        // Create the four credit card objects,
        // so that each is an element of an array

        cardArray[0] = new CreditCard("Mastercard", "950149", "MR FRED BLOGGS", "5669 9779 1234 5678", cardStart, new MyDate (31, "August", 2014), "567");
        cardArray [1] = new CreditCard("Visa", "980155", "DR JOE SMITH", "5335 5446 1111 2222", cardStart, new MyDate (31, "March", 2013), "0500" );
        cardArray [2] = new CreditCard("Maestro", "900295", "MISS MARY FLYNN", "6767 5445 2233 4455", new MyDate (1, "August", 2010), new MyDate (31, "December", 2012), "123");
        cardArray [3] = new CreditCard ("Mastercard", "950392", "MS JENNY LIANG", "5669 8338 4321 8765", cardStart , new MyDate (31, "January", 2014), "888");



        // print details of each of the credit cards in turn

        for (int i=0; i<4; i++)
        {
            // print details of one credit card

            cardArray[i].printDetails();

        }

        System.out.println("");
        System.out.println("The following cards are valid today");

        for (int i=0; i<4; i++)
        {

            if (cardArray[i].cardValidOn(cardStart))
            {
                cardArray[i].printDetails();
            }

        }

        System.out.println("");
        System.out.println("The following cards have a valid security code");

        for (int i =0; i<4; i++){
            if (cardArray[i].securityCodeValid()){
                cardArray[i].printDetails();
            }
        }

        System.out.println("");

        for (int i=0; i<4; i++){
            if (cardArray[i].cardValidOn(cardStart) == false) {
                System.out.println("The following cards are not valid today");
                cardArray[i].printDetails();

            }

            if (cardArray[i].securityCodeValid()== false){
                System.out.println("The following cards do not have a valid security code");
                cardArray[i].printDetails();

            }

        }

    }
}
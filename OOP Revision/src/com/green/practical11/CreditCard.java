package com.green.practical11;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 14:11
 */
class CreditCard
{
    // Declare the variables needed to hold
    // the details for 'this' credit card

    String kind, sortCode, cardHolder, number, securityCode;
    MyDate start, expiry;

    // Define the constructor for initialising a new credit card object

    public CreditCard (String kind, String sortCode, String cardHolder, String number, MyDate start, MyDate expiry, String securityCode)
    {
        this.kind = kind;
        this.sortCode = sortCode;
        this.cardHolder = cardHolder;
        this.number = number;
        this.start = start;
        this.expiry = expiry;
        this.securityCode = securityCode;

    }


    public void printDetails()
    {
        // print out the details of 'this' credit card

        System.out.println(kind + "\t" + sortCode + "\t" + cardHolder + "\t" + number + "\t" + start + "\t" + expiry + "\t" + securityCode );


    }



    public boolean  cardValidOn (MyDate d)
    {
        // return true if d is between this card’s start and expiry dates, inclusive

        MyDate date = d;

        if (date.before(expiry) && date.after(start))
        {
            return true;
        }

        if (date.equals(expiry)) return true;
        if (date.equals(start)) return true;

        else return false;
    }


    public boolean  securityCodeValid ()
    {
        // return true if this card’s security code has three characters

        if (securityCode.length() == 3){
            return true;
        }

        else return false;

    }




}

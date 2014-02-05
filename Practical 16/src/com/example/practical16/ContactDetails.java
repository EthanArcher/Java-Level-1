package com.example.practical16;

/**
 * User: EthanArcher
 * Date: 26/04/2013
 * Time: 14:09
 */

public class ContactDetails
{
    // declare properties

    String name, homeAdd, homeTel, workTel, mobile;

    // define constructor method

    public ContactDetails (String name, String homeAdd, String homeTel, String workTel, String mobile)
    {
        this.name = name;
        this.homeAdd = homeAdd;
        this.homeTel = homeTel;
        this.workTel = workTel;
        this.mobile = mobile;
    }




    public void printDetails()
    {
        /*if (name.length() != 0)
        {
            System.out.println("Name : " + "\t" + name);       //either of these methods can be used
        }
        */
        if (!name.equals(""))
        {
            System.out.println("Name : " + "\t" + name);
        }

        if (homeAdd.length() != 0)
        {
            System.out.println("Home Address : " + "\t" + homeAdd);
        }

        if (homeTel.length() != 0)
        {
            System.out.println("Home Tel Number : " + "\t" + homeTel);
        }

        if (workTel.length() != 0)
        {
            System.out.println("Work Tel Number : " + "\t" + workTel);
        }

        if (mobile.length() != 0)
        {
            System.out.println("Mobile Number : " + "\t" + mobile);
        }

        System.out.println("------------");
    }

}
package com.example.practical16;

/**
 * User: EthanArcher
 * Date: 26/04/2013
 * Time: 14:12
 */

import java.util.*;


class Prac16

{

    public static void printList(List<ContactDetails> L)
    {
        // Prints the details of each contact in the list L:

        for (int i=0; i<L.size() ; i++)
        {
            ContactDetails item = L.get(i);
            item.printDetails();
        }

    }



    public static void printMobileList(List<ContactDetails> L)
    {
        // Prints details of each contact with a mobile number in the list L:

        for (int i=0; i<L.size() ; i++)
        {
            ContactDetails item = L.get(i);

            if (item.mobile.length() != 0)
            {
                item.printDetails();
            }

        }

    }



    public static void deleteContact(List<ContactDetails> L, int position)
    {
        // Deletes the item at given position in L, provided it is valid

        int len = L.size();

        if (position < len)      // if ( (position >=0) && (position <L.size())
        {
            L.remove(position);
        }

        else
        {
            System.out.println("phost sin nach bhfuil ar fáil toisc nach bhfuil an liosta fada go leor");
            System.out.println("==============================");
            System.out.println("");

        }


    }

    public static void main(String[] args)
    {


        List<ContactDetails> contacts = new LinkedList<ContactDetails>();

        ContactDetails c1 = new ContactDetails ("Archer, Ethan", "25 Tullagh Brow", "028 25 639 615", "", "07707172737");
        ContactDetails c2 = new ContactDetails ("The-Eagle, Terry", "The Nest", "(0800)The-Eagle-has-Landed", "", "#freethebird");
        ContactDetails c3 = new ContactDetails ("Ron Weasley", "The Burrow", "013-Magic-Phone-Number", "", "");
        ContactDetails c4 = new ContactDetails ("The-Tree, Tim", "Portglenone Forest", "tress dont have phones", "they dont even have arms", "or mouths...");

        contacts.add (c1);
        contacts.add (c2);
        contacts.add (c3);
        contacts.add (c4);

        ContactDetails c5 = new ContactDetails ("Laide, Stephen", "Somewhere in Ireland", "012 312 5876 36282195 6849265495943843", "", "");

        contacts.add(2, c5);

        /*deleteContact(contacts, 8);
        deleteContact(contacts, 2);
        deleteContact(contacts, 1);
        */


        printList(contacts);
        System.out.println("==============================");
        printMobileList(contacts);

        Collections.sort(
                contacts,
                new Comparator()
                {
                    public int compare(Object r1, Object r2)        // need to pass in as object r1
                    {
                        ContactDetails m1 = (ContactDetails) r1;
                        ContactDetails m2 = (ContactDetails) r2;

                        return m1.name.compareTo(m2.name);

                    }
                }

        );

        printList(contacts);

    }

}

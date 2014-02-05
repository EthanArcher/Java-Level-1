package com.black.Prac16;// import

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Prac16
{

    public static void main(String[] args)
    {
        List<ContactDetails> allContacts = new LinkedList<ContactDetails>();

        ContactDetails c1, c2, c3, c4;

        c1  = new ContactDetails("Neeson, Liam", "The White House", "", "001 913 777 4666", "");
        c2 = new ContactDetails("Smith, Joe", "230 Alanbrooke Hall","02890 445566", "", "0778 123 4567");
        c3 = new ContactDetails("Jones, Mary", "13 Malone Road","02890 765432", "", "");
        c4 = new ContactDetails("Smart, Vince", "Crossland Building","", "028 9097 4444", "001 913 123 4567");

        allContacts.add(c1);
        allContacts.add(c2);
        allContacts.add(c3);
        allContacts.add(c4);

        printList(allContacts);
        printMobileList(allContacts);

        deleteContact(allContacts, 1);

        System.out.println("===========================");

        printList(allContacts);

        Collections.sort
        (
                allContacts,
                new Comparator()
                {
                    public int compare (Object r1, Object r2)
                    {
                        ContactDetails m1 = (ContactDetails) r1;
                        ContactDetails m2 = (ContactDetails) r2;
                        return m1.name.compareTo(m2.name);

                    }
                }

        );


        System.out.println("==============================================================\n\n");


    }

	public static void printList(List<ContactDetails> L)
	{
		// Prints the details of each contact in the list L:

        ContactDetails temp;

        for (int i=0; i<L.size(); i++)
        {
            temp = (L.get(i));
            temp.printDetails();
        }

	}


	public static void printMobileList(List<ContactDetails> L)
	{
		// Prints details of each contact with a mobile number in the list L:

        ContactDetails temp;

        System.out.println("===========================");

        System.out.println("Mobile Number");

        for (int i=0; i<L.size(); i++)
        {
            temp = L.get(i);
            String number = temp.mobile;

            if (!number.equals(""))
            {
                temp.printDetails();
            }
        }

	}



	public static void deleteContact(List<ContactDetails> L, int position)
	{
		// Deletes the item at given position in L, provided it is valid

        if ((position> -1) && (position< L.size()))
        {
            L.remove(position);
        }


	}




}


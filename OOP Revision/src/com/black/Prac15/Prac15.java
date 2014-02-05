package com.black.Prac15;

import java.util.*;

class Prac15
{


	public static void printList(List<String> L)
	{
		// Prints out all the (String) elements in L.

        for (int i=0; i<L.size(); i++)
        {
            String name = L.get(i);
            System.out.println(name);

        }

        System.out.println("===============");

	}

    public static int searchList(List<String> L, String search)
    {
        for (int i=0; i<L.size(); i++)
        {
            String name = L.get(i);
            if (name.equals(search))
            {
                return i;
            }

        }
        return -1;
    }



	public static void main(String[] args)
	{

		List<String> names = new LinkedList<String>();
        int pos;
        String newName;

		names.add("Jones, M");
        names.add("Smith, J");
        names.add("Bloggs, F");
        names.add("Thompson, A");
        names.add("McCullough, G");
        names.add("Ling, Y");
		printList(names);

        names.add(2,"Archer, E");
        printList(names);

        names.remove(1);
        printList(names);

        newName = "Archer, E";
        pos = searchList(names, newName);
        if (pos >= 0)
        {
            System.out.println("FOUND");
        }
        else System.out.println(("NOT FOUND"));

	}

}


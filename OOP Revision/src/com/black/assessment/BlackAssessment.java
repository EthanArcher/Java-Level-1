package com.black.assessment;

import java.util.*;

class BlackAssessment
{

	public static void printAllStock(List<StockItem> allStock)
	{
		// Prints the details of each contact in the list L:

        System.out.println("Name \t\t Price \t Stock \t Ordered");

        StockItem temp;

        for (int i=0; i<allStock.size(); i++)
        {
            temp = allStock.get(i);
            temp.printStockItem();

        }

		// Print header first
	
	}




	public static StockItem findItem(List<StockItem> allStock, String n)
	{
        int num;
        StockItem temp;

        for (num=0; num<allStock.size(); num++)
        {
            temp = allStock.get(num);

            if (temp.name.equals(n)){
                return temp;
            }
        }
        return null;

    }

	public static void orderReceived(List<StockItem> allStock,  String itemName,  int N)
	{
        StockItem temp;
        int old, total;

        for (int i=0; i<allStock.size(); i++)
        {
            temp = allStock.get(i);
            if (temp.name.equals(itemName))
            {
                old = temp.order;
                total = old + N;
                temp.order = total;

            }

        }

	}
	
	
	public static double valueOfStock (List<StockItem> allStock)
	{
        double runningTotal = 0;
        StockItem temp;
        int num;
        double cost, totes;

        for (int i=0; i<allStock.size(); i++)
        {
            temp = allStock.get(i);
            num = temp.stock;
            cost = temp.price;
            totes = num * cost;
            runningTotal = runningTotal + totes;

        }

        return runningTotal;

	
	}	



	public static void main(String[] args)
	{



        StockItem stock1,stock2,stock3,stock4, stock5;

        //Assign Stock
        stock1 =new StockItem("Milk 2L semi",1.79,12,30);
        stock2 =new StockItem("Teabags 100",3.45,20,0);
        stock3 =new StockItem("Coffee 200g",4.75,0,10);
        stock4 =new StockItem("Mars bar med",0.65,50,100);
        stock5 =new StockItem("Orange Juice",1.15,12,0);

        //print stock

        stock1.printStockItem();
        stock2.printStockItem();
        stock3.printStockItem();
        stock4.printStockItem();

        System.out.println("==============================================================\n\n");

        List<StockItem> allStock = new LinkedList<StockItem>();

        allStock.add(stock1);
        allStock.add(stock2);
        allStock.add(stock3);
        allStock.add(stock4);

        printAllStock(allStock);

        allStock.add(2,stock5);

        System.out.println("==============================================================\n\n");

        printAllStock(allStock);

        System.out.println("==============================================================\n\n");

        String search;
        StockItem result;

        search = ("Orange Juice");
        System.out.println("Searching for " + search);

        result = findItem(allStock, search);
        if (result != null){
            result.printStockItem();
        }
        else System.out.println("Item not found");

        System.out.println("==============================================================\n\n");

        orderReceived(allStock, "Coffee 200g" , 8);

        printAllStock(allStock);

        System.out.println("==============================================================\n\n");

        double total = valueOfStock(allStock);

        System.out.println("The total vaue of stock is " + total);












		
		
	}

}


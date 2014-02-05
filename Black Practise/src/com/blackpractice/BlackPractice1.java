package com.blackpractice;

/**
 * User: EthanArcher
 * Date: 02/05/2013
 * Time: 21:48
 */

import java.util.*;

class BlackPractice1 {

    public static void main(String[] args){

        StockItem stock1,stock2, stock3, stock4;
        int check=0;
        double runningTotal = 0;

        stock1 = new StockItem("Milk 2L semi", 1.79, 12, 30);
        stock2 = new StockItem("Teabags 100", 3.45, 20, 0);
        stock3 =new StockItem("Coffee 200g",4.75,0,10);
        stock4 =new StockItem("Mars bar med",0.65,50,100);

        stock1.printStockItem();
        stock2.printStockItem();
        stock3.printStockItem();
        stock4.printStockItem();

        System.out.println("======================================================");

        List <StockItem> allStock = new LinkedList <StockItem>();


        allStock.add(stock1);
        allStock.add(stock2);
        allStock.add(stock3);
        allStock.add(stock4);

        printAllStock(allStock);

        System.out.println("======================================================");

        allStock.add(1, new StockItem(("Orange Juice"),1.15,12,0));

        printAllStock(allStock);

        System.out.println("======================================================");

        String search = "Orange Juice";

        findItem(allStock, search, check);

        search = "Green Tea";

        findItem(allStock, search, check);

        search = "Coffee 200g";

        for (int x=0; x<allStock.size(); x++){

            StockItem item = allStock.get(x);

            if (item.name.equals(search))
            {
                item.onOrder = item.onOrder + 8;

            }

        }

        System.out.println("======================================================");

        printAllStock(allStock);


        for (int y=0; y<allStock.size(); y++){

            StockItem item = allStock.get(y);

            runningTotal = item.price * item.inStock;

        }

        System.out.println("Total stock value = " + runningTotal);


    }

    public static void printAllStock (List<StockItem> allStock) {

        System.out.println("Name \t\t\t\t| Price | Number in Stock | Number on Order");

        for (int i=0; i<allStock.size(); i++){

            StockItem item = allStock.get(i);
            item.printStockItem();

        }



    }

    public static void findItem(List <StockItem> allStock, String search, int check ) {

        for (int x=0; x<allStock.size(); x++){

            StockItem item = allStock.get(x);

            if (item.name.equals(search))
            {
                item.printStockItem();
                check =2;

            }



        }



    }

}

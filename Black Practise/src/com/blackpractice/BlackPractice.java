package com.blackpractice;

/**
 * User: EthanArcher
 * Date: 02/05/2013
 * Time: 21:37
 */
import java.util.*;

    class BlackPractice{

        public static void main(String[] args){
            //Stock Info
            StockItem stock1,stock2,stock3,stock4;

            //Assign Stock
            stock1 =new StockItem("Milk 2L semi",1.79,12,30);
            stock2 =new StockItem("Teabags 100",3.45,20,0);
            stock3 =new StockItem("Coffee 200g",4.75,0,10);
            stock4 =new StockItem("Mars bar med",0.65,50,100);

            //Print stock
            stock1.printStockItem();
            stock2.printStockItem();
            stock3.printStockItem();
            stock4.printStockItem();

            System.out.println("==============================================================\n\n");

            //Create Stock List
            List <StockItem> allStock = new LinkedList <StockItem>();

            //Add Stock To List
            allStock.add(stock1);
            allStock.add(stock2);
            allStock.add(stock3);
            allStock.add(stock4);

            //Print Stock List
            printAllStock(allStock);

            System.out.println("==============================================================\n\n");

            //Add Orange Juice to 2nd in list
            allStock.add(1,new StockItem("Orange Juice",1.15,12,0));

            //Print Stock List
            printAllStock(allStock);

            System.out.println("==============================================================\n\n");

            //Define Search test
            StockItem item;
            String search;

            search = "Orange Juice";
            System.out.println("Searching for " + search);
            item = findItem(allStock,search);
            if (item!=null){
                item.printStockItem();
            }
            else{
                System.out.println(search + " not found");
            }

            System.out.println("==============================================================\n\n");

            //Define Search test 2
            search = "Green Tea";
            System.out.println("Searching for " + search);
            item = findItem(allStock,search);
            if (item!=null){
                item.printStockItem();
            }
            else{
                System.out.println(search + " not found");
            }

            System.out.println("==============================================================\n\n");

            //Add Order
            orderReceived(allStock,"Coffee 200g",8);

            //Print Stock List
            printAllStock(allStock);

            System.out.println("==============================================================\n\n");

            //Check Value of Stock
            double value = valueOfStock(allStock);
            System.out.println("Current value of stock: £" + value);
        }

        public static void printAllStock(List<StockItem> allStock){
            //Print all Stock Header
            System.out.println("Name \t\t\t\t| Price | Number in Stock | Number on Order");
            System.out.println("----------------------------------------------------------------");
            //loop and print item by item
            for(StockItem row : allStock){
                row.printStockItem();
            }
        }

        public static StockItem findItem(List<StockItem> allStock, String itemName){
            //Loop by item
            for(StockItem row : allStock){
                //check if equals (ignore case)
                if (row.name.equalsIgnoreCase(itemName)){
                    //if found return row
                    return row;
                }
            }
            //if not found return null
            return null;
        }

        public static void orderReceived(List<StockItem> allStock,String itemName, int N){
            //loop through item by item
            for(StockItem row : allStock){
                //Check if equals
                if (row.name.equalsIgnoreCase(itemName)){
                    //Add Stock, minus order (if negative order set to 0)
                    row.inStock += N;
                    row.onOrder -= N;
                    if(row.onOrder < 0){
                        row.onOrder = 0;
                    }
                }
            }
        }

        public static double valueOfStock(List<StockItem> allStock){
            //Initialize running total to 0
            double runningTotal=0;
            //loop item by item
            for(StockItem row : allStock){
                //update runningtotal
                runningTotal += row.inStock * row.price;
            }
            //return value
            return runningTotal;
        }

    }


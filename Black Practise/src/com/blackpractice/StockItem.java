package com.blackpractice;

/**
 * User: EthanArcher
 * Date: 02/05/2013
 * Time: 21:38
 */
class StockItem{
        // declare properties
        String name;
        double price;
        int inStock,onOrder;

        // define constructor method

        public StockItem(String pName,double pPrice,int pInStock,int pOnOrder){
            name = pName;
            price = pPrice;
            inStock = pInStock;
            onOrder	= pOnOrder;
        }



        public void printStockItem(){
            //Print Out Item
            System.out.printf(name + "\t\t| £%3.2f |\t\t" + inStock + "\t\t  |\t " + onOrder + "\n", price);
        }

    }


package com.blackpractice;

/**
 * User: EthanArcher
 * Date: 02/05/2013
 * Time: 21:59
 */
public class StockItem1 {

    String name;
    double price;
    int inStock, onOrder;

    public StockItem1 (String name, double price, int inStock, int onOrder){

        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.onOrder = onOrder;

    }

    public void printStockItem(){

        System.out.println(name + "\t\t" + "£" + price + "\t\t" + inStock + "\t" + onOrder);

    }


}

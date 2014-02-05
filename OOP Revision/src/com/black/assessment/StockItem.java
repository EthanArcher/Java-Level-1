package com.black.assessment;

class StockItem
{


	// declare properties

    String name;
    double price;
    int stock, order;
	

	// define constructor method

	public StockItem(String n, double pr, int stk, int order)
	{
        name = n;
        price = pr;
        stock = stk;
        this.order = order;
	
	}


	public void printStockItem()
	{
        System.out.println(name + "\t" + price + "\t" + stock + "\t" + order);
	
	}

    public void main(String[] args)
    {
        StockItem stock1,stock2,stock3,stock4, stock5;

        //Assign Stock
        stock1 =new StockItem("Milk 2L semi",1.79,12,30);
        stock2 =new StockItem("Teabags 100",3.45,20,0);
        stock3 =new StockItem("Coffee 200g",4.75,0,10);
        stock4 =new StockItem("Mars bar med",0.65,50,100);
        stock5 =new StockItem("Orange Juice",1.15,12,0);

        stock1.printStockItem();

    }



}
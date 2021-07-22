/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package MarketChallenge;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Map;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	private static StockList stockList = new StockList(); 
	public static void main(String[] args){
		StockItem temp = new StockItem("Bread", 0.86, 100);
		stockList.addStock(temp);

		temp = new StockItem("Cake", 1.10, 7);
		stockList.addStock(temp);

		temp = new StockItem("ToyCar", 12.50, 2);
        stockList.addStock(temp);

		temp = new StockItem("Chair", 52.10, 10);
        stockList.addStock(temp);

		temp = new StockItem("Cup", 0.50, 100);
        stockList.addStock(temp);

		temp = new StockItem("Juice", 2.10, 25);
        stockList.addStock(temp);

		temp = new StockItem("Phone", 96.99, 8);
        stockList.addStock(temp);

		temp = new StockItem("Towel", 3.70, 12);
        stockList.addStock(temp);

		temp = new StockItem("Cup", 0.45, 100);
        stockList.addStock(temp);

		System.out.println(stockList);

		Basket user1Basket = new Basket("User1");
		sellItem(user1Basket, "ToyCar", 1);
		sellItem(user1Basket, "Juice", 2);
		sellItem(user1Basket, "Chair", 1);
		sellItem(user1Basket, "Towel", 1);
		sellItem(user1Basket, "Fries", 5);
		sellItem(user1Basket, "ToyCar", 10);
		sellItem(user1Basket, "Juice", 1);
		sellItem(user1Basket, "Cake", 5);
		removeItem(user1Basket, "ToyCar", 2);

		System.out.println(user1Basket);

		/* The unmodifiable list means list is unmodifiable, not the 
		   values of its elements' fields.
		 */
		stockList.Item().get("ToyCar").adjustStock(110);
		stockList.get("ToyCar").adjustStock(-50);			// Both are true
		System.out.println(stockList);

		Basket user2Basket = new Basket("User2");
		sellItem(user2Basket, "ToyCar", 3);
        sellItem(user2Basket, "Juice", 5);
        sellItem(user2Basket, "Chair", 2);
        sellItem(user2Basket, "Towel", 1);
        sellItem(user2Basket, "Fries", 5);
		sellItem(user2Basket, "Phone", 1);
        sellItem(user2Basket, "ToyCar", 15);
        sellItem(user2Basket, "Juice", 10);
		sellItem(user1Basket, "Cake", 2);
		removeItem(user1Basket, "Cake", 2);
		removeItem(user1Basket, "Chair", 2);

		System.out.println(user1Basket);
		System.out.println(stockList);

		checkOut(user1Basket);
		checkOut(user2Basket);
		System.out.println(user1Basket);
		System.out.println(user2Basket);

		for( Map.Entry<String, Double> price : stockList.PriceList().entrySet() ){
			System.out.println(price.getKey() + " costs " + price.getValue());
		}
	}

	public static int sellItem(Basket basket, String itemName, int quantity){
		StockItem item = stockList.get(itemName);

		if ( item == null ){
			System.out.println("We don't sell " + itemName );
			return 0;
		}

		if ( stockList.reserveStock(itemName, quantity) != 0 ){
			return basket.addToBasket(item, quantity);
		}

		return 0;
	}
	
	public static int removeItem(Basket basket, String itemName, int quantity){
		StockItem item = stockList.get(itemName);

		if ( item == null ){
			System.out.println("We don't sell " + itemName );
			return 0;
		}

		if ( stockList.reserveStock(itemName, quantity) != 0 ){
			return stockList.unreserveStock(itemName, quantity);
		}

		return 0;
	}
	
	public static void checkOut(Basket basket){
		for ( Map.Entry<StockItem, Integer> item : basket.Items().entrySet() ){
			stockList.sellStock(item.getKey().getName(), item.getValue());
		}
		basket.clearBasket();
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

				NOTE:
					The Collections.unmodifiable(list) returns a read only form of list.
					i.e. the list cannot be edited or modified (viz. no adding or deleteing
					of elements of the list).
					However, the elemets' fields are modifiable i.e.
					unmodifiableList.get(elementKey).updateSomeField(newValue) is possible.


Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package MarketChallenge;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collections;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class StockList{
	private final Map<String,StockItem> stockList;

	public StockList(){
		stockList = new LinkedHashMap<>();
	}

	public int addStock(StockItem item){
		if ( item != null ){
			/* getOrDefault will return the item if it already exits in the map or
				return item(2nd parameter), the default value. Thus inStock will have
				one object after execution of the method. */
			StockItem inStock = stockList.getOrDefault(item.getName(), item);
			
			// Check if the item was already in the list
			if ( inStock != item ){
				item.adjustStock(inStock.getQuantityStock());
			}
		
			/* The above check can also be implemented as follows: 
				--------
				StockItem inStock = stockList.get(item.getName());
				if ( inStock != null ){
					item.adjustStock(inStock.getQuantityStock());
				}
				-------
				its just the matter of implementation
			 */

			stockList.put(item.getName(), item);

			return item.getQuantityStock();
		}

		return 0;
	}

	public int reserveStock(String itemName, int quantity){
		if ( (itemName == null) || (quantity <= 0 )){
			return 0;
		}

		StockItem inStock = stockList.get(itemName);
		if ( inStock != null ){
			if ( inStock.getQuantityStock() >= quantity ){
				return inStock.reserveStock(quantity);
			}
		}

		return 0;
	}

	public int unreserveStock(String itemName, int quantity){
		if ( (itemName == null) || (quantity <= 0) ){
			return 0;
		}

		StockItem inStock = stockList.get(itemName);
		if ( inStock != null ){
			if ( inStock.getReserveStock() >= quantity ){
				return inStock.unreserveStock(quantity);
			}
		}

		return 0;
	}

	public int sellStock(String itemName, int quantity){
		if ( itemName == null || quantity <= 0 ){
			return 0;
		}

		StockItem inStock = stockList.get(itemName);
		if ( inStock != null ){
			if ( inStock.getQuantityStock() >= quantity){
				return inStock.finaliseStock(quantity);
			}
		}

		return 0;
	}

	public StockItem get(String key){
		return stockList.get(key);
	}

	public Map<String, Double> PriceList(){
		Map<String, Double> prices = new LinkedHashMap<>();
		for(Map.Entry<String, StockItem> item : stockList.entrySet() ){
			prices.put(item.getKey(), item.getValue().getPrice());
		}

		return Collections.unmodifiableMap(prices);
	}

	public Map<String, StockItem> Item(){
		/* 
			java.util.Collections class is used to return an unmodifiable view 
			of the specified map. This method allows modules to provide 
			users with “read-only” access to internal maps. Query operations 
			on the returned map “read through” to the specified map, and 
			attempts to modify the returned map, whether direct or via its 
			collection views, result in an UnsupportedOperationException.
		   */
		return Collections.unmodifiableMap(stockList);
	}

	@Override
	public String toString(){
		String s = "\nStock List\n";
		double totalCost = 0;

		for ( Map.Entry<String, StockItem> i: stockList.entrySet() ){
			StockItem item = i.getValue();
			double itemValue = item.getPrice() * item.getQuantityStock();
			s += item + ". There are " + item.getQuantityStock() + " in stock." +
					" Value of items: " + String.format("%.2f",itemValue) + "\n";
			totalCost += itemValue;
		}

		return s + "Total stock value " + totalCost;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

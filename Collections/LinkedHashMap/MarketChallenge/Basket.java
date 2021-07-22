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
import java.util.TreeMap;
import java.util.Collections;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Basket{
	private final String name;
	private final Map<StockItem,Integer> list;

	public Basket(String name){
		this.name = name;

		/* Note: Tree map is a sorted map, while the HashMap and Map are
		   unsorted. This results to performance degradation while using 
		   Tree Map due to the sort done everytime an entry is made to map.
		 */
		list = new TreeMap<>();
	}

	public int addToBasket(StockItem item, int quantity){
		if ( item != null && quantity > 0 ){
			int inBasket = list.getOrDefault(item, 0);
			inBasket += quantity;
			list.put(item, inBasket);
			return inBasket;
		}
		return 0;
	}

	public int removeFromBasket(StockItem item, int quantity){
		if ( item != null && quantity > 0 ){
			int inBasket = list.getOrDefault(item, 0);
			int newQuantity = inBasket - quantity;

			if ( newQuantity > 0 ){
				list.put(item, newQuantity);
				return newQuantity;
			}else if ( newQuantity == 0 ){
				list.remove(item);
				return 0;
			}
		}
		return 0;
	}

	public void clearBasket(){
		this.list.clear();
	}

	public Map<StockItem, Integer> Items(){
		return Collections.unmodifiableMap(list);
	}

	@Override
	public String toString(){
		String s = "\nShopping basket " + name + " contains " + list.size(); 
		s += (list.size()==1)? " item":" items" + "\n";
		double totalCost = 0;

		for ( Map.Entry<StockItem, Integer> i : list.entrySet() ){
			s = s + i.getKey() + ". " + i.getValue() + " purchased\n";
			totalCost += i.getKey().getPrice() * i.getValue();
		}
					
		return s + "Total cost " + totalCost;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

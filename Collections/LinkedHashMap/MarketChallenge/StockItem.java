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

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class StockItem implements Comparable<StockItem>{
	private final String name;
	private double price;
	private int quantityStock;
	private int reservedStock=0;

	public StockItem(String name, double price){
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}

	public StockItem(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantityStock = quantity-reservedStock;
    }

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}

	public int getReserveStock(){
		return reservedStock;
	}

	public int getQuantityStock(){
		return quantityStock - reservedStock;
	}
	
	public void setPrice(int price){
		if ( price > 0 ){
			this.price = price;
		}	
	}

	// Negative value of the quantity will unreserve
	public int reserveStock(int quantity){
		int availableStock = quantityStock - reservedStock;
		if ( (availableStock > 0) && ( availableStock >= quantity)){
			reservedStock += quantity;
			return reservedStock;
		}

		return 0;
	}

	public int unreserveStock(int quantity){
		if ( (quantity > 0) && ( quantity <= reservedStock ) ){
			reservedStock -= quantity;
			return reservedStock;
		}

		return 0;
	}

	public void adjustStock(int quantity){
		int newQuantity = this.quantityStock + quantity;

		if ( newQuantity > 0 ){
			this.quantityStock = newQuantity;
		}
	}

	public int finaliseStock(int quantity){
		if ( quantity <= reservedStock){
			quantityStock -= quantity;
			reservedStock -= quantity;
			return quantity;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj){
		System.out.println("Entering StockItem equals");
		if (this == obj ){
			return true;
		}

		if ( obj == null || this.getClass() != obj.getClass() ){
			return false;
		}

		String objName = ((StockItem) obj).getName();
		return this.name.equals(objName);
	}		

	@Override
	public int hashCode(){
		return this.name.hashCode() + 47;
	}

	@Override
	public int compareTo(StockItem o){
		//System.out.println("Entering StockItem.compareTo() " + name );

		if ( this == o ){
			return 0;
		}

		if ( o != null ){
			return this.name.compareTo(o.getName() );
		}

		throw new NullPointerException();
	}

	@Override
	public String toString(){
		return this.name + " : price " + this.price + ". Reserved: " + reservedStock;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/**************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package Banking;


import java.util.ArrayList;

/* Functions ****************************************************************************** @{
   */

public class Customer{
	private String name;
	private ArrayList<Double> transactions;

	public Customer (String name, double initial){
		this.name = name;
		transactions = new ArrayList<Double>();

		if ( initial < 0 ){
			System.out.println("Initial value can't be negative. Resetting it to 0");
			initial = 0;
		}

		transactions.add(initial);
	}

	public String getName(){
		return this.name;
	}

	public ArrayList<Double> getTransactions(){
		return this.transactions;
	}

	public void addTransaction(double value){
		transactions.add(value);
	}

	public void printTransactions(){
		for ( int i=0; i < transactions.size(); i++){
			System.out.println("\t\t"+ (i+1) + ". " + transactions.get(i));
		}
	}
}



/* @}
   */

/* ~~~~~ END OF FILE ~~~~~ */

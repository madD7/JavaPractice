/**************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package Banking;

import Banking.*;
import java.util.ArrayList;

/* Functions ****************************************************************************** @{
   */

public class Branch{
	private String name;
	private ArrayList<Customer> customerDetails;

	public Branch(String name){
		this.name = name;
		customerDetails = new ArrayList<Customer>();
	}

	public String getName(){
		return this.name;
	}
	
	public boolean addCustomer(String name, double value){
		if ( findCustomer(name) >= 0 ){
			System.out.println(name + " customer already exists");
			return false;
		}

		Customer newCustomer = new Customer(name, value);
		customerDetails.add(newCustomer);
		return true;
	}

	public boolean addNewTransaction(String name, double value){
		int pos = findCustomer(name);
		if ( pos < 0 ){
			System.out.println("Customer " + name + " doesn't exists.");
			return false;
		}

		customerDetails.get(pos).addTransaction(value);
		return true;
	}

	public void listCustomers(boolean showTransactions){
		System.out.println("Customer list for Branch - " + this.name);
		for ( int i=0; i < customerDetails.size(); i++){
			Customer temp = customerDetails.get(i);

			System.out.println("\t" + (i+1) + ". " + temp.getName());
			if ( showTransactions ){
				temp.printTransactions();
			}
		}
	}

	private int findCustomer(Customer customer){
		return this.customerDetails.indexOf(customer);
	}

	private int findCustomer(String name){
		for (int i=0; i < this.customerDetails.size(); i++){
			Customer temp = customerDetails.get(i);

			if ( temp.getName().equals(name)){
				return i;
			}
		}

		return -1;
	}
}



/* @}
   */

/* ~~~~~ END OF FILE ~~~~~ */

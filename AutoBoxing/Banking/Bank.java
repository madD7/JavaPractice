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

public class Bank{
	private String name;
	private ArrayList<Branch> branchList;

	public Bank(String name){
		this.name = name;

		branchList = new ArrayList<Branch>();
	}

	public String getName(){
		return this.name;
	}

	public boolean addBranch(String name){
		if( findBranch(name) >= 0 ){
			System.out.println(name + " branch already exists");
			return false;
		}
		
		Branch temp = new Branch(name);
		branchList.add(temp);
			
		return true;
	}

	public boolean addCustomer(String branchName, String customerName, double initialTransaction){
		int pos =  findBranch(branchName); 
		if ( pos < 0 ){
			System.out.println(branchName + " branch doesn't exists");
			return false;
		}

		System.out.println("Adding customer to branch " + branchName);
		return branchList.get(pos).addCustomer(customerName, initialTransaction);
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double transactionValue){
		int pos = findBranch(branchName);

		if ( pos < 0 ){
			System.out.println( branchName + " branch doesn't exists");
			return false;
		}

		System.out.println("Updating transaction for " + customerName );
		return branchList.get(pos).addNewTransaction(customerName, transactionValue);
	}

	public void listBranch(boolean showCustomers, boolean showTransactions){
		System.out.println("Branch list for bank - " + this.name);
		for ( int i=0; i < branchList.size(); i++){
			Branch temp =  branchList.get(i);

			System.out.println((i+1) + ". " + temp.getName());

			if ( showCustomers ){
				temp.listCustomers(showTransactions);
			}
		}
	}

	private int findBranch(String name){
		for ( int i=0; i < branchList.size(); i++){
			Branch temp = branchList.get(i);

			if ( temp.getName().equals(name) ){
				return i;
			}
		}

		return -1;
	}
}



/* @}
   */

/* ~~~~~ END OF FILE ~~~~~ */

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

public class Main{
	public static void main(String[] Args){
		System.out.println("Welcome to Basic Banking");

		Bank BOI = new Bank("Bank of India");
		BOI.addBranch("Mulund");
		BOI.addCustomer("Mulund", "Tony Stark", 3000.0);
		BOI.addCustomer("Mulund", "Steve Rogers", 1999.9);
		BOI.addCustomer("Mulund", "Natasha Romanoff", 2000.2);
		BOI.addCustomer("Mulund", "Bruce Banner", 2389.17);

		BOI.listBranch(true,true);
		BOI.addCustomerTransaction("Mulund", "Steve Rogers", 22.14);
		BOI.addCustomerTransaction("Mulund", "Steve Rogers", 171.16);
		BOI.addCustomerTransaction("Mulund", "Natasha Romanoff", -324.2);
		BOI.listBranch(true,true);

	}
}



/* @}
   */

/* ~~~~~ END OF FILE ~~~~~ */

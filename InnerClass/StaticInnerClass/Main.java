/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

				

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package StaticInnerClass;

/* Import Libraries **************************************************************************
 * @{
 */

import java.util.Map;
import java.util.HashMap;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{

	public static void main(String[] args){
		Map<CustomerDetails.Key, CustomerDetails>  details = new HashMap<>();

		CustomerDetails customer = new CustomerDetails("Sachin", "Tendulkar", "Mumbai");
		details.put(customer.getKey(), customer);
		customer = new CustomerDetails("Rahul", "Dravid", "Bangluru");
		details.put(customer.getKey(), customer);
		customer = new CustomerDetails("Saurav", "Ganguly", "Kolkata");
		details.put(customer.getKey(), customer);

		System.out.println("\nList of Customer");
		for ( CustomerDetails.Key k: details.keySet() ){
			System.out.println(k.toString());
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Example code to understand scope of variables.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package ScopeExample;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Scanner;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{

	public static void main(String[] args){

		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		
		if ( scanner.hasNextInt()){
			X x = new X (scanner.nextInt());

			x.x();
		}	
	}

}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

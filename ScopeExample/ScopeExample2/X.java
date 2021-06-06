/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Dont use the naming conventions used in this example code.
				This example code is designed to understand the scope of variables, methods etc

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package ScopeExample2;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Scanner;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class X{
	private int x;

	public X(Scanner x){
		System.out.println("Enter a number ");
		if ( x.hasNextInt()){
			this.x = x.nextInt();
		}
	}

	public void x(){
		System.out.println( this.x + " Table " );
		
		for (int x=0; x<13;x++){
			System.out.println( this.x + " times " + x + " = " + (this.x*x));
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

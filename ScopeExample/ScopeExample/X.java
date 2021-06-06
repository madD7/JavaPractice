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

package ScopeExample;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class X{
	private int x;

	public X(int x){
		this.x = x;
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

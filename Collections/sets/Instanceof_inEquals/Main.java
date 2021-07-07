/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package Instanceof_inEquals;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{

	public static void main(String[] args){
		Dog jackie = new Dog("Jackie");
		Labrador myJackie = new Labrador("Jackie");

		System.out.println(jackie.equals(myJackie));
		System.out.println(myJackie.equals(jackie));
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

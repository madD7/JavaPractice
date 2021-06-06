/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/


/* Import Libraries **************************************************************************
 * @{
 */
import com.newpackage.*;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	public static void main(String[] args){

		for (int i=0; i<11; i++){
			System.out.print("Sumation("+i+") = "+ Series.nSum(i));
			System.out.print("\tFactorial("+i+") = " + Series.factorial(i));
			System.out.println("\tFibonacci("+i+") =" + Series.fibonacci(i));
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

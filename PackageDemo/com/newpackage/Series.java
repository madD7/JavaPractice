/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   : Creating a jar and using it in another project

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package com.newpackage;


/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Series{
	public static long nSum(int n){
		int sum=0;
		for ( int i=1; i <= n; i++){
			sum += i;
		}

		return sum;
	}

	public static long factorial(int n){
		int factorial=1;

		if ( n == 0)
			return 0;

		for ( int i=1; i <= n; i++){
			factorial *= i;
		}

		return factorial;
	}

	public static long fibonacci(int n){
		int n_1=0, n_2=1;
		int fibonacci=0;

		if ( n < 2 )
			return n;

		for (int i=1; i<n; i++){
			fibonacci = n_2 + n_1;
			n_1 = n_2;
			n_2 = fibonacci;
		}

		return fibonacci;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

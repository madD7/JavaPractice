/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

				Child class of Dog.

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

public class Labrador extends Dog{
	public Labrador(String name){
		super(name);
	}

	/*
		If the equals method is not Overrode, then the 
		equals method of the parent is called, which 
		compares the instance of Labrador to Dog class
		and thus returns true.
	*/
	@Override
	public boolean equals(Object obj){
		if ( this == obj ){
			return true;
		}

		System.out.println("Checking if obj is instance of Labrador");
		// Will return false if obj is of Dog class
		if ( obj instanceof Labrador ){
			String objName = ((Labrador)obj).getName();
			return this.getName().equals(objName);
		}

		return false;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

				Using instanceof in the comparision of the equals method.

				using instanceof comparision to determine the equality will violate symmetricity
	            for parent-child objects.

    	        childObj.equals(parentObj) returns true, yet the parentObj.equals(childObj)
        	    may return false, if the child objects contains more its own extra fields.

            	This will violate the Symmetry ccndition,
	            if instanceof check is implemented instead of getClass()

	            Sample code:-

    	        if ( this instanceof inputObj )
        	        return true;
	            else
    	            false;


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

public class Dog{
	private final String name;

	public Dog(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	/*	If this method is made final, it wont be Overrode in the 
		subclass. Thus the equals method will return true, ie 
		satisfy symmetric characteristic.
	*/
	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}

		System.out.println("Check if obj is instance of Dog");
		if ( obj instanceof Dog ){
			String objName = ((Dog)obj).getName();

			return this.getName().equals(objName);
		}

		return false;
	}
}

/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

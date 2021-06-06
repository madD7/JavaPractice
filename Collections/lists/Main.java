/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package lists;

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
		Theatre pvr = new Theatre("PVR", 17, 30);

		pvr.getSeats();
		pvr.reserveSeat("A10");
		pvr.reserveSeat("A10");
		
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

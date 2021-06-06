/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				To demonstrate usage of the local inner class

				The button class, is used to print some string at the event, buttonClick

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package AnonymousClass;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Button{
	private String title;
	private OnClickListner onClick;

	public Button(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
	
	public void setOnClickListner(OnClickListner onClick){
		this.onClick = onClick;
	}

	
	public void onButtonClick(){
		this.onClick.onButtonClick(this.title);
	}
	

	/* Inner Interface. Not a local.
	 	Note: Access modifier = public. */
	public interface OnClickListner{
		public void onButtonClick(String title);
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

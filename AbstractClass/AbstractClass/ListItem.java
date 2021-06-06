/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package AbstractClass;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public abstract class ListItem{
	protected ListItem next = null;
	protected ListItem previous = null;
	protected Object value;

	public ListItem(Object value){
		this.value = value;
	}

	abstract ListItem next();
	abstract ListItem setNext(ListItem next);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem previous);
	abstract int compareTo(ListItem item);

	public Object getValue(){
		return value;
	}

	public void setValue(Object value){
		this.value = value;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

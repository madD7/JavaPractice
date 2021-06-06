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

public class Node extends ListItem{

	public Node(Object value){
		super(value);
	}

	@Override 
	ListItem next(){
		return this.next;
	}

	@Override
	ListItem previous(){
		return this.previous;
	}

	@Override 
	ListItem setNext(ListItem next){
		this.next = next;
		return this.next;
	}

	@Override
	ListItem setPrevious(ListItem previous){
		this.previous = previous;
		return this.previous;
	}

	@Override
	int compareTo(ListItem item){
		if ( item != null){
			return ((String) super.getValue()).compareTo((String)item.getValue());
		}
		else
			return -1;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

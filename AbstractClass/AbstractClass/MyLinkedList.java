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

public class MyLinkedList implements NodeList{
	private ListItem root = null;

	public MyLinkedList(ListItem root){
		this.root = root;
	}

	@Override
	public ListItem getRoot(){
		return root;
	}

	@Override
	public boolean addItem(ListItem newItem){
		if ( this.root == null ){
			this.root = newItem;
			return true;
		}

		ListItem currItem = this.root;
		
		while( currItem != null ){
			int compare = currItem.compareTo(newItem);

			if ( compare < 0 ){ // NewItem is greater than CurrItem, move to right
				if ( currItem.next() == null ){
					currItem.setNext(newItem);
					newItem.setPrevious(currItem);
					
					/* As the setNext is returning the ListItem, the above two statments can be combined as shown.*/
					/* currItem.setNext(newItem).setPrevious(currItem); */
					return true;
				}else{
					currItem = currItem.next();
				}
			}else if ( compare > 0 ){ // NewItem is smaller than CurrItem, move to left
				if ( currItem.previous() == null ){	// We are at root. Operation sequence is important
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}else {
					/* Insert newItem between the two nodes
						B -> C		== old
						B -> N -> C	== new
					*/
					currItem.previous().setNext(newItem);
					newItem.setPrevious(currItem.previous());
					currItem.setPrevious(newItem);
					newItem.setNext(currItem);
				}
				return true;
			}else {
				System.out.println(newItem.getValue() + " is already present");
				return false;
			}
		}

		return true;
	}

	@Override 
	public boolean removeItem(ListItem item){	
		if ( this.root == null ){
			System.out.println("The list is empty");
			return false;
		}

		ListItem currItem = this.root;

		while( currItem != null ){
			int compare = currItem.compareTo(item);

			System.out.println("Value " + currItem.getValue());
			if ( compare == 0 ){
				if ( currItem.previous() == null ){
					this.root = currItem.next();
					currItem.next().setPrevious(null);
				}else if ( currItem.next() == null ){
					currItem.previous().setNext(null);
				}
				else {
					currItem.previous().setNext(currItem.next());
					currItem.next().setPrevious(currItem.previous());
				}
				return true;
			}

			currItem = currItem.next();
		}

		return false;
	}

	@Override
	public void traverse(ListItem root){
		if ( root == null ){
			System.out.println("The list is empty");
			return;
		}
		
		while ( root != null ){
			System.out.println(root.getValue());
			root = root.next();
		}
	}

}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

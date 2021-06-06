/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Implements binary search tree
				A binary search tree has limitation of unbalanced nodes.
				To over come the limitation, a height balance search tree is used.

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

public class SearchTree implements NodeList {
	private ListItem root = null;

	public SearchTree(ListItem root){
		this.root = root;
	}

	@Override
	public ListItem getRoot(){
		return root;
	}

	@Override
    public boolean addItem(ListItem item){
		if ( root == null ){
			this.root = item;
			return true;
		}

		ListItem currItem = root;
		while ( currItem != null ){
			int compare = currItem.compareTo(item);
			
			if ( compare == 0 ){
				System.out.println("The item already exists");
				return false;
			}else if ( compare < 0 ){// The new item is greater than curritem
				if ( currItem.next() == null ){
					currItem.setNext(item);
					return true;
				}else{
					currItem = currItem.next();
				}
			}else {		// The new Item is less than currItem
				if ( currItem.previous() == null ){
					currItem.setPrevious(item);
					return true;
				}else{
					currItem = currItem.previous();
				}
			}
		}

		return false;
	}

	private void deleteNode(ListItem item, ListItem parent){
		if ( item.next() == null ){		// End of the tree, we are at the right most node
			if ( parent.next() == item ){	// Right node of the parent is our match
				parent.setNext(item.previous());
			}else if ( parent.previous() == item){
				parent.setPrevious(item.previous());
			}else{
				this.root = item.previous();
			}
		} else if ( item.previous() == null ){
			if ( parent.next() == item ){
				parent.setNext(item.next());
			}else if ( parent.previous() == item ){
				parent.setPrevious(item.next());
			}else{
				this.root = item.next();
			}
		} else{ // Neither the left or the right are null
			ListItem curr = item.next();
			ListItem leftParent = item;

			while ( curr.previous() != null ){
				leftParent = curr;
				curr = curr.previous();
			}

			item.setValue(curr.getValue());
			if ( leftParent == item){
				item.setNext(curr.next());					
			}else {
				leftParent.setPrevious(curr.next());
			}
		}
	}

	@Override
    public boolean removeItem(ListItem item){
		if ( item != null ){
			System.out.println("Deleting item " + item.getValue());
		}
		
		ListItem currItem = this.root;
		ListItem parentItem = currItem;

		while ( currItem != null ){
			int compare = currItem.compareTo(item);

			if ( compare < 0 ){ // Item to delete is greater than currItem
				parentItem = currItem;
				currItem = currItem.next();
			}else if ( compare > 0 ){ // Item to delete is lesser than currItem
				parentItem = currItem;
				currItem = currItem.previous();
			}else{	// Found item to delete
				deleteNode(currItem, parentItem);
				return true;
			}
		}

		return false;
	}

	@Override
    public void traverse(ListItem root){
		if ( root != null ){
			traverse(root.previous());
			System.out.println("Curr " + root.getValue() );
			traverse(root.next());		
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

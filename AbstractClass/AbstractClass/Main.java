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

public class Main{
	public static void main(String[] args){
		MyLinkedList list = new MyLinkedList(null);
		
		list.traverse(list.getRoot());

		String placeNames = "Mumbai,New Delhi,Kolkata,Chennai";
		String[] places = placeNames.split(",");
		for ( String s : places ){
			System.out.println("Adding " + s );
			if ( ! list.addItem(new Node(s)) ){
				System.out.println("Unable to add " + s );
			}
		}

		list.traverse(list.getRoot());

		if ( list.removeItem(new Node("Mumbai")) == false ){
			System.out.println("Unable to remove Mumbai " );
		}else{
			System.out.println("Mumbai removed succussfully\n");
		}

		list.traverse(list.getRoot());

		if ( list.removeItem(new Node("New Delhi")) == false ){
            System.out.println("Unable to remove New Delhi " );
        }else{
            System.out.println("Mumbai removed succussfully\n");
        }

        list.traverse(list.getRoot());

		SearchTree tree = new SearchTree(null);

		tree.traverse(tree.getRoot());

		String numbers = "0 1 2 3 4 5 6 7 8 9";
		String numArry[] = numbers.split(" ");
		for ( String num : numArry ){
			if ( !tree.addItem(new Node(num))){
				System.out.println("Unable to add " + num );
			}
		}

		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("3"));
		tree.traverse(tree.getRoot());

	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

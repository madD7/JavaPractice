/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package PrivateInnerClass;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.ArrayList;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	public static void main(String[] Args){
		Quadrilateral quad1 = new Quadrilateral("Quad0");
		quad1.addVertex(0,5);
		quad1.addVertex(5,5);
		quad1.addVertex(5,0);
		quad1.addVertex(0,0);
		System.out.println("Is Quad0 Quadrilateral? " + quad1.isQuadrilateral());
		quad1.printVertices();

		/*Store the vertex temporarily. We will use this to get the 
		  reference to the outer class object later in the code.
		*/
		Quadrilateral.Vertex quad0Vertex0 = quad1.getFirstVertex();
		System.out.println(quad0Vertex0.toString());
	
		System.out.println("\nDefining Quad1");
		quad1 = new Quadrilateral("Quad1");

		quad1.addVertex(0,2);
		quad1.addVertex(2,2);

		System.out.println("Is Quadrilateral? " + quad1.isQuadrilateral());

		quad1.addVertex(2,0);
		quad1.addVertex(0,0);
		System.out.println("Is Quadrilateral? " + quad1.isQuadrilateral());

		System.out.println("Is Rhombus? " + quad1.checkIsRhombus());

		quad1.printVertices();
		quad1.addVertex(2,3);

		quad1 = new Quadrilateral("Quad2");

        quad1.addVertex(0,2);
        quad1.addVertex(0,2);

        System.out.println("Is Quadrilateral? " + quad1.isQuadrilateral());

        quad1.addVertex(2,0);
        quad1.addVertex(0,0);
        System.out.println("Is Quadrilateral? " + quad1.isQuadrilateral());

        System.out.println("Is Rhombus? " + quad1.checkIsRhombus());

        quad1.printVertices();

		if ( quad0Vertex0 != null ){
			System.out.println("Now, taking the reference of the non-static outer class object" + 
							"\nfrom the non-static inner class object. Printing all its vertices");
			/* This demonstrates that the reference of the non-static outerclass can be 
			   accessed from the non-static inner class.
		 	*/
			quad1 = quad0Vertex0.getOuterClass();
			quad1.printVertices();
		}

	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

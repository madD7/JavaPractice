/**************************************** MAD Engineers ***************************************
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
		Quadrilateral quad1 = new Quadrilateral("Quad1");

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
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

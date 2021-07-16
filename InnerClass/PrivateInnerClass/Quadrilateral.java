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

public class Quadrilateral{	 
	private String name;
	private double sideLength;
	private ArrayList<Vertex> vertices;
	private final int maxVertices = 4;
	private boolean isRhombus;

	public Quadrilateral(String name){
		this.name = name;
		this.vertices = new ArrayList<Vertex>();
		isRhombus = false;
	}

	public double getSideLength(){
		return sideLength;
	}

	public String getName(){
		return name;
	}

	public boolean isAllVertices(){
		if ( vertices.size() < this.maxVertices ){
            System.out.println("All vertices are not added");
            return false;
        }

		return true;
	}

	public Vertex getFirstVertex(){
		if ( vertices.isEmpty() ){
			return null;
		}

		return vertices.get(0);
	}

	public boolean addVertex(int x, int y){
		if (  vertices.size() >= this.maxVertices  ) {
			System.out.println("All vertices are already defined");
	        return false;
		}

		vertices.add( new Vertex(x,y));
		return true;	
	}

	private double getDistance(Vertex A, Vertex B){
		double sqr1 = Math.pow(A.getPointX()-B.getPointX(), 2);
		double sqr2 = Math.pow(A.getPointY()-B.getPointY(), 2);
		return ( Math.sqrt(sqr1 + sqr2));
	}

	public boolean isQuadrilateral(){
		if ( !isAllVertices() ){
			return false;
		}
		
		for (int i=0; i < vertices.size(); i++){
			if ( getDistance(vertices.get(i), vertices.get( i==(this.maxVertices-1)?0:i+1)) <= 0 ){
				System.out.println("The distance between vertices " + i + " & " + (i+1) + " is 0");
				return false;
			}
		}
		return true;
	}

	public boolean checkIsRhombus(){
		if ( !isAllVertices() ){
            return false;
        }	

		double[] length = new double[this.maxVertices];

		for ( int i=0; i < vertices.size(); i++){
			length[i] = getDistance(vertices.get(i), vertices.get( i==(this.maxVertices-1)?0:i+1));		
		}

		if ( length[0] == length[1] && 
				length[1] == length[2] &&
				length[2] == length[3] ){
			isRhombus = true;			
		}
		else{
			isRhombus = false;
		}
		
		return isRhombus;
	}

	public void printVertices(){
		for ( int i=0; i<vertices.size(); i++){
			System.out.println("Point" + i + " " + vertices.get(i).toString());
		}
	}
	
	// Private inner class
	public class Vertex{
		private int x;
		private int y;
		
		public Vertex(int x, int y){
			this.x = x;
			this.y = y;
		}

		public int getPointX(){
			return this.x;
		}

		public int getPointY(){
			return this.y;
		}

		/*
			The non-static inner class returns the reference to the non-static outer class.
			If the inner class is static, it will not be able to hold the reference to 
			the non-static outer class. 
			Thus compiling the following method will generate error if the Vertex class is
			made static.
		*/
		public Quadrilateral getOuterClass(){
			return Quadrilateral.this;
		}

		@Override
		public String toString(){
			return String.format("X[" + this.x + "] Y[" + this.y + "]");
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

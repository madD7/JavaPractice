package objcompositn;


/**
 * @author madD7
 * Object Composition Demonstration
 * Modeling Cartesian Geometry Segment
 * 
 */

/**
 * Point class 
 */
class Point
{
	int x=0;
	int y=0;
	String name;
	
	Point(int x, int y, String name)
	{
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	void printPoint()
	{
		System.out.println("Co-ordinates of " + this.name + " x:"+this.x+", y:"+this.y);
	}
}



/**
 * Simple Segment class
 * Simple segment has two co-ordinate points, but all are variables. 
 */
class SimpleSegment
{
	int x1=0;
	int y1=0;
	int x2=1;
	int y2=1;
	String name;
	
	SimpleSegment(int x1, int y1, int x2, int y2, String name)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		this.name = name;
	}
	
	void printSimpleSegment()
	{
		System.out.print("Co-ordinates of " + this.name + " x1:"+this.x1+", y1:"+this.y1);
		System.out.println(" and" + " x2:"+this.x2+", y2:"+this.y2);
	}
}



public class ObjCompositn {
	
	public static void main(String[] args)
	{
		SimpleSegment S1 = new SimpleSegment(0, 0, 5, 5, "S1");
		
		S1.printSimpleSegment();
	}
}

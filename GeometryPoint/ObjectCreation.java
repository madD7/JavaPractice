package point;

/**
 * @author madD7
 * Object Creation Demonstration
 * Modeling Cartesian Geometry points
 * 
 */


/**
 * Representing each point as an object, having two variables.
 * But to get objects, we create a class "Point"
 * */
class Point
{
	int x;		// Instance variables
	int y;
	
	/**
	 * Shift in thought process for a C programmer
	 * Delegating work to  the object. 
	 * Hence, objects are capable of knowing as well as doing
	 */
	void movePoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	void print()
	{
		System.out.println("Co-ordinates x:"+this.x+", y:"+this.y);
	}
}

public class ObjectCreation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 2;
		p1.y = 4;
		
		p2.x = 3;
		p2.y = 5;
		
		// Passing message 'print' to the object p1. p1 will print its co-ordinates.
		// 'print' work is delegated to object p1
		p1.print();
		p2.print();
		
		p1.movePoint(6, 7);
		p1.print();
	}

}

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
	private String name;
	
	// Initializing with User defined value
	int x=1;		// Variable description and not a variable - beware C programmer. Dont get fooled.
	int y=1;		//
		
	/* Constructor */
	Point(String name)
	{
		this.name = name;
	}
	
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
		System.out.println("Co-ordinates of " + this.name + " x:"+this.x+", y:"+this.y);
	}
}

public class ObjectCreation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point("p1");
		Point p2 = new Point("p2");
		
		// Printing before initializing, results to (0,0) or User initialized values 
		/*
		 * After heap manager creates the object, initializer is invoked
		 * Initializer, initializes the object to 0
		 * int type variable initializes to 0
		 * float to 0.0
		 * boolean to false
		 * handle to null
		 * */
		p1.print();
		p2.print();
		
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

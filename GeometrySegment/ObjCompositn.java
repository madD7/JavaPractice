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
	private String name;
	
	Point(int x, int y, String name)
	{
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	Point(String name)
	{
		this.name = name;
	}
	
	void print()
	{
		System.out.println("Co-ordinates of " + this.name + " x:"+this.x+", y:"+this.y);
	}
	
	public String toString()
	{
		return this.name;
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
	private String name;
	
	SimpleSegment(int x1, int y1, int x2, int y2, String name)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		this.name = name;
	}
	
	void print()
	{
		System.out.print("Co-ordinates of " + this.name + " x1:"+this.x1+", y1:"+this.y1);
		System.out.println(" and" + " x2:"+this.x2+", y2:"+this.y2);
	}
	
	/* purposely commented to enable printing hashcode
	public String toString()
	{
		return this.name;
	}
	*/
}


/**
 * The composite class has two point objects, actually handles to the objects of Point class
 * The objects handles are initialized to null by the initializer. 
 * Such object composition is known as obj linking, where obj handles are present in an object.
 * Object inside an object, i.e. object embedding is not allowed in java
 * Object linking allows lazy initialization
 * 
 * When an object of type CompositeSegment is created, only the container object is created
 * but not its component objects (start and end).
 * Hence in object linking, proper creation and linking is required.
 */
class CompositeSegment
{
	Point start;
	Point end;
	private String name;		// String name not compulsory 
	
	/** The following execution will result to upfront initialization, i.e. initialization during creation
	 * Point start = new Point();
	 * Point end = new Point();
	 */
	
	/**
	 * I would prefer writing a constructor instead of upfront initialization
	 * */
	CompositeSegment(String name)
	{
		this.name = name;
		this.start = new Point("Start pt of "+name );
		this.end = new Point("End pt of "+name );
	}
	
	void print()
	{
		System.out.print("Co-ordinates of " + this.name + " Start point: x="+this.start.x +", y="+this.start.y);
		System.out.println(" and" + " End point: x="+this.end.x +", y="+this.end.y);
	}
	
	public String toString()
	{
		return this.name;
	}
}



public class ObjCompositn {
	
	public static void main(String[] args)
	{
		SimpleSegment S1 = new SimpleSegment(0, 0, 5, 5, "S1");
		CompositeSegment S2 = new CompositeSegment("S2");
		
		S1.print();
		S2.print();
		S2.start.print();
		S2.end.print();
		
		/* 
		 * Prints value of handle object referenced by the handle - the "hashcode", 
		 * Not the address of variable/object the handle refers to.
		 * C Programmers beware!!
		*/ 
		System.out.println("S1 handle refers to "+ S1);
		
		/*
		 * But if a class has a method named 'toString' with return type String,
		 * then System.out.println prints the string returned by 'toString'
		 * */
		System.out.println("S2.start handle refers to "+ S2.start);
		System.out.println("S2.end handle refers to "+ S2.end);
		
	}
}

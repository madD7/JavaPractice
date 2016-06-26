package objcompositn;


/**
 * @author madD7
 * Object Composition Demonstration
 * Modeling Cartesian Geometry Segment
 * 
 * All the class variables must be private (restricted access) with getter and setter methods
 * Each class has name for printing purpose. This may not be necessary, but helps in demonstration & we will continue this practice. 
 */

/**
 * Point class 
 */
class Point
{
	private int x=0;
	private int y=0;
	private String name;
	
	Point(String name)
	{
		this.name = name;
	}
		
	Point(int x, int y, String name)
	{
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	void print()
	{
		System.out.println("Co-ordinates of " + this.name + " x:"+this.x+", y:"+this.y);
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setX(int x)
	{
		this.x = x;
	}
	
	void setY(int y)
	{
		this.y = y;
	}
	
	int getX()
	{
		return this.x;
	}
	
	int getY()
	{
		return this.y;
	}
}



/**
 * Simple Segment class
 * Simple segment has two co-ordinate points, but all are variables. 
 */
class SimpleSegment
{
	private int x1=0;
	private int y1=0;
	private int x2=1;
	private int y2=1;
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
	private Point start;
	private Point end;
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
	
	CompositeSegment(Point start, Point end, String name)
	{
		this.name = name;
		this.start = start;
		this.end = end;
		
		this.start.setName("Start pt of "+name );
		this.end.setName("End pt of "+name );
	}
	
	CompositeSegment(int sX, int sY, int eX, int eY, String name)
	{
		this.name = name;
		this.start = new Point(sX, sY, "Start pt of "+name );
		this.end = new Point(eX, eY, "End pt of "+name );
	}
	
	void print()
	{
		System.out.print("Co-ordinates of " + this.name + " Start point: x="+this.start.getX() +", y="+this.start.getY());
		System.out.println(" and" + " End point: x="+this.end.getX() +", y="+this.end.getY());
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setStartPt(Point start)
	{
		this.start = start;
	}
	
	void setEndPoint(Point end)
	{
		this.end = end;
	}
	
	Point getStartPt()
	{
		return start;
	}
	
	Point getEndPt()
	{
		return end;
	}
}



public class ObjCompositn {
	
	public static void main(String[] args)
	{
		Point p;
		SimpleSegment S1 = new SimpleSegment(0, 0, 5, 5, "S1");
		CompositeSegment S2 = new CompositeSegment("S2");
		
		S1.print();
		S2.print();
		
		p=S2.getStartPt();
		p.setX(2);
		p.setY(5);
		System.out.println("p handle refers to "+ p);
		S2.print();
		
		p=S2.getEndPt();
		p.setX(7);
		p.setY(6);
		System.out.println("p handle refers to "+ p);
		S2.print();
		
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
		//System.out.println("S2.start handle refers to "+ S2.start);
		//System.out.println("S2.end handle refers to "+ S2.end);
		
	}
}

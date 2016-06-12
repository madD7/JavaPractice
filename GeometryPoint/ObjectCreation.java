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
	int x=9;		// Variable description and not a variable - beware C programmer. Dont get fooled.
	int y=9;		//
		
	/* Constructors
	 * Implicit invocation of initialization, invoked during creation of object.
	 * This, it is called in creation phase of object and not usage phase of object
	 * Implicit invocation means - calling method is not allowed for user
	 * As constructor is implicitly initialized, return type is not required.
	 * 
	 * PS: Life cycle of object - creation phase, usage phase, destruction phase
	 *  */
	Point(String name)
	{
		this.name = name;
	}

	/*
	 * If user doesnt create a constructor, the system creates the constructor, default constructor.
	 * When user creates constructor, user has to write all the possible variations of constructor that user is using in the code\
	 * 
	 * Hence...
	 */
	Point()
	{
		/* 
		 * To check if the initializer is called before constructor
		 * Initializer is called before constructor  in Java & C# but not C++
		 * Though this causes a performance overhead, calling of initializer brefore constructors is advantageous in sense that
		 * 		If variables, more importantly 'reference handle's are left uninitialized by user, (may be due to different constructors, or other reason, what-so-ever),
		 * 		the system ensures that the reference handles point to/are initialized to null.
		*/
		System.out.println("In Constructor Co-ordinates x:"+this.x+", y:"+this.y);
	}
	
	
	/*
	 * init method can be used for initialization.
	 * but it would result to initialization of object variables in its usage phase and not creation phase
	 */
	// init(int x, int y) 
	
	Point(int x, int y)
	{
		// Constructor calling a constructor, but this has to be the first executable statement. 
		// It cant be preceeded by another executable statement. 
		this();
		this.x = x;
		this.y = y;
	}
	
	/*Warning!! this method has constructor name*/
	void Point(String name, int x, int y)
	{
		System.out.println("Though, by the name, the method looks like a constructor, it is not");
		System.out.println("Its a method as it has return tppe, which constructors dont have");
		System.out.println("Beware!! This may be asked in interviews");
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
	
	/*
	 * Instance block (without name)
	 * Object can have multiple instance blocks
	 */
	{
		System.out.println("A block with no name. This is an instance block");
	}
	
	/*
	 * Static block (without name)
	 * Invoked when a class is loaded in memory
	 * Class can have multiple static blocks
	 * 
	 * Pro Alert: Write code in static block and then perform System.exit().
	 * 				main function would no longer be executed.
	 * 				Software thieves can be fooled to an extent using this technique ;)  
	 * */
	
	/*
	 * Another static block
	 * */
	static 
	{
		System.out.println("Another static block. To check if the positioning or occurance in class makes any difference");
	}
	
	static 
	{
		System.out.println("A static block without name.");
		System.out.println("Block positioning is important");
		Point p4 = new Point("p4");
		Point p5 = new Point(12,14);
		
		p4.print();
		p5.print();
		
		p5.movePoint(4,9);
		
		System.exit(0);
	}
	
	
	/*
	 * Yet Another static block
	 * */
	static 
	{
		System.out.println("Yet Another static block. Will not be called due to positioning of code block");
	}
}

public class ObjectCreation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point("p1");
		Point p2 = new Point("p2");
		Point p3 = new Point();
		
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
		
		//p3.Point(); // Explicit calls not allowed
		p3.print();
		
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

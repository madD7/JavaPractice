package reusability;

/**
 * Base class is also known as Parent class
 */
class BaseClass
{
	int a;
	int b;
	
	void print()
	{
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + this.b);
	}
}


/**
 * Child class is also known as DerivedClass
 * 
 */
class DerivedClass extends BaseClass
{
	int c;
	int d;
	
	/**
	 * The child class inherits parent
	 * Hence variables present in parent class are also present in child class.
	 * This is by inheritance. 
	 */
	void printAll()
	{
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + this.b);
		System.out.println("Value of c is " + this.c);
		System.out.println("Value of d is " + this.d);
	}
}


public class Inheritance {
	
	void demoInheritance()
	{
		BaseClass bObj = new BaseClass();
		DerivedClass dObj = new DerivedClass();
		
		bObj.a = 10;
		bObj.b = 20;
		
		dObj.a = 100;
		dObj.b = 200;
		dObj.c = 300;
		dObj.d = 400;
		
		bObj.print();
		
		/**
		 * The methods of the base class are also a part of Child class
		 * */
		dObj.print();
		dObj.printAll();
		
		/* A parent obj can be passed to a parent handle - obvious */
		printBaseClass(bObj);
		
		/* A child obj can be passed to a child handle - obvious */
		printDerivedClass(dObj);
		
		/** A child obj can be passed to a parent handle - Liskov's principle of substitution
		 * This is allowed because child obj has all the variables of parent (child has inherited from parent) 
		 * */
		printBaseClass(dObj);
		
		/** A child obj can be passed to a parent handle - NOT ALLOWED
		 * Because, though child has all the properties of parent onj, vice-versa is not true
		 * i.e. the parent may lack all properties (variables & methods) contained in child.
		 * Hence a child handle cant access variables & methods present only in child (that are not in parent) 
		 */
		//printDerivedClass(bObj);
		
	}
	
	
	/** The method accepts parent class obj and prints its variables
	 * */
	static void printBaseClass(BaseClass var)
	{
		System.out.println("Value of a is " + var.a);
		System.out.println("Value of b is " + var.b);
	}
	
	/** The method accepts child class obj and prints its variables
	 * */
	static void printDerivedClass(DerivedClass var)
	{
		System.out.println("Value of a is " + var.a);
		System.out.println("Value of b is " + var.b);
		System.out.println("Value of c is " + var.c);
		System.out.println("Value of d is " + var.d);
	}
	
}

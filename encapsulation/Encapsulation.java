package encapsulation;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * @author madD7
 *
 * This example is to demonstrate encapsulation
 * Encapsulation is process of wrapping behaviour & state into a single unit.
 * An encapsulated class has only private data members which can only be accessed using getter & setter methods. 
 */


/**
 * Base class is also known as Parent class
 */
class BaseClass
{
	private int a;
	private int b;
	
	void print()
	{
		System.out.println("Print method of Parent class");
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + this.b);
	}
	
	/**
	 * Final keyword prevents the overriding of the method in derived classes
	 * */
	final void printParentVariables()
	{
		System.out.println("printParentVariables method of Parent class");
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + this.b);
	}
	
	void setA(int a)
	{
		this.a = a;
	}
	
	void setB(int b)
	{
		this.b = b;
	}
	
	int getA()
	{
		return this.a;
	}
	
	int getB()
	{
		return this.b;
	}
}


/**
 * Child class is also known as DerivedClass
 * 
 */
class DerivedClass extends BaseClass
{
	private int c;
	private int d;
	
	/**
	 * The child class inherits parent. thus the child class already has 'print' method inherited from parent.
	 * But we can over-ride 'print' function of the parent class using the keyword 'Override' 
	 */
	@Override
	void print()
	{
		System.out.println("Print method of Child class");
		
		/* Though the child class has (owns) variables a & b, 
		 * ownership doesnt gaurantee 'right-to-access'
		 * Direct access of variables inherited from parent class is not allowed*/
		/*
			System.out.println("Value of a is " + this.a); 
		*/
		
		System.out.println("Value of a is " + getA());
		System.out.println("Value of b is " + getB());
		System.out.println("Value of c is " + this.c);
		System.out.println("Value of d is " + this.d);
	}
	
	/*
	// Uncommenting would result to error
	// because cant override final method of parent class 
	@Override
	void printParentVariables()
	{
		System.out.println("printParentVariables method of Child class");
	}
	*/
	
	void setC(int c)
	{
		this.c = c;
	}
	
	void setD(int d)
	{
		this.d = d;
	}
	
	int getC()
	{
		return this.c;
	}
	
	int getD()
	{
		return this.d;
	}
}

/**
 * Final keyword prevents inheritance of the class
 * */
final class FinalBaseClass
{
	int x;
	
	void print()
	{
		System.out.println("Value of x is " + this.x);
	}
}


// Cant inherit a final class
class AnotherChildClass //extends FinalBaseClass
{
	int y;
	
	void print()
	{
		System.out.println("Value of x is " + this.y);
	}
}



public class Encapsulation {

	public static void main(String[] args)
	{
		BaseClass bObj = new BaseClass();
		bObj.setA(5);
		bObj.setB(7);
		
		// This is print method of the parent class
		bObj.print();
		
		DerivedClass dObj = new DerivedClass();
		dObj.setA(10);
		dObj.setB(20);
		dObj.setC(30);
		dObj.setD(40);
		
		// this is print function of the child class, which has been over-rode
		dObj.print();
	}
}

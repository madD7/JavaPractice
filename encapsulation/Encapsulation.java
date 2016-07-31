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
	 * The child class inherits parent
	 * Hence variables present in parent class are also present in child class.
	 * This is by inheritance. 
	 */
	void printAll()
	{
		System.out.println("Value of a is " + getA());
		System.out.println("Value of b is " + getB());
		System.out.println("Value of c is " + this.c);
		System.out.println("Value of d is " + this.d);
	}
	
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



public class Encapsulation {

	public static void main(String[] args)
	{
		BaseClass bObj = new BaseClass();
		bObj.setA(5);
		bObj.setB(7);
		bObj.print();
		
		DerivedClass dObj = new DerivedClass();
		dObj.setA(10);
		dObj.setB(20);
		dObj.setC(30);
		dObj.setD(40);
		
		dObj.print();
		dObj.printAll();
	}

}

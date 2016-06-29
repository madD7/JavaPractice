package reusability;


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


class ChildClass extends BaseClass
{
	int c;
	int d;
	
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
		ChildClass cObj = new ChildClass();
		
		bObj.a = 10;
		bObj.b = 20;
		
		cObj.a = 100;
		cObj.b = 200;
		cObj.c = 300;
		cObj.d = 400;
		
		bObj.print();
		
		/**
		 * The methods of the base class are also a part of Child class
		 * */
		cObj.print();
		cObj.printAll();
	}
}

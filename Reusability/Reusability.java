package reusability;


/**
 * @author madD7
 *
 * The example is to demonstrate re-usability.
 * Object oriented approach for coding is not adopted.  
 */


class Class1
{
	int a;
	int b;
}


class Class2
{
	int a;
	int b;
	int c;
	int d;
}



public class Reusability {
	
	public static void main(String[] Args)
	{
		Class1 obj1 = new Class1();
		Class2 obj2 = new Class2();
		
		obj1.a = 1;
		obj1.b = 2;
		
		obj2.a = 4;
		obj2.b = 5;
		obj2.c = 6;
		obj2.d = 7;
		
		printClass1(obj1);
		printClass2(obj2);
		
	}
	
	static void printClass1(Class1 c)
	{
		System.out.println("Class1 obj variable a = "+c.a);
		System.out.println("Class1 obj variable a = "+c.b);
	}
	
	static void printClass2(Class2 c)
	{
		System.out.println("Class2 obj variable a = "+c.a);
		System.out.println("Class2 obj variable a = "+c.b);
		System.out.println("Class2 obj variable a = "+c.c);
		System.out.println("Class2 obj variable a = "+c.d);
	}

}

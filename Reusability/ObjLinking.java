package reusability;


/**
 * @author madD7
 *
 * The example is to demonstrate re-usability.
 * Object oriented approach for coding is not adopted. 
 * 
 * Reusability using object linking 
 * Disadvantage: If container object is missing, Component is also lost
 */


class Component
{
	int a;
	int b;
}


class Container
{
	Component Obj = new Component();
	
	int c;
	int d;
}



public class ObjLinking {
	
	public static void main(String[] Args)
	{
		Component obj1 = new Component();
		Container obj2 = new Container();
		Inheritance iobj = new Inheritance();
		
		obj1.a = 1;
		obj1.b = 2;
		
		obj2.Obj.a = 4;
		obj2.Obj.b = 5;
		obj2.c = 6;
		obj2.d = 7;
		
		printClass1(obj1);
		printClass2(obj2);
		
		iobj.demoInheritance();
	}
	
	static void printClass1(Component c)
	{
		System.out.println("Class1 obj variable a = "+c.a);
		System.out.println("Class1 obj variable b = "+c.b);
	}
	
	static void printClass2(Container c)
	{
		System.out.println("Container obj component variable a = "+c.Obj.a);
		System.out.println("Container obj component variable b = "+c.Obj.b);
		System.out.println("Container obj variable c = "+c.c);
		System.out.println("Container obj variable d = "+c.d);
	}

}

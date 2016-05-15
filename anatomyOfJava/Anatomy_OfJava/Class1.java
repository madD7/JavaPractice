package anatomyOfJava;

/**
 * @author madD7
 * a simple java program
 */


public class Class1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello world\n");

		Class2.method1();
		
		// Cant call a private method of a Class from other Class
		// Class2.privateMethod1();
	}
	
	// Method1 is not public even if the Class1 is public. To make method public, 'public' keyword must prefix method definition
	// Scope/visibility is limited to package
	static void method1()
	{
		System.out.println("Entering Class1.method1");
		
		// In deployment view, sub package is nested inside parent package
		// But is Module view, parent package can call only the public methods of sub package
		anatomyOfJava.subPackage.Class1.method1();
		
		// Following method call will result to error
		// anatomyOfJava.subPackage.Class1.method2();
		
		System.out.println("Leaving Class1.method1");
	}

}


/*
 *	One .java file can have only one public class
 *	The file name must be same as the public class name 
 */
class Class2
{
	static void method1()
	{
		System.out.println("Entering Class2.method1");
		
		// a private method of a Class can be called from any method of same Class
		privateMethod1();
		
		// Other class method has to be addressed using syntax: <classname>'.'<methodname>
		Class3.method1();
		
		System.out.println("Leaving Class2.method1");
	}
	
	static private void privateMethod1()
	{
		System.out.println("Entering Class2.privateMethod1");
		
		// Non-public class and it non-private methods can be accessed across a package
		// i.e. their scope/visibility is limited to package  
		Class4.method1();
				
		System.out.println("Leaving Class2.privateMethod1");
	}
}

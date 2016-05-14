package anatomyOfJava;


/**
 * @author madD7
 *
 */


/*
 * A package can spread across Multiple classes of multiple .java files
 */

public class Class3 {
	static void method1()
	{
		System.out.println("Entering public Class3.method1");
		
		// a private method call
		privateMethod1();
		
		System.out.println("Leaving Class3.method1");
	}
	
	static private void privateMethod1()
	{
		System.out.println("Entering Class3.privateMethod1");
		
		Class1.method1();
		
		System.out.println("Leaving Class3.privateMethod1");
	}
}




class Class4 {
	static void method1()
	{
		System.out.println("Entering public Class4.method1");
		
		// a private method call
		privateMethod1();
		
		System.out.println("Leaving Class4.method1");
	}
	
	static private void privateMethod1()
	{
		System.out.println("Entering Class4.privateMethod1");
		
		// Only public methods of other packages can be accessed
		newPackage.Class1.method1();
		
		// non-public & private methods of other packages can NOT be accessed
		// Following method call will generate error
		// newPackage.Class1.method2();
		
		System.out.println("Leaving Class4.privateMethod1");
	}
}

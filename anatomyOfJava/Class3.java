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
		
		// If below lines are enabled, then a circular loop of method call will be enabled
		// resulting to 'java.lang.StackOverflowError'
		//Class1.method1();
		
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
		
		System.out.println("Leaving Class4.privateMethod1");
	}
}

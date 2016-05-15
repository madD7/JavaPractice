package newPackage;


/**
 * @author madD7
 * a simple java program
 */

public class Class1 {
	public static void method1()
	{
		System.out.println("Entering newPackage public Class1.method1");
		
		// a private method call
		privateMethod1();
		method2();
		
		System.out.println("Leaving newPackage Class1.method1");
	}
	
	// the scope/visibility of method2 is only valid upto 'newPackage'
	static void method2()
	{
		System.out.println("Entering newPackage Class1.method2");
		
		anatomyOfJava.subPackage.Class1.method1();
		
		System.out.println("Leaving newPackage Class1.method2");
	}
	
	static private void privateMethod1()
	{
		System.out.println("Entering newPackage.Class1.privateMethod1");
		
		System.out.println("Leaving newPackage.Class1.privateMethod1");
	}
}


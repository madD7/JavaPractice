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
		
		// Calling static method1 from class1 main
		// method1 is static. so no instantiating 
		method1();
		Class2.method1();
		
		// Cant call a private method of a Class from other Class
		//Class2.privateMethod1();
	}
	
	static void method1()
	{
		System.out.println("Entering Class1.method1");
		
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
		
		System.out.println("Leaving Class2.method1");
	}
	
	static private void privateMethod1()
	{
		System.out.println("Entering Class2.privateMethod1");
		
		System.out.println("Leaving Class2.privateMethod1");
	}
}

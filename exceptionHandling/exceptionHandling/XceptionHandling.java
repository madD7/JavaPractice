package exceptionHandling;

/**
 * @author madD7
 * a simple java program
 */

public class XceptionHandling
{
	public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling");
        System.out.println("Entering Main ");
        Class1.method1();
        System.out.println("Leaving main");
    }
}


class Class1
{
	static void method1()
	{
		System.out.println("Entering  Class1.method1 ");
        Class2.method1();
        System.out.println("Leaving  Class1.method1 ");
	}
}


class Class2
{
	static void method1()
	{
		int a=1, b=2, c=0;
		int [] ary = new int [10];
		
		System.out.println("Entering  Class2.method1 ");
		
		// Generating an Exception 
		
		//a = b/c;					// Divinding by zero is an Error
		ary[17] = 17;				// Accessing an element that is not in array 
        		
		
		System.out.println("Leaving  Class2.method1 ");
	}
}

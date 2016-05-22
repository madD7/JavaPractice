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
	// Enable/Disable flags to check different cases of try-catch
	static boolean flag1 = true ;
    static boolean flag2 = true ;
    
	static void method1()
	{
		int a=1, b=2, c=0;
		int [] arry = new int[10];
		
		System.out.println("Entering  Class2.method1 ");
		
		// Multiple Exception generating statements will result to execution of the exception that occurs first
		try 
		{
			System.out.println("Entering try");
			
			System.out.println("Divide-by-0 Exception");
			
			if(flag1)
				a = b / c;
			
			// Following Lines will not be executed
			System.out.println("Array-Index-out-of-bounds Exception");
			
			if(flag2)
				arry[17] = 17;
			
			System.out.println("This line is not executed"); 
		}catch (ArrayIndexOutOfBoundsException ar)	// specific Exception-catch block
		{
            System.out.println("Array-index-out-of-bounds Exception caught");
        }
		catch (RuntimeException e)	// general exception-catch block
		{
            System.out.println("Some Exception caught");
        }
		// the catch are executed linearly, considering the first match as best match
		
		System.out.println("Some random print message ");
		System.out.println("Leaving  Class2.method1 ");
	}
}

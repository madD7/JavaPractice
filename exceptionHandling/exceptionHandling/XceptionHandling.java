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
		
		// Multiple Exception generating statements
		try 
		{
			System.out.println("Entering try");
			
			System.out.println("Divide-by-0 Exception");
			
			if(flag1)
				a = b / c;
			
			// Following Lines will not be executed
			System.out.println("Array-out-of-bounds Exception");
			
			if(flag2)
				arry[17] = 17;
			
			System.out.println("This line is not executed"); 
		}catch (ArithmeticException e)
		{
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException ar) 
		{
            System.out.println("ArrayIndexOutOfBoundsException caught");
		}
		
		System.out.println("Some random print message ");
		System.out.println("Leaving  Class2.method1 ");
	}
}

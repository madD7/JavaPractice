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
		String str="ends";
		
		System.out.println("Entering  Class1.method1 ");
        
		// this is nested try-catch (try-catch inside a tri-catch)
		try
		{
			for(int j=10; j>=0; j--)
			{	
				System.out.println("j = "+j);
				
				if(j%5 == 0)
					Class2.method1(j , null);
				else if (j<4)
					Class2.method1(j , "i m 2");
				else
					Class2.method1(j , str);
			}
		}
		// Only Arithmetic Exception will be caught here. 
		// Array-index-out-of-bounds Exception is already caught in the function itself.
		catch(ArithmeticException a)			
		{
			System.out.println("Arithematic Exception caught in Class1.method1 ");
			System.exit(0);
		}
		finally
		{
			// this finally block will not execute due to System.exit
			System.out.println("In Finally block of Class1.method1");
		}
		
		// adjacent try-catch
		// one-after the other
		try
		{
			str.equals("ends");
		}
		catch(RuntimeException n)
		{
			 System.out.println("Some Runtime Exception caught");
		}
		
        System.out.println("Leaving  Class1.method1 ");
	}
}


class Class2
{
	static void method1(int val, String str)
	{
		int a=1, b=2;
		int [] arry = new int[10];
		
		System.out.println("Entering Class2.method1 ");
		
		// Multiple Exception generating statements will result to execution of the exception that occurs first
		try 
		{
			System.out.println("Entering try of Class2.method1");
			
			a = b / val;
			
			arry[val] = val;
			
			for(int x : arry)
			{
				System.out.print(x + " ");
			}
			
			if(str.equals("ends"))
			{
				System.out.println("\nStrings equals ends");
				return;
			}
			else
			{
				System.out.println("str '" + str + "' is not equals 'ends'");
			}
			
			System.out.println("This line is not executed"); 
		}catch (ArrayIndexOutOfBoundsException ar)	// specific Exception-catch block
		{
            System.out.println("Array-index-out-of-bounds Exception caught");
        }
		catch(NullPointerException n)
		{
			 System.out.println("NullPointer Exception caught");
		}
		/*
		 *  the catch are executed linearly, considering the first match as best match
		 *	the specific catches must preceed the general catch
		 *	the acquired resources ( here 'arry') is not released
		 */
		finally
		{
			System.out.println("In Finally block of Class2.method1");
			
			// Release your resources here
			
			if(arry != null)
				arry = null;
			/* There no gaurantee of release (free) of 'arry' memory here
			 *  If the JVM can detect that a piece of memory is no longer reachable by 
			 *  the entire program, then the JVM will free the memory
			 *  
			 * That said, class objects' destructor can be called here 
			*/
			
			System.out.println("Resources released");
		}
		
		System.out.println("Some random print message ");
		System.out.println("Leaving  Class2.method1 ");
	}
}

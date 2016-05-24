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
		System.out.println("Entering Class1.method1 ");
        
		// this is nested try-catch (try-catch inside a try-catch)
		try
		{
			for(int j=6; j>0; j--)
			{	
				System.out.println("j = "+j);
				Class2.method1(j);
			}
		}
		catch(ChkException e)
		{
			System.out.println("CheckedException propogates to Class1.method1");
		}
		// Only Arithmetic Exception will be caught here. 
		// Array-index-out-of-bounds Exception is already caught in the function itself.
		catch(ArithmeticException a)			
		{
			System.out.println("Arithematic Exception caught in Class1.method1 ");
			//System.exit(0);
		}
		finally
		{
			// this finally block will not execute if System.exit is executed
			System.out.println("In Finally block of Class1.method1");
		}
		
		// adjacent try-catch
		// one-after the other
		try
		{
			throw new UnChkException("User exception generated");
		}
		catch(UnChkException n)
		{
			 System.out.println("Some Runtime Exception caught: " + n.getError());
		}
		
        System.out.println("Leaving  Class1.method1 ");
	}
}


class Class2
{
	static void method1(int val) throws ChkException // "throws" is must for a checked exception to propagate
	{
		int [] ary = new int[1];
		System.out.println("Entering Class2.method1 ");
		
		// Multiple Exception generating statements will result to execution of the exception that occurs first
		try 
		{
			System.out.println("Entering try of Class2.method1");
			
			switch(val)
			{
				case 0:
					val /= 0;
					break;
					
				case 1:
					throw new ChkException("This is Checked Exception");
					//break; // because break statement is unreachable
					
				case 2:
					throw new UnChkException("This is unchecked exception, catch implmentation not compulsary");
					//break; // because break statement is unreachable
					
				case 3:
					ary[val] = val;
					break;
					
				case 4:
					ary = null;
					ary.equals("hi");
					// break; 
					
				default:
					System.out.println("Default case");
					break;
			}
			System.out.println("This line is not executed in case of exception"); 
		}catch (ArrayIndexOutOfBoundsException ar)	// specific Exception-catch block
		{
            System.out.println("Array-index-out-of-bounds Exception caught");
        }
		catch(UnChkException u)
		{
			System.out.println("Unchecked exception would propagate above if not caught");
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

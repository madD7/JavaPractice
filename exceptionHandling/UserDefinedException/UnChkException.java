package exceptionHandling;

/**
 * @author madD7
 * a simple java program
 */

/*
 * Unchecked are not checked at compiled time. 
 * For unchecked exceptions, it is not forced by the compiler to either handle or specify the exception.
 * It is up to the programmers to be civilized, and specify or catch the exceptions.
 */
public class UnChkException extends RuntimeException
{
	private String err;
	
	/* Constructor */
	public UnChkException(String err)
	{
		this.err = err;
	}
	
	public String getError()
	{
		return err;
	}
	
	public void setError(String err)
	{
		this.err = err;
	}
}




/*
 * Checked Exceptions are checked at compile time. 
 * If some code within a method throws a checked exception, then the method must either handle the exception 
 * or it must specify the exception using throws keyword.
 * */
class ChkException extends Exception
{
	private String err;
	
	/* Constructor */
	public ChkException(String err)
	{
		this.err = err;
	}
	
	public String getError()
	{
		return err;
	}
	
	public void setError(String err)
	{
		this.err = err;
	}
}

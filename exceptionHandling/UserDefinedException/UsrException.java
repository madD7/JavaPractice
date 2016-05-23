package exceptionHandling;

/**
 * @author madD7
 * a simple java program
 */

public class UsrException extends RuntimeException
{
	private String err;
	
	/* Constructor */
	public UsrException(String err)
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

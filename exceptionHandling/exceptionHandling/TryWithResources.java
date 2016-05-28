package tryWithResources;


import java.io.*;

/**
 * @author madD7
 * a simple java program
 */

public class TryWithResources {
	
	public static void main(String[] args)
	{
		usingTryResource();
		notUsingTryResource();
	}
	
	static void notUsingTryResource()
	{
		System.out.println("In usingFinally. Will open a new file");
		
		PrintWriter fos = null;
		BufferedReader fis = null;
		
		try
		{
			fos = new PrintWriter(
					new BufferedWriter(
						new FileWriter("D:\\output.txt", true)
										)
									, true);
			
			fis = new BufferedReader(
                    new FileReader("D:\\input.txt")
									);
			String str="Reading  from file";
			do
			{
				str = fis.readLine();
				System.out.println(str);
				fos.println(str);
			}while(str != null);			
		}
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}
		finally
		{
			fos.close();
		}
	}
	
	static void usingTryResource()
	{
		System.out.println("In usingTryResource. Will open a new file");
		
		// The PrintWriter variable is declared inside the parentheses after the try keyword. 
		// Additionally, a PrintWriter is instantiated and assigned to the variable.
		// An already declared variable cant be used in try. Thus uncommenting next statement will result to Compilation error
		// PrintWriter fos = null;

		try(PrintWriter fos = new PrintWriter(
					new BufferedWriter(
							new FileWriter("D:\\input.txt", true)
										)
									, true);
				)
		{
			int i=0;
			
			for(i=0; i<10; i++)
			{
				fos.println("This is line number: " + i);
			}
		}
		catch(IOException i)
		{
			System.out.println("Could not create file");
			System.out.println(i.getMessage());
		}
	}

}

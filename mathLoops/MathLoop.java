package mathloop;

/**
 * @author madD7
 *
 */
public class MathLoop {

	public static void main(String[] args)
	{
		System.out.print("Is 7 prime? ");
		System.out.println(isPrime(7)?"Yes":"No");
		
		System.out.print("Is 1001 prime? ");
		System.out.println(isPrime(1001)?"Yes":"No");
		
		printFibonnaci(100);
	}
	
	static boolean isPrime(int num)
	{
		if(num%2 == 0)
			return false;
		
		for(int i=3; i<(num/2);i+=2)
		{
			if( num%i == 0)
			{
				System.out.print("The number "+num+ " is divisible by " + i + ". So answer is ");
				return false;
			}
		}
		
		return true;
	}
	
	static void printFibonnaci(int num)
	{
		int fi=1;
		int prev=0;
		
		while(fi < num )
		{
			int temp=prev;
			System.out.print(fi + " ");
			prev = fi;
			fi += temp; 
		}
	}

}

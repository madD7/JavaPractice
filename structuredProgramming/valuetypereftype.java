package structuredProgramming;

/**
 * @author madD7
 * Calculator Program - Demonstrate value type & Reference type
 * 
 * Value type variables hold the value itself 
 * whereas reference type variables hold reference to the value
 * Reference to object is typically machine address of that variable
 * Reference is neither a Pointer to object, nor its copy or copy of pointer either.
 * Reference is the object itself.
 * In compiler language, reference is an 'lvalue', something that can appear at the LHS of an assignment operator 
 */


public class ValueTypeRefType {

	public static void main(String[] args)
	{
		int vlutype = 10;
		String reftype = "Hello world";
		
		System.out.println("value of Value type variable vlutyp = " + vlutype);
		System.out.println(reftype);			
	}

}

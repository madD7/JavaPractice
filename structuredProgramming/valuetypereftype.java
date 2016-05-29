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


/**
 * This program illustrates how java imposes the value type semantics on strings 
 * even though string is a reference type. Usually in a reference type, 
 * multiple reference variables can refer to the same value ( memory block ). 
 * Consequently, changing value via one variable gets reflected when accessing value via other variable. 
 * Immutability of string eliminates this scenario.
 * 
 * Primitive types and their state space and size
 */


public class ValueTypeRefType {

	public static void main(String[] args)
	{
		int i = 5;
        int j = 1;
        
        System.out.print(" i = " + i);
        System.out.println("\t j = " + j); 
       
        j = i;
        
        System.out.print(" i = " + i);
        System.out.println("\t j = " + j);
        
        i = 9;
        
        System.out.print(" i = " + i);
        System.out.println("\t j = " + j);
        
        String str1 = "Hello";
        String str2 = "bye";
        
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        // String 1 & 2 now refer to the same string "Hello" 
        str2 = str1;
        
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        // But though Str1 is changed, Str2 doesnt change.
        // Which means Strings are Immutable in Java
        str1 = "ok";
        
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
         	
        
        System.out.println("Demonstration of Primitive types in Java, theirs state space and sizes");
        
        /*
         * Wrapper Classes of the respective primitive types are used below
         */
               
        System.out.println("The size of Byte in bits is " + Byte.SIZE + "bits");
        System.out.println("The size of Byte in bytes is " + Byte.BYTES + "bytes");
        System.out.println("The MAX_VALUE of Byte in bytes is " + Byte.MAX_VALUE);
        System.out.println("The MIN_VALUE of Byte in bytes is " + Byte.MIN_VALUE);
        
        System.out.println("The size of Character in bits is " + Character.SIZE + "bits");
        System.out.println("The size of Character in bytes is " + Character.BYTES + "bytes");
        System.out.println("The MAX_VALUE of Character in bytes is " + (int)Character.MAX_VALUE);
        System.out.println("The MIN_VALUE of Character in bytes is " + (int)Character.MIN_VALUE);
        
        System.out.println("The size of Short in bits is " + Short.SIZE + "bits");
        System.out.println("The size of Short in bytes is " + Short.BYTES + "bytes");
        System.out.println("The MAX_VALUE of Short in bytes is " + Short.MAX_VALUE);
        System.out.println("The MIN_VALUE of Short in bytes is " + Short.MIN_VALUE);
        
        System.out.println("The size of Integer in bits is " + Integer.SIZE + "bits");
        System.out.println("The size of Integer in bytes is " + Integer.BYTES + "bytes");
        System.out.println("The MAX_VALUE of Integer in bytes is " + Integer.MAX_VALUE);
        System.out.println("The MIN_VALUE of Integer in bytes is " + Integer.MIN_VALUE);
        
        System.out.println("The size of Long in bits is " + Long.SIZE + "bits");
        System.out.println("The size of Long in bytes is " + Long.BYTES + "bytes");
        System.out.println("The MAX_VALUE of Long in bytes is " + Long.MAX_VALUE);
        System.out.println("The MIN_VALUE of Long in bytes is " + Long.MIN_VALUE);
        
        System.out.println("The size of Float in bits is " + Float.SIZE + "bits");
        System.out.println("The size of Float in bytes is " + Float.BYTES + "bytes");
        System.out.println("The MAX_VALUE of Float in bytes is " + Float.MAX_VALUE);
        System.out.println("The MIN_VALUE of Float in bytes is " + Float.MIN_VALUE);
	}

}

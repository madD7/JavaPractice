/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :
				Collections interface suggests that all classes that implement collection
				must have 2 standard constructors:
					1 - with no arguments to create an empty collection
					2 - with collection argument to initialize the new collection with
						all the elements/items of the collection passed as an argument.

				This is only a suggestion though, because interfaces dont have 
				constructors. However all the current collection implementation have 
				2 constructors.
					

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package BulkOperations;


/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{

	public static void main(String[] args){
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();

		for ( int i=1; i <=100; i++){
			squares.add(i*i);
			cubes.add(i*i*i);
		}

		// adding all the elements of the squares set in the union set
		Set<Integer> union = new HashSet<>(squares);

		// Adding all the elements of the cubes set
		union.addAll(cubes);
		
		System.out.println("Total elements in squares set is " + squares.size() );
		System.out.println("Total elements in cubes set is " + cubes.size() );
		System.out.println("Union contains " + union.size() + " elements");

		Set<Integer> intersection = new HashSet<>(squares);
		System.out.println("Total elements in the intersection set after adding squares " + intersection.size());
		intersection.retainAll(cubes);
		System.out.println("After retainAll(), Intersection set contains " + intersection.size() + " elements");

		for ( int i : intersection ) {
			System.out.println(i + " is a square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
		}

		System.out.println("NOTE:\tThe intersection set is modified due to the bulk operation retainAll().\n" + 
							"\tThus bulk operations are destructive.");

		/* Interaction between the array and collection */
		String sentence = "A quick brown fox jumped over a lazy dog";
		String[] wordsArray = sentence.split(" ");

		Set<String> wordSet = new HashSet<>();
		wordSet.addAll(Arrays.asList(wordsArray));

		System.out.println("\n\nThe order of the words will not be maintained in the set");
		for ( String s: wordSet ){
			System.out.println(s);
		}

		// Asymmetric difference
		String thought1 = "All Nature is the art of unknown to thee";
		String thought2 = "To err is human to forgive is divine";

		String[] thoughtArray = thought1.split(" ");
		Set<String> thought1Set = new HashSet<>(Arrays.asList(thoughtArray));

		thoughtArray = thought2.split(" ");
		Set<String> thought2Set = new HashSet<>(Arrays.asList(thoughtArray));

		System.out.println("Thought1: " + thought1 + "\nThought2: " + thought2);
		Set<String> asymmetry1 = new HashSet<>();
		asymmetry1.addAll(thought1Set);
		asymmetry1.removeAll(thought2Set);
		System.out.println("Printing thought1Set.removeAll(thought2Set) ");
		for ( String s: asymmetry1){
			System.out.println(s);
		}

		Set<String> asymmetry2 = new HashSet<>();
		asymmetry2.addAll(thought2Set);
		asymmetry2.removeAll(thought1Set);
		System.out.println("Printing thought2Set.removeAll(thought1Set) ");
		for ( String s: asymmetry2 ){
			System.out.println(s);
		}

	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

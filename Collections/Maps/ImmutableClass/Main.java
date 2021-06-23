/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :
				An example of how to create an immutable class.

				Properties of Immutable class
					* The data fields and the objects referred to by the fields can't be
						changed once the class object is created.
					* All the data fields are private and final and no setter methods are
						avaiable.
					* The class methods can't be over-rode, thus preventing modification 
						of any internal fields.
					* The class, if requires object of any other class, accepts the object
						in the constructor, creates copy of the object and stores it in
						internal private referrence to the object.
						No class method, returns referrence to the object. Instead, if 
						need be, a copy of such object is returned in the getter method.
						This prevents modification of the actual object copy.

				In the following code example, Location class is immutable.

				The location class is used in value (in the key-value pair) of the map and 
				not as a key, if it is mutable.
				
				Thus, an immutable location class can also be used as key in the map.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package ImmutableClass;


/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		//Create exits map and pass to the constructor
		Map<String, Integer> tempExit = new HashMap<>();
		locations.put(0, new Location(0, "You are sitting in front of laptop, at Home", tempExit));

		tempExit = new HashMap<>();
		tempExit.put("W",2);
		tempExit.put("E",3);
		tempExit.put("S",4);
		tempExit.put("N",5);
		locations.put(1, new Location(1, "You are at the end of the road before a small bridge", tempExit));

		tempExit = new HashMap<>();
		tempExit.put("N",5);
		locations.put(2, new Location(2, "You are at top of the hill", tempExit));

		tempExit = new HashMap<>();
		tempExit.put("W",1);
		locations.put(3, new Location(3, "You are inside a building", tempExit));

		tempExit = new HashMap<>();
		tempExit.put("N",1);
        tempExit.put("W",4);
		locations.put(4, new Location(4, "You are in a valley besides a stream", tempExit));

		tempExit = new HashMap<>();
		tempExit.put("S",1);
        tempExit.put("W",2);
		locations.put(5, new Location(5, "You are In the forest", tempExit));
		
		// Creating a Hash map of words 
		Map<String, String> vocabulary = new HashMap<String, String>();
		vocabulary.put("NORTH", "N");
		vocabulary.put("WEST", "W");
		vocabulary.put("EAST", "E");
		vocabulary.put("SOUTH", "S");
		vocabulary.put("QUIT", "Q");

		int loc=1;
		while(true){
			System.out.println(locations.get(loc).getDescription());
			
			/* Even though it looks like we are removing the below key, 
			   the actual map data of the object is unchanged as we have 
			   made the location class immutable.			*/ 
			tempExit.remove("S");

			if (loc == 0 ){
				break;
			}

			Map<String,Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are ");

			for (String exit:exits.keySet()){
				System.out.print(exit + ", ");
			}
			System.out.println();

			String direction = scanner.nextLine().toUpperCase();

			if ( direction.length() > 1 ){
				String[] words = direction.split(" ");
				
				for ( String word : words ){
					if ( vocabulary.containsKey(word)){
						direction = vocabulary.get(word);
						break;
					}
				}
			}

			if ( exits.containsKey(direction)){
				loc = exits.get(direction);
			}else {
				System.out.println("You can not go in that direction");
			}
		}		
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

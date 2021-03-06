/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package AdventureGame;


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

		locations.put(0, new Location(0, "You are sitting in front of laptop, at Home"));
		locations.put(1, new Location(1, "You are at the end of the road before a small bridge"));
		locations.put(2, new Location(2, "You are at top of the hill"));
		locations.put(3, new Location(3, "You are inside a building"));
		locations.put(4, new Location(4, "You are in a valley besides a stream"));
		locations.put(5, new Location(5, "You are In the forest"));

		/* Inserting the location Exits */
		locations.get(1).addExit("W",2);
		locations.get(1).addExit("E",3);
		locations.get(1).addExit("S",4);
		locations.get(1).addExit("N",5);

		locations.get(2).addExit("N",5);

		locations.get(3).addExit("W",1);

		locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",4);

		locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

		int loc=1;
		while(true){
			System.out.println(locations.get(loc).getDescription());
			if (loc == 0 ){
				break;
			}

			Map<String,Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are ");

			for (String exit:exits.keySet()){
				System.out.print(exit + ", ");
			}
			System.out.println();

			String[] inputLine = scanner.nextLine().split(" ");
			String direction = "Q";

			for ( String str: inputLine){
				if ( str.equalsIgnoreCase("East") || 
						str.equalsIgnoreCase("E")){
					direction = "E";
					break;
				} else if (str.equalsIgnoreCase("West") || 
						str.equalsIgnoreCase("W")){
					direction = "W";
					break;
				} else if (str.equalsIgnoreCase("North") || 
						str.equalsIgnoreCase("N")){
					direction = "N";
					break;
				}else if (str.equalsIgnoreCase("South") || 
						str.equalsIgnoreCase("S") ){
					direction = "S";
					break;
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

/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Demonstrating the Collection - Maps 

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package AdventureGameWithVocabulary;


/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Map;
import java.util.HashMap;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Location{
	private final int locationId;
	private final String description;
	private final Map<String, Integer> exits;

	public Location(int locationId, String description){
		this.locationId = locationId;
		this.description = description;

		this.exits = new HashMap<String, Integer>();
		exits.put("Q",0);
	}

	public int getLocationId(){
		return this.locationId;
	}

	public String getDescription(){
		return this.description;
	}

	public Map<String, Integer> getExits(){
		// Return a copy of exits map, so that the actual data remains private
		// The actual maps will not be affected
		return new HashMap<String, Integer>(exits);
	}

	public void addExit(String direction, int location){
		exits.put(direction, location);
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Example of an immutable class.


				========== From oracle java docs 

				To achieve Immutability:
					1. Don't provide setter methods, to modify any fields or 
						objects referred to, by fields.
					2. Make fields final and private.
					3. Don't allow subclass to override methods. Simplest way to achieve 
						this is to make the class final. A MORE SOPHISTICATED APPROACH IS 
						TO MAKE CONSTRUCTOR PRIVATE AND CONSTRUCT INSTANCES IN FACTORY
						METHOD.
					4. If instance fields include referrence to mutable objects, don't 
						allow those objects to be changed. 
						i.	Don't provide methods that modify mutable objects.
						ii.	Don't share referrences to (of) the mutable objects.
							Never store referrence of the external mutable objects passed
							to constructor. Instead create copies and store referrence
							of copies.
							Similarly create copies of the internal mutable objects when
							necessary, avoid sharing and retruning original object.

				=========

				The above points are demonstrated in the below code, making the 
				Location class immutable.
				
Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/
package ImmutableClass;


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


// Complies Note 3. 
public final class Location{

	// Complies with Note 2.
	private final int locationId;
	private final String description;
	private final Map<String, Integer> exits;

	// if null is passed (tempExits = null), the constructor would crash
	public Location(int locationId, String description, Map<String, Integer> tempExits){
		this.locationId = locationId;
		this.description = description;
		
		/* Compiles with Note 4.(ii) 
		   Copy of the object is created and stored internally.
		*/
		if ( tempExits != null ){
			this.exits = new HashMap<String, Integer>(tempExits);
		}else{
			this.exits = new HashMap<String, Integer>();
		}
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
		// Compiles with  Note 4.(ii)
		return new HashMap<String, Integer>(exits);
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

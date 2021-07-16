/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :
				Example code to understand sets

			------------------------------     EQUALS    ------------------------------------
				Equals methods implements an equivalance relation on two non-null object
				referrences.

				- Reflexive:
					must return true for x.equals(x)

				- Symmetric:
					x.equals(y) must return true if and only if, y.equals(x) returns true

				- Transitive
					if x.equals(y) returns true and y.equals(z) returns true, then
					z.equals(x) must return true

				- Consistent
					multiple invocation of x.equals(y) must return true consistently or
					return false consistently if no info in the equals comparision of 
					objects is modified.

				For all the instances of x, x.equals(null) must return false.


			------------------------------    HASHCODE   ------------------------------------
				Hashcode can be assumed as an Integer value of the object.
				Computing hashcode is like compressing equality to an Integer value.
				Like equals, the hashcode is defined on object, ie. the object class has 
				Hashcode [ equals(Object) ]. If we Override the equals(Object) method, we MUST
				Override the Hashcode. 

				- Consistent
					The Hashcode must return the same Integer value for multiple invocations
					on the same object during an execution of the Java application.
					The Interger value may not remain same accross different executions of 
					the same java app.

				- The Hashcode must return the same integer value for the two objects that are
					equal accroding to the equals method. However, two unequal objects may result 
					to same hashcode integer value.
				
				- The hashcode computation must not include any field that is not included for
					equality check in the equals method. Thus, the set of the fields used for
					hashcode computation must be the subset of the fields used in the equals().

				- Hashcode must not be used for mutable fields.
					We know that the hashcode is used to determine the elements bucket.
					If any field of a mutable object is changed, the hashcode will not 
					be recomputed, internal bucket array will not be updated.
					Thus, the check with the equals object or with same instance will fail,
						coz the datastructure computes current hashcode different from the 
						hashcode computed while instantiating the object, 
						therefore looking into the wrong bucket during comparaision.


Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package SolarSystemChallengeInnerClassAsKey;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Set;
import java.util.HashSet;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */
// Making class abstract to prevent instances of the class 
public abstract class HeavenlyBody{
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	private final Key key;

	public enum BodyTypes {
		STAR,
		PLANET,
		DWARF_PLANET,
		MOON,
		COMET,
		ASTROID
	}

	public HeavenlyBody(String name, BodyTypes bodyType, double orbitalPeriod){
		this.key = new Key(name, bodyType);
		this.orbitalPeriod = orbitalPeriod;

		satellites = new HashSet<>();
	}
	
	public Key getKey(){
		return key;
	}

	public double getOrbitalPeriod(){
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<HeavenlyBody>(this.satellites);
	}

	public boolean addSatellite(HeavenlyBody body){
			return this.satellites.add(body);
	}

	/* Without @Override, we would be actually overloading the equals methods.
	   We actually want to Override equals method present in the Object parent class
	   and not overload equals(Object) i.e. we dont want to create 
	   another method equals(HeavenlyBody) 
	 */
	@Override
	// public boolean equals(HeavenlyBody obj)  // would be overloading and not overriding
	public final boolean equals(Object obj){
		// self check
		if ( this == obj ){
			return true;
		}
	
		// null check
		if ( (obj == null ) ){
			return false;
		}

		if ( obj instanceof HeavenlyBody ){
			// Comparing other internal fields
			HeavenlyBody objCopy = (HeavenlyBody) obj;
		
			return this.key.equals(objCopy.getKey());
		}
		
		return false;
	}


	/* If all the instances of the object return the same hashcode, they will end up in 
	   the same bucket. The contains method will thus trigger linear scan (of comparision
	   with every other object) of the list. 
	   In a collection with too many objects, this will result performance degradation.
	   */
	@Override
	public final int hashCode(){
		return this.key.hashCode();
	}

	@Override
	public String toString(){
		return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
	}

	/* To generate a key for lookup in the map */
	public static Key makeKey(String name, BodyTypes bodyType){
		return new Key(name, bodyType);
	}

	/* Static Inner class.
		It CAN'T    access the non-static members of the outer class.    
		It DOESN'T  need the reference of the outer class.               
		Because, the static inner class doesnt have the reference of the 
		non-static outer class, it can't invoke non-static methods or    
		non-static fields of the instance of the outerclass.             
	 */
	public static final class Key{
		private final String name;
		private final BodyTypes bodyType;

		public Key(String name, BodyTypes bodyType ){
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName(){
			return name;
		}

		public BodyTypes getBodyType(){
			return bodyType;
		}	

		@Override
		public String toString(){
			return this.name + ": " + this.bodyType;
		}

		/* The equals and hashCode methods are overrode as 
		   we are using the Key class as Key in Map.
		   */
		@Override
		public boolean equals(Object obj){
			 // self check
	        if ( this == obj ){
    	        return true;
        	}

        	// null check
        	if ( (obj == null ) ){
            	return false;
        	}
			
			if ( obj instanceof Key ){
				Key keyObj = (Key) obj;

				if ( this.name.equals(keyObj.getName()) &&
						this.bodyType == keyObj.getBodyType() ){
					return true;
				}
			}

			return false;
		}

		@Override
		public int hashCode(){
			return this.name.hashCode() + this.bodyType.hashCode();
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

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


Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package SolarSystem_Override_Equals_Hashcode;

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

public final class HeavenlyBody{
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, double orbitalPeriod){
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;

		satellites = new HashSet<>();
	}
	
	public String getName(){
		return name;
	}

	public double getOrbitalPeriod(){
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<HeavenlyBody>(this.satellites);
	}

	public boolean addMoon(HeavenlyBody moon){
		return this.satellites.add(moon);
	}

	/* Without @Override, we would be actually overloading the equals methods.
	   We actually want to Override equals method present in the Object parent class
	   and not overload equals(Object) i.e. we dont want to create 
	   another method equals(HeavenlyBody) 
	 */
	@Override
	// public boolean equals(HeavenlyBody obj)  // would be overloading and not overriding
	public boolean equals(Object obj){
		// self check
		if ( this == obj ){
			return true;
		}
	
		// null check
		if ( (obj == null ) ){
			return false;
		}

		/* Compare class types. 
			using instanceof comparision to determine the equality will violate symmetricity
			for parent-child objects.

			childObj.equals(parentObj) returns true, yet the parentObj.equals(childObj)
			may return false, if the child objects contains more its own extra fields.
			
			This will violate the Symmetry ccndition, 
			if instanceof check is implemented instead of getClass()
	
			Sample code:-

			if ( this instanceof inputObj ) 
				return true;
			else 
				false;
			
			We choose to implement getClass comparision
		 */
		if ( obj.getClass() != this.getClass() ){
			return false;
		}

		// Comparing other internal fields
		String objName = ((HeavenlyBody) obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode(){
		return 0;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

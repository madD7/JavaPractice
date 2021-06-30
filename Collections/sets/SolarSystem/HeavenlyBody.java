/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :
				Example code to understand sets

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package SolarSystem;

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
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package SolarSystemChallenge;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Planet extends HeavenlyBody{

	public Planet(String name, double orbitalPeriod){
		super(name, BodyTypes.PLANET, orbitalPeriod);
	}

	@Override
	public boolean addSatellite(HeavenlyBody moon){
		if ( moon.getBodyType() == BodyTypes.MOON ){
			return super.addSatellite(moon);
		}

		return false;
	}		

}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

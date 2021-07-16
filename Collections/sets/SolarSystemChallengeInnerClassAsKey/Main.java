/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

				The 'planet' set accepts HeavenlyBody objects.
				Each HeavenlyBody has a set of moons/satellites.
`
				The map, solarSystem, consists of all the HeavenlyBody objects.

				The method, addAll(Collection C) is used to add all the elements of
				the Collection c (may be a set) into the new Set.
					Eg: Refer Note 1.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package SolarSystemChallengeInnerClassAsKey;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args){
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp); 
		
		temp = new Planet("Venus", 225);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp); 

		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		// Adding Moon to the Earth
		/* There is only one instance of the Moon that is being added to 
		   the solarSystem HashMap as well as to the satellite set of the 
		   HeavenlyBody Earth
		   */
		HeavenlyBody moon = new Moon("Moon", 27);
		solarSystem.put(moon.getKey(), moon);
		temp.addSatellite(moon);

		temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
	
		// Adding moons to the Mars
		moon = new Moon("Deimos", 1.3);
		solarSystem.put(moon.getKey(), moon);
		temp.addSatellite(moon);

		moon = new Moon("Phobos", 0.3);
		solarSystem.put(moon.getKey(), moon);
		temp.addSatellite(moon);

		temp = new Planet("Jupiter", 4333);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

		// Adding moon to Jupiter
		moon = new Moon("I0", 1.8);
		solarSystem.put(moon.getKey(), moon);
		temp.addSatellite(moon);

		moon = new Moon("Eurpoa", 3.5);
		solarSystem.put(moon.getKey(), moon);
		temp.addSatellite(moon);

		temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

		temp = new Planet("Uranus", 30687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

		temp = new Planet("Neptune", 60190);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

		temp = new DwarfPlanet("Pluto", 248);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		System.out.println("A set doesnt maintain order of entries.\nSet of Planets with their moons:");
		for ( HeavenlyBody body : planets){
			System.out.println("\t" + body.toString());
			
			Set<HeavenlyBody> tempMoons = body.getSatellites();
			for ( HeavenlyBody m : tempMoons){
				System.out.println("\t\t" + m.toString());
			}
		}


		System.out.println("Set of all the Moons");
		Set<HeavenlyBody> allMoons = new HashSet<>();

		// Note 1.
		for ( HeavenlyBody p : planets){
			allMoons.addAll(p.getSatellites());
		}

		for ( HeavenlyBody m : allMoons){
			System.out.println(m.toString());
		}

		/* Adding Pluto again. Without implementation of the equals method,
		   it is possible to add 2 or more of same planet names as 
		 demonstrated below */

		temp = new Planet("Pluto", 822);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		System.out.println("Adding duplicate Pluto. The new solarSystem set is :");
		for ( HeavenlyBody body : planets){
            System.out.println("\t" + body.toString());

            Set<HeavenlyBody> tempMoons = body.getSatellites();
            for ( HeavenlyBody m : tempMoons){
                System.out.println("\t\t" + m.toString());
            }
        }

		/*
			Remember, if you print any object, the java compiler internally invokes the toString()
			method on Object.
		   */
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

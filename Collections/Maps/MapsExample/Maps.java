/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

				Sample code to understand Maps interface on collections.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package MapsExample;

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

public class Maps{

	public static void main(String[] args){
		Map<String, String> languages = new HashMap<>();

		languages.put("Java","A compiled high-level, object oriented, platform independent programming language");
		languages.put("Python","An interpreted, higher-level, object oriented programming language");
		languages.put("Algol","An algorithmic language");
		languages.put("BASIC","Beginners All-purpose Symbolic Instruction Code");
		languages.put("Lisp","Therein lies madness");
		languages.put("GoLang",null);

		System.out.println(languages.get("Java"));
		
		// over writting the old value
		System.out.println("Old value of Java - \n\t" + languages.put("Java","We are using Java"));
		System.out.println("New value of java - " + languages.get("Java"));

		if ( languages.containsKey("Python")){
			System.out.println("Map already contains the key - Python");
		}else {
			languages.put("Python","An interpreted, higher-level, object oriented programming language");
		}

		System.out.println("Adding a new Key and check the return value of .put method");

		if ( !languages.containsKey("C")){
			System.out.println("Adding key for \"C\"");
			System.out.println("The return value for .put new key is " + languages.put("C", "The most simple compiled language"));
		} else {
			System.out.println("Map already contains the key - C");
		}

		System.out.println("The output of containsKey(\"GoLang\") is "+ languages.containsKey("GoLang"));
		System.out.println("The value of the GoLang is " + languages.putIfAbsent("GoLang","Language developed by Google"));
		System.out.println("The new value of GoLang is " + languages.get("GoLang"));

		System.out.println("\nPrinting all key-value pairs of the 'languages' map");
		for ( String key: languages.keySet() ){
			System.out.println(key + ": " + languages.get(key));
		}

		// Removes the key ( and associated value) 
		languages.remove("Lisp");

		if ( languages.remove("GoLang", "Google language")){
			System.out.println("GoLang key removed successfully");
		}else{
			System.out.println("Key-value mismatch. GoLang not removed");
		}

		// Returns the old value of the key, whose value is to be replaced.
		// Returns null if the key doesnt exists
		System.out.println("Replacing value for key - C. Old value - " +
								languages.replace("C", "Simplest, most basic language"));

		System.out.println("Replacing value for HTML (key doesnt exists). Old value - " + 
								languages.replace("HTML", "Hyper text markup language"));

		System.out.println("\nPrinting all key-value pairs of the 'languages' map");
        for ( String key: languages.keySet() ){
            System.out.println(key + ": " + languages.get(key));
        }
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

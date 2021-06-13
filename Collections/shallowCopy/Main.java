/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Shallow copy Vs Deep copy of a Collections Object

				Shallow copy:
				When a collection is shallow copied, the new copy of the original collection 
				contains only the referrence to the objects. 
				Thus, both the collections point to the same objects, and will have same order 
				for the object held.
				However, any modification to the value of any object in any of the copy, 
				will be reflected in all the copies of the collection.
				Thus, the collection copy may be shuffled, changing the order 
				of the objects only in that copy. The order will not change in the original 
				collection.
				Change in order is not change in the value of the actual object held in collection.				


				Deep Copy:
				In deep copy, a new collection object is created and a new copy of all the
				objects contained in the original collection is created. 
				Any change in the value of the object in one collection, will NOT be 
				reflected into the copies of that collection. The change in the value 
				of any object will be limited to the collection in which the object value 
				was changed.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package shallowCopy;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	public static void main(String[] args){
		ArrayList <Seat> seats = new ArrayList<>();

		for(char i='A'; i <=('A' + 5); i++){
            for (int j=1; j <= 3; j++){
                seats.add(new Seat(i + String.format("%02d", j)));
            }
        }

		System.out.println("Seats: ");
		for(Seat s:seats){
			System.out.print(s.toString() + ", ");
		}

		ArrayList <Seat> seatscopy = new ArrayList<>(seats);
		System.out.println("\nSeatscopy: ");
        for(Seat s:seatscopy){
            System.out.print(s.toString() + ", ");
        }

		// Modifying the value of the object in the original ArrayList
		seats.get(4).reserve();
		seats.get(10).reserve();

		System.out.println("Resering 2 seats");
		System.out.println(seats.get(4).toString());
		System.out.println(seats.get(10).toString());

		// Collections.shuffle(seatscopy);
		Collections.reverse(seatscopy);

		// The modification in the value will be reflected in the Copy of ArrayList
		System.out.println("Verifying the change order and the value of seat in Seatscopy: ");
        for(Seat s:seatscopy){
            System.out.println(s.toString());
        }

		System.out.println("Verifying the order of seat in Seats: ");
        for(Seat s:seats){
            System.out.print(s.toString() + ", ");
        }

		// Min and Max work because Seat class implements comparable and has compareTo method
		System.out.println("\nMin value " + Collections.min(seatscopy).toString());
		System.out.println("Max value " + Collections.max(seatscopy).toString());

	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

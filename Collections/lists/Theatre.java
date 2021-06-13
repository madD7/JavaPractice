/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				The theatre example is used to demonstrate usage of java collections.
				Collection is generic interface.

				The Theatre class has a list of seats. The seats can be reserved or canceled.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package lists;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Theatre{
	private final String name;
	private List<Seat> seats = new ArrayList<Seat>();
	//private Collection<Seat> seats = new ArrayList<Seat>();

	public Theatre(String name, int maxRows, int maxSeats){
		this.name = name;

		for(char i='A'; i <=('A' + maxRows); i++){
			for (int j=1; j <= maxSeats; j++){
				seats.add(new Seat(i + String.format("%02d", j)));
			}
		}
	}

	public String getTheatreName(){
		return name;
	}

	public boolean reserveSeat(String seatNumber){
		Seat requestedSeat = new Seat(seatNumber);
		int seatFound = Collections.binarySearch(seats, requestedSeat, null);

		if ( seatFound >= 0 ){
			return seats.get(seatFound()).reserve();
		}
		
		System.out.println("There is not seat " + seatNumber);
		return false;
		
		/*
		for ( Seat s: seats){
			if( s.getSeatNumber().equals(seatNumber)){
				requestedSeat = s;
				break;
			}
		}

		if ( requestedSeat == null){
			System.out.println(seatNumber + " not found");
			return false;
		}

		return requestedSeat.reserve();
		*/
	}

	// for Testing 
	public void getSeats(){
		for(Seat s:seats){
			System.out.println(s.getSeatNumber());
		}
	}

	// Private inner class Seat
	private class Seat implements Comparable<Seat>{
		private String seatNumber;
		private boolean reserve=false;

		public Seat(String seatNumber){
			this.seatNumber = seatNumber;
		}

		@Override
		public int compareTo(Seat seat){
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

		public String getSeatNumber(){
			return seatNumber;
		}

		public boolean reserve(){
			if ( this.reserve ){
				System.out.println("Seat " + this.seatNumber + " already resered");
				return false;
			}

			reserve = true;
			return reserve;
		}

		public boolean cancel(){
			if ( this.reserve ){
				this.reserve = false;
				System.out.println("Reservation of seat " + this.seatNumber + " is not cancelled");
				return true;
			}

			return false;
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

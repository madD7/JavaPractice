/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Seat class is used to store the value of seats ( as in theatre).

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package shallowCopy;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Seat implements Comparable<Seat>{
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

	@Override
	public String toString(){
		String status;

		if ( this.reserve ){
			status = "Reserved";
		}else{
			status = "Available";
		}

		return ( this.seatNumber + " is " + status);
	}
}

/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

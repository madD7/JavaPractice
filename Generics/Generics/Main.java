/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package Generics;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	public static void main(String[] args){
		FootballPlayer chetri = new FootballPlayer("Suneil Chetri");
		BadmintonPlayer saina = new BadmintonPlayer("Saina Nehwal");
		CricketPlayer sachin = new CricketPlayer("Sachin Tendulkar");

		Team<CricketPlayer> MumbaiIndians = new Team<>("Mumbai Indians");
		Team<FootballPlayer> ClubMahindra = new Team<>("Club Mahindra");

		MumbaiIndians.addPlayer(sachin);

		/* Will result to compilation error */
		//MumbaiIndians.addPlayer(saina);

		// Will generate compilation error after <T> is added to the argument Team of the method call
		//MumbaiIndians.matchResult(ClubMahindra, 2, 1);
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

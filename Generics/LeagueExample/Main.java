/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package LeagueExample;

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
		League<CricketPlayer, Team<CricketPlayer>> ipl = new League<>("Indian Premier League");
		Team<CricketPlayer> Mumbai = new Team<>("Mumbai Indians");
		Team<CricketPlayer> Delhi = new Team<>("Delhi DareDevils");
		Team<CricketPlayer> Kolkata = new Team<>("Kolkata Knight Riders");

		ipl.addTeam(Mumbai);
		ipl.addTeam(Delhi);
		ipl.addTeam(Kolkata);

		Mumbai.matchResult(Delhi, 2, 1);
		Mumbai.matchResult(Kolkata, 1, 2);
		Kolkata.matchResult(Delhi, 1, 2);

		ipl.showLeagueTable();
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

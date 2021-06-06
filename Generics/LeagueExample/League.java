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
import java.util.Collections;
import java.util.ArrayList;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class League<T extends Team>{
	private String name;
	private ArrayList<T> leagueTeams = new ArrayList<>();

	public League(String name){
		this.name = name;
	}

	public boolean addTeam(T team){
		if ( leagueTeams.contains(team) ){
			System.out.println(team.getName() + " is already in the league " + this.name );
			return false;
		}

		leagueTeams.add(team);
		return true;
	}

	public void showLeagueTable(){
		Collections.sort(leagueTeams);

		for ( T t : leagueTeams){
			System.out.println(t.getName() + ": " + t.ranking());
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

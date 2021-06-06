/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				The team class accepts bounded generic type parameters.
				The class is bouned to accept only the type that extends Player.

				Note that the Comparable interface is implemented with a Type parameter 
				Team having a Type parameter T.
				It means that the comparision is restricted to only the Team of the same class.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package LeagueExample;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.ArrayList;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Team <T extends Player> implements Comparable<Team<T>>{
	private String name;
	private int won=0;
	private int lost=0;
	private int tied=0;
	private int matchesPlayed=0;

	private ArrayList<T> members = new ArrayList<>();

	public Team(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public boolean addPlayer(T player){
		if ( members.contains(player)){
			System.out.println(player.getName() + " is already in the team");
			return false;
		}

		members.add(player);
		System.out.println(player.getName() + " is added to team " + this.name);
		return true;
	}

	public int size(){
		return this.members.size();
	}

	// if we dont add generic <T>, then the matchResult called with Team of other class (Football with Cricket will become valid syntax
	// Inorder to prevent, we add the generic type parameter <T>, so that matchResult is only invoked for two teams of same sport
	public void matchResult(Team<T> opponent, int teamScore, int opponentScore){
		if ( teamScore > opponentScore){
			won++;
		}else if ( teamScore < opponentScore ){
			lost++;
		}else{
			tied++;
		}
		
		matchesPlayed++;

		if ( opponent != null ){
			opponent.matchResult(null, opponentScore, teamScore);
		}
	}

	public int ranking(){
		return (won *2) + tied;	
	}

	@Override
	public int compareTo(Team<T> team){
		if ( this.ranking() > team.ranking() ) {
			return -1;
		}else if ( this.ranking() < team.ranking() ) { 
			return 1;
		}
		// if equal
		return 0;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/**************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package LinkedPlaylist;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Album{
	private String name;
	private String artist;
	private ArrayList<Song> songList;

	public Album(String name, String artist){
		this.name = name;
		this.artist = artist;
		songList = new ArrayList<Song>();
	}

	public boolean addSong(Song newSong){
		if ( checkSong(newSong.getTitle()) >= 0 ){
			System.out.println("The song " + newSong.getTitle() + " already exists");
			return false;
		}
		
		songList.add(newSong);
		return true;
	}

	public boolean addSong(String songTitle, double duration){
		if ( checkSong(songTitle) >= 0 ){
			System.out.println("The song " + songTitle + " already exists");
			return false;
		}

		Song newSong = new Song(songTitle, duration);
		songList.add(newSong);
		return true;
	}

	public int checkSong(String song){
		for (int i=0; i < songList.size(); i++){
			if ( songList.get(i).getTitle().equals(song)){
				return i;
			}
		}

		return -1;
	}

	public boolean addToPlaylist(int tracknum, LinkedList<Song> playlist){
		int index = tracknum-1;

		if ( index < 0 && index > this.songList.size() ){
			System.out.println("This album doen't have a track " + tracknum);
			return false;
		}

		playlist.add(this.songList.get(index));
		return true;
	}

	public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist){
		int index = checkSong(songTitle);
		if ( index >= 0 ){
			return addToPlaylist(index, playlist);
		}
		
		System.out.println("The song " + songTitle + " is not in the album " + this.name );
		return false;
	}

	public String getName(){
		return this.name;
	}

	public String getArtist(){
		return this.artist;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

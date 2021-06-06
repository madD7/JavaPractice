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
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	private static ArrayList<Album> myAlbumList = new ArrayList<Album>();

	public static void main(String[] Args){
		LinkedList<Song> playlist = new LinkedList<Song>();
		
		Album albumA = new Album("Remix", "Misc");
		
		albumA.addSong("Song1", 4.3);
		albumA.addSong("Song2", 3.14);
		albumA.addSong("Song3", 2.27);
		albumA.addSong("Song4", 5.1);
		albumA.addSong("Song5", 4.4);
		albumA.addSong("Song6", 6.1);
		albumA.addSong("Song7", 5.3);

		myAlbumList.add(albumA);

		Album albumB = new Album("Classic", "Misc");

        albumB.addSong("ClassicSong1", 5.3);
        albumB.addSong("ClassicSong2", 4.34);
        albumB.addSong("ClassicSong3", 3.27);
        albumB.addSong("ClassicSong4", 6.1);
        albumB.addSong("ClassicSong5", 4.4);
        albumB.addSong("ClassicSong6", 5.1);
        albumB.addSong("ClassicSong7", 5.3);
		
		myAlbumList.add(albumB);

		myAlbumList.get(0).addToPlaylist(1,playlist);
		myAlbumList.get(1).addToPlaylist(1,playlist);
		myAlbumList.get(1).addToPlaylist(3,playlist);
		myAlbumList.get(1).addToPlaylist(5,playlist);
		myAlbumList.get(0).addToPlaylist(1,playlist);
		myAlbumList.get(0).addToPlaylist(2,playlist);
		myAlbumList.get(1).addToPlaylist(7,playlist);
		myAlbumList.get(1).addToPlaylist(7,playlist);
		myAlbumList.get(0).addToPlaylist(6,playlist);

		play(playlist);
	}

	private static void play(LinkedList<Song> playlist){

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> iterator = playlist.listIterator();

		if ( playlist.size() == 0 ){
			System.out.println("No songs in playlist");
			return; 
		}else{
			System.out.println("Now playing " + iterator.next().toString());
			printMenu();
		}

		while (!quit){
			int action = scanner.nextInt();
			scanner.nextLine();

			switch(action){
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;

				case 1:
					if ( !forward){
						if (iterator.hasNext()){
							iterator.next();
						}
						forward = true;
					}

					if (iterator.hasNext()){
						System.out.println("Now playing " + iterator.next().toString());
					}else{
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;
			
				case 2:
					if (forward){
						if (iterator.hasPrevious()){
							iterator.previous();
						}
						forward = false;
					}

					if ( iterator.hasPrevious()){
						System.out.println("Now playing " + iterator.previous().toString());
					}else{
						System.out.println("We have reached the start of the playlist");
						forward = true;
					}
                    break;

				case 3:
					if (forward){
						if (iterator.hasPrevious()){
							System.out.println("Now playing" + iterator.previous().toString());
							forward=false;
						}
						else{
							System.out.println("We are at the start of the playlist");
						}
					}else{
						if ( iterator.hasNext()){
							System.out.println("Now playing" + iterator.next().toString());
							forward=true;
                        }
                        else{
                            System.out.println("We have reached the end of the playlist");
                        }
					}
                    break;

				case 4:
					printList(playlist);
                    break;

				case 5:
					printMenu();
                    break;

				case 6:
					if (playlist.size() > 0 ){
						iterator.remove();

						if( iterator.hasNext() ){
							iterator.next();
						}else if ( iterator.hasPrevious() ){
							iterator.previous();
						}
					}
					break;
			}
		}
	}

	private static void printList(LinkedList<Song> playlist){
		Iterator<Song> iterator = playlist.iterator();

		System.out.println("========================");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("========================");
	}

	private static void printMenu(){
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" + 
							"1 - to play next song\n" + 
							"2 - to play previous song\n" + 
							"3 - to replay the current song\n" +
							"4 - list songs in the playlist\n" + 
							"5 - print available actions\n"+ 
							"6 - delete current song from the playlist");

	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

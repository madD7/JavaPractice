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

/*
 * @}
 */

/* Functions ****************************************************************************** @{
 */

public class Song{
	private String title;
	private double duration;

	public Song(String title, double duration){
		this.title = title;
		this.duration = duration;
	}

	@Override
	public String toString(){
		return (this.title + ": " + this.duration);
	}

	public String getTitle(){
		return title;
	}

	public double getDuration(){
		return duration;
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

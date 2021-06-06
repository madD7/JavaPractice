/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package LocalInnerClass_n_Interface;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.Scanner;

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{
	private static Scanner scanner = new Scanner(System.in);
	private static Button button = new Button("Hello Button 1");

	public static void main(String[] args){

		/* Local inner class ClickListner
		   	Implements Button class inner interface */
		class ClickListner implements Button.OnClickListner{
			/* Constructor */
			public ClickListner(){
				System.out.println("Button attached");
			}

			@Override
			public void onButtonClick(String title){
				System.out.println(title + " was clicked");
			}
		}

		// New class instant, on parent type OnClickListner is passed.
		button.setOnClickListner(new ClickListner());
		listen();
	}

	private static void listen(){
		boolean quit = false;

		while( !quit){
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice){
				case 0:
					quit = true;
					break;

				case 1:
					button.onButtonClick();
					break;
			}
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

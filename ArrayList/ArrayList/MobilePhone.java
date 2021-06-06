/**************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import ArrayList.*;

/* Functions ****************************************************************************** @{
   */

public class MobilePhone{

	private static ArrayList<Contact> ContactList;

	public static void PrintHelp(){
		System.out.println("Select any one of the following operation ");
		System.out.println("a - To add new Contact");
		System.out.println("d - To delete new Delete");
		System.out.println("l - To list all contacts");
		System.out.println("s - To search for a specific contact");
		System.out.println("q - To quit");
	}

	public static int getPosition(String name){
		Contact fromList;
		int pos;
		
		for ( pos=0; pos < ContactList.size(); pos++ ){
			fromList = ContactList.get(pos);

			if ( name.equalsIgnoreCase(fromList.getName()) ){
				return pos;
			}
		}

		return -1;
	}

	public static void main(String[] Args){
		ContactList = new ArrayList<Contact>(); 

		while(true)
		{
			PrintHelp();
			char ch = '\0';
			try{
	
				/* Other method is to use scanner.getNextLine().charAt(0); 
				   	to read only the first character */
				ch = (char)System.in.read();

				// Skip all input characters untill next line
				while ((char) System.in.read() != '\n')
					;
			}catch ( IOException e){
				System.out.println("Error " + e);
			}

			Scanner scanner = new Scanner(System.in);
			//scanner.useDelimiter("\n");
			
			switch (ch){
				case 'a':
				case 'A':
					System.out.println("Input 'firstname <space> lastname'");
					scanner.hasNext();
					String name = scanner.nextLine();
					
					System.out.println("Input a phone number");
					while(!scanner.hasNextLong())
						System.out.println("Waiting for input");

					long phNumber = scanner.nextLong();
					Contact contact = new Contact(name, phNumber);
					System.out.println("You have entered " + contact.getName() + "\t" + contact.getPhNumber());

					if ( getPosition(name) == -1 ){
						ContactList.add(contact);
					}else
						System.out.println("Contact already exists");
					break;

				case 'd':
				case 'D':
					if ( ContactList.isEmpty() ){
						System.out.println("Can't perform delete operation on empty list");
						System.exit(2);
					}

					System.out.println("Enter the contact name ");
					System.out.println("\tFormat Firstname <space> Lastname");
					scanner.hasNext();
					String delName = scanner.nextLine();
					int delPos = getPosition(delName);
					if ( delPos != -1 ){
						ContactList.remove(delPos);
					}else{
						System.out.println("Error: " + delName + " not found");
					}
					break;

				case 'l':
				case 'L':
					if ( ContactList.isEmpty() ){
                        System.out.println("List is empty");
                       	break;
                    }

					for (int i=0; i < ContactList.size(); i++){
						Contact fromList = ContactList.get(i);
						System.out.println("Name: " + fromList.getName() + ". Ph No.: " + fromList.getPhNumber());
					}
					break;

				case 's':
				case 'S':
					if ( ContactList.isEmpty() ){
                        System.out.println("List is empty");
						break;
                    }

					System.out.println("Enter the contact name ");
                    System.out.println("\tFormat Firstname <space> Lastname");
                    scanner.hasNext();
                    String searchName = scanner.nextLine();
                    int pos = getPosition(searchName);
                    if ( pos != -1 ){
                        System.out.println(searchName + " is present in the list");
                    }else{
                        System.out.println("Error: " + searchName + " not found");
                    }
					break;

				case 'q':
				case 'Q':
					System.out.println("Quit");
					scanner.close();
					System.exit(0);
					break;

				default:
					System.out.println("Invalid input " + ch);
					break;
			}
		}
	}
}


/* @}
   */

/* ~~~~~ END OF FILE ~~~~~ */

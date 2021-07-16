/* *************************************** MAD Engineers ***************************************
   MAD Engineers
   Copyright (c) 2014

Description   :

				A non-static nested class has access to all the members of the non-static 
				outer class.
				Thus, a non-static inner class has the reference of the outer class.

				A Static class created inside a class is known as Static Nested Class.
				It CAN'T 	access the non-static members of the outer class.
				It DOESN'T	need the reference of the outer class.
				Because, the static inner class doesnt have the reference of the 
				non-static outer class, it can't invoke non-static methods or 
				non-static fields of the instance of the outerclass.


				The example code here demonstrates, the static inner key class, 
				used as key for	a hashmap. 

				Now, we know, that the key of the hashmap must be immutable.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package StaticInnerClass;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class CustomerDetails{
	private final Key key;
	private long phoneNumber;
	private double balance;
	
	public CustomerDetails(String firstName, String lastName, String branch){
		this.key = new Key(firstName, lastName, branch);
		this.balance = 0;
		this.phoneNumber = 0;

		System.out.println(key.toString());
	}

	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void updateBalance(double value){
		this.balance += value;
	}

	public Key getKey(){
		return this.key;
	}

	@Override
	public boolean equals(Object obj){
		if ( this == obj)
			return true;

		if ( obj == null )
			return false;

		return this.key.equals(obj);
	}

	@Override
	public int hashCode(){
		return this.key.hashCode() + (int)this.phoneNumber;
	}

	public static final class Key{
		private String firstName;
		private String lastName;
		private String branch;

		public Key(String firstName, String lastName, String branch){
			this.firstName = firstName;
			this.lastName = lastName;
			this.branch = branch;

			System.out.println("Key created: " + this.toString());
		}

		public String getFirstName(){
			return this.firstName;
		}

		public String getLastName(){
			return this.lastName;
		}

		public String getBranch(){
			return this.branch;
		}

		/*
		   Javac generates compiler error: non-static variable this cannot be referenced from a static context

		   while compiling the getOuterClass() method
		*/
		/*
		public CustomerDetails getOuterClass(){
			return CustomerDetails.this;
		}
		*/

		@Override
		public String toString(){
			return this.firstName + " " + this.lastName + " in Branch " + this.branch; 
		}

		@Override
		public boolean equals(Object obj){
			if (this == obj)
				return true;

			if ( obj == null )
				return false;

			if ( this.getClass() != obj.getClass() ){
				return false;
			}

			Key keyObj = (Key) obj;

			if ( this.getFirstName().equals(keyObj.getFirstName()) &&
					this.getLastName().equals(keyObj.getLastName()) && 
					this.getBranch().equals(keyObj.getBranch())
					){
				return true;
			}

			return false;
		}
		
		@Override
		public int hashCode(){
			return this.firstName.hashCode() + this.lastName.hashCode() + this.branch.hashCode();
		}
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :
				Example to demonstrate Comparable and Comparator.

				Comparable interface has a method compareTo.

				A class can be created, that implements the comparator interface.
				Or an anynomous class object can also be created.

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package collections;

/* Import Libraries **************************************************************************
 * @{
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Main{

	/*	Creating anonymous inner class
	   */
	public static Comparator<Student> percentRank = new Comparator<Student>(){

		// Both the objects to be comapred are of type Student
		@Override
		public int compare(Student s1, Student s2){
			double percentS1, percentS2;
			final double CENT = 100;
			final double TOTAL = 400;
			double sum=0;

			sum = s1.getMathScore();
			sum += s1.getPhysicsScore();
			sum += s1.getChemistryScore();
			sum += s1.getBiologyScore();

			percentS1 = (sum/TOTAL) * CENT;

			sum = s2.getMathScore();
            sum += s2.getPhysicsScore();
            sum += s2.getChemistryScore();
            sum += s2.getBiologyScore();

			percentS2 = (sum/TOTAL) * CENT;

			System.out.println(s1.getName() + " scored percent[" + percentS1 + "] " + 
								s2.getName() + " scored percent[" + percentS2 + "] ");
			if ( percentS1 > percentS1 ){
				return 1;
			}else if (percentS1 > percentS1 ){
                return -1;
			}	

			return 0;
		}
	};

	// Declaring new Comparator and initializing it in the static block
	public static Comparator<Student> mathRank;

	static{
		mathRank = new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2){
				if ( s1.getMathScore() > s2.getMathScore()){
					return 1;
				}else if (s1.getMathScore() < s2.getMathScore()){
					return -1;
				}

				return 0;
			}
		};
	}
	
	public static void main(String[] args){
		List<Student> classroom1 = new ArrayList<>();

		classroom1.add(new Student("Sachin"));
		classroom1.add(new Student("Saurav"));
		classroom1.add(new Student("Mithali"));
		classroom1.add(new Student("Rahul"));
		classroom1.add(new Student("Ajinkya"));
		classroom1.add(new Student("Javagal"));
		classroom1.add(new Student("Rohit"));
		classroom1.add(new Student("Harman"));

		System.out.println("Collection.sort methods, sorts the classroom1 arraylist using the comparision in the compareTo method. Sorting data now.");
		//Collections.sort(classroom1);
		
		int i=1;
		for (Student s: classroom1){
			// Fill random score 
			Random randomNumGen = new Random();
			s.setRollNo(i++);
			s.setScore(randomNumGen.nextInt(100), randomNumGen.nextInt(100), randomNumGen.nextInt(100), randomNumGen.nextInt(100));
			System.out.println(s.toString());
		}
		
		// Sorting by percentRank
		Collections.sort(classroom1, percentRank);
		i=1;
		for(Student s: classroom1){
			s.setRank(i++);
			System.out.println(s.toString());
		}

		// Creating shallow copy
		List<Student> classroom1_mathRank = new ArrayList<>(classroom1);

		System.out.println("Rank on basis of Math");
		Collections.sort(classroom1_mathRank, percentRank);
        i=1;
        for(Student s: classroom1_mathRank){
            s.setRank(i++);
            System.out.println(s.toString());
        }
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

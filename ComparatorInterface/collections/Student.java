/* *************************************** MAD Engineers ***************************************
  MAD Engineers
  Copyright (c) 2014

Description   :

Revision History **************************************************************************
** Date ** ** Coder ** ***** Remarks ******************************************************
* DDMMYY * ** madD7 ** * Originator                                                       *

*/

package collections;

/* Import Libraries **************************************************************************
 * @{
 */

/*
 * @}
 */



/* Functions ****************************************************************************** @{
 */

public class Student implements Comparable <Student> {
	private String name;
	private int rollNo;
	private int rank;
	private int mathScore;
	private int physicsScore;
	private int chemistryScore;
	private int biologyScore;

	public Student(String name){
		this.name = name;
		rollNo=0;
		rank=0;
		setMathScore(0);
        setPhysicsScore(0);
        setChemistryScore(0);
        setBiologyScore(0);
	}

	public Student(String name, int rollNo, int mathScore, int physicsScore, int chemistryScore, int biologyScore){
		this.name = name;
		this.rollNo = rollNo;
		rank=0;
		setMathScore(mathScore);
		setPhysicsScore(physicsScore);
		setChemistryScore(chemistryScore);
		setBiologyScore(biologyScore);
	}

	public void setScore(int mathScore, int physicsScore, int chemistryScore, int biologyScore){
		setMathScore(mathScore);
        setPhysicsScore(physicsScore);
        setChemistryScore(chemistryScore);
        setBiologyScore(biologyScore);
	}

	public void setMathScore(int mathScore){
		this.mathScore = mathScore;
	}

	public void setPhysicsScore(int physicsScore){
		this.physicsScore = physicsScore;
	}

	public void setChemistryScore(int chemistryScore){
		this.chemistryScore = chemistryScore;
	}

	public void setBiologyScore(int biologyScore){
		this.biologyScore = biologyScore;
	}

	public String getName(){
		return this.name;
	}

	public int getRollNo(){
		return this.rollNo;
	}

	public int getRank(){
		return this.rank;
	}

	public int getPhysicsScore(){
        return this.physicsScore;
    }

    public int getChemistryScore(){
        return this.chemistryScore;
    }

    public int getBiologyScore(){
        return this.biologyScore;
    }

	@Override
	public String toString(){
		return (this.rollNo + ". #" + this.rank + " " + this.name + 
				"score, Math[" + this.mathScore + 
				"] Physics[" + this.physicsScore + 
				"] Chemistry[" + this.chemistryScore + 
				"] Biology[" + this.biologyScore );
	}

	@Override
	public int compareTo(Student compareWith){
		return this.name.compareTo(compareWith.getName());
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

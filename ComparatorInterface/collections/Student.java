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

	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}

	public void setRank(int rank){
		this.rank = rank;
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
		return name;
	}

	public int getRollNo(){
		return rollNo;
	}

	public int getRank(){
		return rank;
	}

	public int getMathScore(){
		return mathScore;
	}

	public int getPhysicsScore(){
        return physicsScore;
    }

    public int getChemistryScore(){
        return chemistryScore;
    }

    public int getBiologyScore(){
        return biologyScore;
    }

	@Override
	public String toString(){
		return (this.rollNo + ". #" + this.rank + " " + this.name + 
				" Scores: Math[" + this.mathScore + 
				"] Physics[" + this.physicsScore + 
				"] Chemistry[" + this.chemistryScore + 
				"] Biology[" + this.biologyScore +"]");
	}

	@Override
	public int compareTo(Student compareWith){
		return this.name.compareTo(compareWith.getName());
	}
}
/* @}
 */

/* ~~~~~ END OF FILE ~~~~~ */

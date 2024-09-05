package models;

/**
 * @author GraceLowery
 * @version 1.0
 * @created 03-sep-2024 5:52:53 PM
 */
public class Admision {

	public Admision(){

	}

	/**
	 * 
	 * @param students
	 */
	public void calSchoolarship(Student students){
		students.setSchoolarship(students.getAverage()>=80);
	}

}//end Admision
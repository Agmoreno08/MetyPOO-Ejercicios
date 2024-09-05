package models;

/**
 * @author GraceLowery
 * @version 1.0
 * @created 03-sep-2024 5:52:03 PM
 */
public class Student {

	private float average;
	private String CARREAR;
	private int CIF;
	private String FIRTSNAME;
	private String LASTNAME;
	private boolean Schoolarship;

	public Student(){

	}

	public Student(float average, String CARREAR, int CIF, String FIRTSNAME, String LASTNAME, boolean schoolarship) {
		this.average = average;
		this.CARREAR = CARREAR;
		this.CIF = CIF;
		this.FIRTSNAME = FIRTSNAME;
		this.LASTNAME = LASTNAME;
		Schoolarship = schoolarship;
	}

	public float getAverage() {
		return average;
	}

	public String getCARREAR() {
		return CARREAR;
	}

	public int getCIF() {
		return CIF;
	}

	public String getFIRTSNAME() {
		return FIRTSNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public boolean isSchoolarship() {
		return Schoolarship;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public void setCARREAR(String CARREAR) {
		this.CARREAR = CARREAR;
	}

	public void setCIF(int CIF) {
		this.CIF = CIF;
	}

	public void setFIRTSNAME(String FIRTSNAME) {
		this.FIRTSNAME = FIRTSNAME;
	}

	public void setLASTNAME(String LASTNAME) {
		this.LASTNAME = LASTNAME;
	}

	public void setSchoolarship(boolean schoolarship) {
		Schoolarship = schoolarship;
	}
}//end STUDENT
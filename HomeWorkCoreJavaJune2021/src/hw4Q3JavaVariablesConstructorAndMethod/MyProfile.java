package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile { // opening of class body

	public String MyName; // variables declared - typical for all below
	public int myAge;
	public char mySex;
	public boolean usaCitizen;
	public byte myWorkingYear;
	public short myApartmentRent;
	public long myAnnualSalary;
	public float myGrade; // f letter is used in float type variable value
	public double myHeight;

	public MyProfile() { // default constructor declared
		System.out.println("This is called default constructor");
	}

	public void myProfile() { // void-method implemented
		System.out.println("My name is: " + MyName + "\n Age: " + myAge + "\n Sex: " + mySex
				+ "\t\r Am I a USCitizen? " + usaCitizen + "\n I worked for " + myWorkingYear + " " + "years "
				+ "\n My yearly house rent is: " + myApartmentRent + "\n My yearly salary: " + myAnnualSalary
				+ "\r\n My grade: " + myGrade + " and my height: " + myHeight);
	}// end of void-method

}// end of class body loop

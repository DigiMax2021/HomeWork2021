package hw4Q3JavaVariablesConstructorAndMethod;

public class TestMyProfile {

	public static void main(String[] args) {// main method implemented
		MyProfile manjur = new MyProfile(); // MyProfile class is instantiated by creating a new object "manjur". Default constructor is initialized
		manjur.MyName = "Manjur"; // initializing variable under main method by object or reference variable
		manjur.myAge = 30;
		manjur.mySex = 'M';
		manjur.usaCitizen = false;
		manjur.myWorkingYear = 6;
		manjur.myApartmentRent = 32000;
		manjur.myAnnualSalary = 62355278786l; // "l" letter is used in long type variable value
		manjur.myGrade = 3.122f; // f letter is used in float type variable value
		manjur.myHeight = 1.7636847628364;
		manjur.myProfile(); // void-method is initialized by object to execute the variables output in
							// console
		System.out.println(
				"****************************************************************************************************************");
//Repeating the above process for a second person data entry
		MyProfile trump = new MyProfile(); // MyProfile class is instantiated by creating a new object "trump"
		trump.MyName = "Trump"; // initializing variable under main method by object or reference variable
		trump.myAge = 75;
		trump.mySex = 'M';
		trump.usaCitizen = true;
		trump.myWorkingYear = 60;
		trump.myApartmentRent = 30000;
		trump.myAnnualSalary = 72355278776l;// l letter is used in long type variable value
		trump.myGrade = 1.162f; // f letter is used in float type variable value
		trump.myHeight = 6.0636847628467;
		trump.myProfile(); // void-method is initialized by object to execute the variables output in
							// console
		System.out.println(
				"****************************************************************************************************************");

	} // end of main method body

}// end of class body

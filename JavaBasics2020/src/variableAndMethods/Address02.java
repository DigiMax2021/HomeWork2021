package variableAndMethods;

public class Address02 {
	
	// Class Body
	// Class Body
	//Class Body Content
	//Variables - declared or Initialize
	//Constructor - declared or Initialize
	//Method - Implemented or Initialized  -- In class method is not declared unlike variables and constructors.
	
	static String Name = "Tofael"; //String inside "" and name with upper case
	static int age = 44; //no ""
	static char sex = 'M'; // char with ''
	static double grade = 3.876; //double no quotation

	public static void main(String[] args) { // Opening of Class Body
		 
		System.out.println(Name); // a non-static variable cannot initiate under a static name
		System.out.println(age);
		System.out.println(sex);		
		System.out.println(grade);
		System.out.println(Name + " " +age + " " +sex+ " " +grade); // " " are used for spacing
		System.out.println("My Name:  " +Name + ", My Age: " +age+ ", My Sex: " + sex + ", My Grade: " +grade);
	
	} //Closing of Class Body

}

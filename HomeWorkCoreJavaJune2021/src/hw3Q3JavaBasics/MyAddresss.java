package hw3Q3JavaBasics;

public class MyAddresss {

//	Class contains the following subsets: variable, constructor and main method

	/*
	 * Declaring variables A variable is holder for value in the form of different
	 * data types that are used in Java program. Each variable must be declared with
	 * a data type. Variable can be of different data types, but most commonly used
	 * are: Char, Int, String, Double, and Boolean.
	 */

	public static String Name = "Donald Trump"; // string type variable initialized in double quotation. Note, only
												// String Variable name starts with Uppercase letter

	public static int age = 71; // integer type variable initialized with no quotation. Variable name starts
								// with lower case

	public static int houseNumber = 625;
	public static char houseDirection = 'W'; // char variable declared with single quotation. Contains letter; variable
												// name starts with lowercase letter

	public static int stNumber = 57;
	public static String City = "New York";
	public static String State = "NY";
	public static int zipCode = 10010;
	public static double publicRating = 5.625; // double variable initialized with decimals. Variable name starts with
												// lower case

	public static boolean isMaga = true; // boolean variable initialized. Note, variable name starts with lowercase
											// first letter

	/*
	 * Implementing main method below. method has parenthesis unlike Class method
	 * with curly braces {} indicates implementation of that method method name must
	 * be in lower case and can be same as Class name with different case method can
	 * only be implemented, not declared
	 */
	public static void main(String[] args) {

		System.out.println("Name: " + Name + "\n" + "Age: " + age + "\n" + "Public Rating: " + publicRating
				+ "\nAddress: " + "\r" + houseNumber + houseDirection + " " + stNumber + "st \n" + City + ", " + State
				+ " " + zipCode); // Use of empty string " ", \n, \r to create line separation along with carriage
									// return as applicable for visual clarity in output console

		System.out.println("\r\nIs this your correct information?: " + isMaga); //return carriage next line
	}// end of main method, return to the class loop
}// end of class loop

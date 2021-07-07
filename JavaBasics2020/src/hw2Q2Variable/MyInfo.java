package hw2Q2Variable;

public class MyInfo {
	
	//Class contains the following subsets:
	//variable, constructor and main method
	
	//Declaring variables
	//A variable is holder for value in the form of different data types that are used in Java program. Each variable must be declared with a data type.
	//Variable can be of different data types, but most commonly used are: Char, Int, String, Double, and Boolean.
	
	public static String Name = "Donald Trump"; //string type variable initialized in double quotation. Note, only String Variable name starts with Uppercase letter
	public static int age = 71;  //integer type variable initialized with no quotation. Variable name starts with lower case
	public static int houseNumber = 625; 
	public static char houseDirection = 'W'; //char variable declared with single quotation. Contains letter; variable names starts with lowercase letter
	public static int stNumber = 57;
	public static String City = "New York" ;
	public static String State = "NY";
	public static int zipCode = 10010;
	public static double publicRating = 5.625; //double variable initialized with decimals. Variable name starts with lower case
	public static boolean IsMaga = true ; // boolean variable initialized. Note, variable name starts with upper-case first letter
	
	//implementing main method below
	public static void main(String[] args) {

		System.out.println("Name: "+ Name+ "\n" +"Age: "+ age + "\n"+"Public Rating: "+publicRating + "\nAddress: "+ "\r" + houseNumber+houseDirection+ " " +stNumber+ "st \n" + City+ ", " +State + " " + zipCode); // Use of empty string " ", \n, \r to create line separation along with carriage return as applicable for visual clarity in output console
		System.out.println("Are you the most incompetent and racist President in the US history?: " + IsMaga);			
	}// end of main method, return to the class loop
}// end of class loop

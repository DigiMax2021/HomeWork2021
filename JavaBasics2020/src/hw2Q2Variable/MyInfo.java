package hw2Q2Variable;

public class MyInfo {
	
	//Declaring variables
	//A variable is holder for value in the form of different data types that are used in Java program. Each variable must be declared with a data type.
	//Variable can be of different data types, but most commonly used are: Char, Int, String, Double, and Boolean.
	
	public static String Name = "Donald Trump"; //string type , variable declared in double quotation. Note, only String Variable name start with uppercase letter
	public static int age = 71;  //integer, no quotation
	public static int houseNumber = 625; 
	public static char houseDirection = 'W'; //char variable declared with single quotation
	public static int stNumber = 57;
	public static String City = "New York" ;
	public static String State = "NY";
	public static int zipCode = 10010;
	public static double publicRating = 5.625; //double variable with decimals
	public static boolean IsMaga = true ; // boolean variable declared. Note upper-case first letter
	
	//implementing main method below
	public static void main(String[] args) {

		System.out.println(Name+ "\n" + age + "\n"+publicRating + "\n"+houseNumber+houseDirection+ " " +stNumber+ "st \n" + City+ ", " +State + " " + zipCode);
		System.out.println("Are you the most stupid and racist President in the history?: " + IsMaga);			
	}
}

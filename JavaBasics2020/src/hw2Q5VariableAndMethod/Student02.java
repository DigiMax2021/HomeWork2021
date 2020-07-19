package hw2Q5VariableAndMethod;

public class Student02 {

	public static void main(String[] args) {
		
		//static String Id = "Maga2020"; Static variable cannot initalize under a static under in the loop
		//static boolean isGood = true; Static variable cannot initialize under a static method
		
		//Solution- non-static variable will automatically be converted into static variable under static main method without having to type static before the variables
		String Id = "Maga2020";
		boolean isGood = true;
		
		System.out.println("My Student Id: "+ Id);
		System.out.println("Am I the biggest asshole in class?: "+ isGood);

	}

}

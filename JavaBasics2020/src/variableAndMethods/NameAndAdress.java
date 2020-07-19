package variableAndMethods;

public class NameAndAdress {
	
	//we used static in earlier examples 
		
		public static String Name1; //variable declared, not used here. For reference only
		public static String Name = "Tofael"; //declared or initialized?
		public static int houseNumber = 625; //no ""
		public static char houseDirection = 'W'; // char with ''
		public static int stNumber = 57; //double no quotation
		public static String state = "NY";
		public static int zipCode = 10019;
		
		//this is a void type method, not a return type method shown above
		//method contain parenthesis, class doesn't
		//method name can be similar s class name, but not mandatory, like - nameAndAddress06
		//method implemented here when you see curly brace, it means method was implemented
		public static void myInfo() {  //rule for using Method. Method implemented
			
			System.out.println(Name +"\n"+houseNumber+houseDirection+" "+stNumber+"st \n"+state+" "+zipCode);
			
		}
		
		
		public static void main(String[] args) { // Method initialized below
			 
			myInfo(); //a non static method cannot be called by a static method, so we change the method
			//than a non static if variable can't be called by a static method
		
		} //Closing of method body

	}//closing of class


package javaBasics;

public class MyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Manjur Ahmed Shuvha");
		System.out.print("14703 88th Ave Apt B4");
		System.out.println("Jamaica, NY 11435"); //this merge will merge with the above
		System.out.println("Jamaica, NY 11435"); //adding a separate line
		
		//use of \n to move to next line or jump to second line if used before the statement
		System.out.println(
				"I have a question. \nIn Java, there are three clear rules on when to use each of the access modifiers, namely the default, public and private, \nwhile making class and interface, and dealing with inheritance? \nAns: \"I don't know\"");
		
		//use of \t tab
		System.out.println("\nMy name is Manjur, \tI am a NYC resident, \tLiving in Jamaica"); // use of \n to skip a line
		
		//use of \r, carriage return
		
		System.out.println("Manjur A. Shuvha, \t3472050772"); //use of \t in the following line
		System.out.println("\rManjur A. Shuvha, 3472050772"); //use of \r at the beginning to skip a line without using \t before the number
		System.out.println("\nManjur A. Shuvha, \t3472050772"); //use of \n to skip a line and \t to tab the number
		
		//String Concatenation
		
		System.out.println("\rManjur" + " Ahmed" + " Shuvha" + ", 29"); //note the spaces used and also \r at the beginning
		System.out.println("\"Manjur\""); //use of \" /"
		System.out.println("\'Manjur'"); //use of \' Note you DO NOT use \' for single apostrophe at the end
		System.out.println("\rMAGA!"); //use of \r to skip a line
		
		//This concludes HW#1 
	}
}

package hw2Q3Variable;

public class Student01 { //class initialized
	public String Id = "Maga2020";
	public boolean isGood = true;

	//public static void main(String[] args) {You cannot print non-static variable in Static Main Method without creating an object to instantiate a new class by calling a separate non static method with sys out print command to print the non-static variables.
	
//System.out.println("Id"); 
	//}  
	
	//Solution 1 : Creating an object and instantiating new class in main method to call 
	
		public void myInfo () { //Constructor declared. A non-static method is created. Note () only, no { unlike the main method
	
			System.out.println("My Student Id: "+ Id);
			System.out.println("Am I the biggest asshole in class?: "+ isGood);
	
	} //completing loop for the constructor
		
				
		public static void main(String[] args) { //new class is instantiated 
			
			Student01 myId = new Student01(); //Note new class name must match package class name above.
			myId.myInfo();
			
		}
}
		//Solution 2: declaring non-static variable inside main method and printing
		//public static void main(String[] args) {
		//public String Id = "Maga2020";
		//public boolean isGood = true;
		//System.out.println("My Student Id: "+ Id);
		//System.out.println("Am I the biggest asshole in class?: "+ isGood); }}


package hw4Q2Abstraction02;

public abstract class NursingSchool extends EngineeringSchool implements College, Hospital, University {
	//an abstract class can only inherit either an abstract class or a regular class using exacts keyword
	//an abstract class cannot inherit interface using extends keyword
		//an abstract class can inherit one or multiple interface using implements keyword
		//an abstract class cannot inherit another abstract class or a regular class using implements keyword
	public void hygiene() {// non-abstract method implemented
		System.out.println("This is non-abstract method in NursingSchool Class");
	}
	
	public abstract void caring(); //abstract method declared
}

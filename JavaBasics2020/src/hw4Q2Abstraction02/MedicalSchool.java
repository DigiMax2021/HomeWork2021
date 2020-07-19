package hw4Q2Abstraction02;

public abstract class MedicalSchool extends NursingSchool implements College, Hospital, University {
	
	//an abstract class can only inherit either an abstract class or a regular class using exacts keyword
		//an abstract class cannot inherit interface using extends keyword
			//an abstract class can inherit one or multiple interface using implements keyword
			//an abstract class cannot inherit another abstract class or a regular class using implements keyword

		public void biochemistryLab() { //non-abstract method
			System.out.println("We have Bio-Chem Lab");
		}
	public abstract void anatomyLab(); //abstract method declared using abstract keyword in method

}

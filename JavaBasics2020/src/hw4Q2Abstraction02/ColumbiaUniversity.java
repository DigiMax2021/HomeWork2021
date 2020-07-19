package hw4Q2Abstraction02;

public class ColumbiaUniversity extends NYUniversity { //a reg class is inherited
	
	//a regular class can only inherit either an abstract class or another regular class using exacts keyword
			//a regular class cannot inherit interface using extends keyword
		//Multiple inheritance is forbidden in java and also not permissible by extends command
	
				//a regular class can inherit one or multiple interface using implements keyword
				//a regular class cannot inherit an abstract class or another regular class using implements keyword
	
	
	public ColumbiaUniversity () { //default constructor implemented
		System.out.println("This is the default constructor of Columbia University Class");
	}
	
	public void chemistry() { //non-abstract method implemented
		System.out.println("This is Chemistry Method");
	}
	
	/*public abstract void biology() {// abstract method not implemented in regular class
		System.out.println("Math");
	}
	*/

}

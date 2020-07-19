package hw4Q2Abstraction02;

public class RockefellerUniversity  {
	//a regular class can only inherit either an abstract class or another regular class using exacts keyword
	//a regular class cannot inherit interface using extends keyword
	//No Class is inherited here
		//multiple inheritance is not permitted in java
	
	public RockefellerUniversity() {
		System.out.println("This is the default constructor of NY University Class");
	}
	
	public void maths() { //non-abstract method
		System.out.println("This is Maths Method");
	}
	
	/*public abstract void statistics() { //abstract class cannot be implemented in regular class
		System.out.println("Math");
	}
	*/

}


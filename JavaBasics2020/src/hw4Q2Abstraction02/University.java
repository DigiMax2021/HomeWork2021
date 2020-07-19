package hw4Q2Abstraction02;

public interface University extends College, Hospital { //inherited two other interfaces in the package using extends keyword
	
	/* Constructor cannot be used inside interface
 	public Maga() {
	System.out.println("Maga Constructor");}
	
	*Extends keyword is used in Interface Class to inherit one or more interfaces
	*Interface can only inherit one or more other interfaces, not regular or abstract class by extends keyword
	*
	*/
	public void classSize ();
	public void field();
	public void teacher(); 

}

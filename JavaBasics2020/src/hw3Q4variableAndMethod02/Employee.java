package hw3Q4variableAndMethod02;

public class Employee {
	public String Name; //non-static
	public int age;
	public char sex;
	public boolean usaCitizen;
	
	public void empInfo() {
		System.out.println("My Name: "+Name+", Age: "+age+ ", Sex: "+sex+ ", USA Citizen? "+usaCitizen);
	}

}

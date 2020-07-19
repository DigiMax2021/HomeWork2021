package hw2Q6VariableAndMethod;

public class Employee02 {
	
	public static String EmpName = "Kopa Samsu";
	public static int empId = 420;
	
	public static void empInfo () { //Constructor declared. 
			System.out.println("Employee Name: "+ EmpName);
			System.out.println("Employee ID: "+ empId);
	}
	public static void main(String[] args) {
		empInfo(); //Yes you can call the public static void empInfo () {} method under static main method to print the static variables.
	}
}
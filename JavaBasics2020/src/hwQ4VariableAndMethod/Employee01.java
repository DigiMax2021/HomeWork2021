package hwQ4VariableAndMethod;

public class Employee01 {
	
	public String EmpName = "Kopa Samsu";
	public int empId = 420;
	
	public void empInfo () { //Constructor declared. Note you cannot print non-static variable under this method
			System.out.println("Employee Name: "+ EmpName);
			System.out.println("Employee ID: "+ empId);
	
	}
		
		//an object is created under static main to instantiate a new class that will reference the constructor method.		
	public static void main(String[] args) { //new class is instantiated 
			
			Employee01 myInfo = new Employee01(); //Note new class name must match package class name above.
			myInfo.empInfo();
			
		}
} //closing class body


	
package hw3Q4variableAndMethod02;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.Name= "Tofael";
		employee.age = 44;
		employee.sex = 'M';
		employee.usaCitizen = false;
		employee.empInfo();
		
		Employee employee2 = new Employee();
		employee2.Name= "Trump";
		employee2.age = 72;
		employee2.sex = 'F';
		employee2.usaCitizen = true;
		employee2.empInfo();
	}

}

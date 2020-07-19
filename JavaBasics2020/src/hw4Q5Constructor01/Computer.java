package hw4Q5Constructor01;

public class Computer {
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;
	
	public Computer() {
		System.out.println("This is the default constructor of Computer Class");
	}
	
	public Computer (String brand, String model, String OS, int price, char grade, boolean inUSA) {
		this.Brand= brand;
		this.Model=model;
		this.OperatingSystem = OS;
		this.price = price;
		this.grade= grade;
		this.madeInUSA = inUSA;
		System.out.println("My Brand: "+ brand + "\nModel: "+ model+ "\nOperating System:  "+ OS + "\nPrice: $ "+ price + "\nGrade:  " + grade + "\nMade in USA?  " + inUSA );
	}
	
	public Computer (boolean inUSA, int price) {
		this.madeInUSA = inUSA;
		this.price = price;
		System.out.println("Made in USA?  "+ inUSA + ", Price: $ " + price);
		
	}
	
	public Computer(String brand) {
		this.Brand = brand;
		System.out.println("\nBrand Name: "+brand);
	}
	
	
	public Computer (String OS, char grade, String model) {
		this.OperatingSystem = OS;
		this.grade = grade; 
		this.Model = model;
		System.out.println(" Operating System: "+ OS + ", Grade: " +grade + ", Model Number:  " + model);
	}

	public Computer (String model, String brand, char grade , boolean inUSA, int price) {
		this.Model=model;
		this.Brand=brand;
		this.grade=grade;
		this.madeInUSA=inUSA;
		this.price=price;
		System.out.println(" Model: " + model + ", Brand: " +brand + ", Grade:  " +grade+ ", Made in USA?: " +inUSA + ", Price: $ " + price);	
	}

}

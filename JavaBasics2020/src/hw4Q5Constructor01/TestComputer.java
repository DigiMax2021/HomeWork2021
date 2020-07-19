package hw4Q5Constructor01;

public class TestComputer {

	public static void main(String[] args) {
		
		System.out.println("\n-----------------------------------------------------------------------------");
		Computer computer01 = new Computer();
		System.out.println("\n-----------------------------------------------------------------------------");
		Computer computer02 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'C', true);
		System.out.println("\n-----------------------------------------------------------------------------");
		Computer computer03 = new Computer(false, 900);
		System.out.println("\n-----------------------------------------------------------------------------");
		Computer computer04 = new Computer("Apple MackBook Air");
		System.out.println("\n-----------------------------------------------------------------------------");
		Computer computer05 = new Computer(" MacOS Mojave", 'D', "MacBook Air");
		System.out.println("\n-----------------------------------------------------------------------------");
		Computer computer06 = new Computer("XPS", "DELL", 'A', true, 2000);
		System.out.println("\n-----------------------------------------------------------------------------");
	}

}
